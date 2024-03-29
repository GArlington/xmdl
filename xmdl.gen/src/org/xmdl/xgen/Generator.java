package org.xmdl.xgen;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jet.BodyContentWriter;
import org.eclipse.jet.BufferedJET2Writer;
import org.eclipse.jet.IWriterListener;
import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Platform;
import org.eclipse.jet.XPathContextExtender;
import org.eclipse.jet.transform.TransformContextExtender;
import org.xmdl.gen.mark.PlatformMarkManager;
import org.xmdl.gen.merge.FileMergeHandler;
import org.xmdl.meta.MetaModelHolder;
import org.xmdl.xgen.util.FileWriteIntegration;
import org.xmdl.xgen.util.IFileUtils;
import org.xmdl.xmdl.XProject;


public class Generator {

	private static final Logger LOGGER = Logger.getLogger(Generator.class);

	private XProject project;

	private List<GeneratorListener> listeners = new ArrayList<GeneratorListener>();
	
	public Generator(XProject project) {
		setProject(project);
	}

	/**
	 * @param project
	 *            The project to set.
	 */
	public void setProject(XProject project) {
		LOGGER.debug("Project set:" + project);
		this.project = project;
	}

	/**
	 * @return Returns the project.
	 */
	public XProject getProject() {
		return project;
	}

	/**
	 * Generates the source code
	 */
	public void generate(Platform platform) {
		XProject prj = getProject();
		String projectName = prj.getName();

		PlatformMarkManager markManager = new PlatformMarkManager("/" + projectName +
				"/");
		markManager.initialize(this);
		
		fireInitialized();
		LOGGER.info("Generating project : " + project);


		TaskFactory tf = platform.taskFactory();
		MetaModelHolder.initialize(project);
		List<EObject> roots = MetaModelHolder.getRoots(); 
		List<GenerationTask> gTasks = tf.createTasks(prj, roots);
		List<Task> preTasks = tf.createPredecessorTasks(prj, roots);
		List<Task> postTasks = tf.createSuccessorTasks(prj, roots);
		
		markManager.processTasks(preTasks);
		markManager.processTasks(postTasks);
		
		int size = gTasks != null ? gTasks.size() : 0;
		size += preTasks != null ? preTasks.size() : 0;
		size += postTasks != null ? postTasks.size() : 0;
		
		fireGenerationStarted(platform, size);

		// progressMonitor.beginTask("XMDL generate", tasks.size());
		LOGGER.debug("XMDL generate");

		FileWriteIntegration merger = new FileMergeHandler();

		run(preTasks, merger);
		generate(gTasks, merger);
		run(postTasks, merger);
		fireGenerationFinished();
		
		markManager.finish(this);
	}

	protected void run(List<Task> tasks, FileWriteIntegration writeIntegration) {
		if (tasks != null){
			for (Task task : tasks) {
				LOGGER.debug(" running task = " + task);
				task.run(writeIntegration);
			}
		}		
	}

	private void generate(List<GenerationTask> tasks, FileWriteIntegration writeIntegration) {
		for (Iterator<GenerationTask> iter = tasks.iterator(); iter.hasNext();) {
			GenerationTask task = iter.next();

			Template template = task.getTemplate();
            Object source = task.getSource();
            String targetFile = template.targetFile(source);

			LOGGER.debug("Generation File:" + targetFile);
			String targetDirectory ="";
			if(targetFile.lastIndexOf("/")>=0)
				targetDirectory = targetFile.substring(0, targetFile
					.lastIndexOf("/"));
			if (!targetDirectory.startsWith("/"))
				targetDirectory = "/" + targetDirectory;

			String targetBase = "/" + project.getName();
			LOGGER.debug("base:" + targetBase);
			targetDirectory = targetBase + targetDirectory;
			if (!targetFile.startsWith("/"))
				targetFile = "/" + targetFile;
			targetFile = targetBase + targetFile;
			try {
				IFileUtils.INST.createFolder(targetDirectory);
			} catch (CoreException e1) {
				LOGGER.error("Cannot create directory" + targetDirectory, e1);
			}
			
			// Perform generation
			try {
				String gen = runTemplate(template, source);
				InputStream generated = new ByteArrayInputStream(gen.getBytes());
				LOGGER.debug("file:" + targetFile);
				
				IFileUtils.INST.writeFile(generated, targetFile, writeIntegration);
				fireFileGenerated(targetFile);
			} catch (Exception e) {
				LOGGER.error("Exceptin generating file :" + targetFile, e);
			}
		}
	}

	public static String runTemplate(Template template, Object parameter) {
		final BufferedJET2Writer out = new BodyContentWriter();

		JET2Context context = new JET2Context(null);

		XPathContextExtender xpe = XPathContextExtender.getInstance(context);
		xpe.addCustomFunctions(JET2Platform.getInstalledXPathFunctions());

		TransformContextExtender.getInstance(context);
		String parameterName = template.parameterName();
		context.setVariable(parameterName, parameter);
		template.generate(context, out);

		final IWriterListener[] eventListeners = out.getEventListeners();
		for (int i = 0; i < eventListeners.length; i++) {
			eventListeners[i].finalizeContent(out, null);
		}

		String output = out.getContent();

		for (int i = 0; i < eventListeners.length; i++) {
			eventListeners[i].postCommitContent(out, output);
		}

		return output;
	}

    /**
	 * Writes contents of source into destination
	 * 
	 * @param reader
	 *            source
	 * @param file
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(Reader reader, File file) throws IOException {
		Writer w = new FileWriter(file);
		writeTo(reader, w);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param inputStream
	 *            source
	 * @param file
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(InputStream inputStream, File file) throws IOException {
		Writer w = new FileWriter(file);
		writeTo(inputStream, w);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param inputStream
	 *            source
	 * @param writer
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(InputStream inputStream, Writer writer)
			throws IOException {
		Reader reader = new BufferedReader(new InputStreamReader(inputStream));
		writeTo(reader, writer);
	}

	/**
	 * Writes contents of source into destination
	 * 
	 * @param reader
	 *            source
	 * @param writer
	 *            destination
	 * @throws IOException
	 */
	protected void writeTo(Reader reader, Writer writer) throws IOException {
		char[] buff = new char[8192];
		int i = reader.read(buff);
		while (i > 0) {
			writer.write(buff, 0, i);
			i = reader.read(buff);
		}
		writer.close();
	}


	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xmdl.xgen.Generator#addListener(org.xmdl.xgen.GeneratorListener)
	 */
	public void addListener(GeneratorListener l) {
		listeners.add(l);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xmdl.xgen.Generator#removeListener(org.xmdl.xgen.GeneratorListener)
	 */
	public void removeListener(GeneratorListener l) {
		listeners.remove(l);
	}

	protected void fireInitialized() {
		LOGGER.debug("Generation Initialized");
		InitializedEvent event = new InitializedEvent();
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationInitialized(event);
		}
	}

	protected void fireGenerationStarted(Platform platform, int size) {
		LOGGER.debug("Generation Started, size:" + size);
		GenerationStartedEvent event = new GenerationStartedEvent(platform, size);
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationStarted(event);
		}
	}

	protected void fireFileGenerated(String filePath) {
		LOGGER.debug("Generation progress");
		FileGeneratedEvent event = new FileGeneratedEvent(filePath);
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.fileGenerated(event);
		}
	}

	protected void fireGenerationFinished() {
		LOGGER.debug("Generation Finished");
		GenerationFinishedEvent event = new GenerationFinishedEvent();
		for (int i = 0; i < listeners.size(); i++) {
			GeneratorListener l = listeners.get(i);
			l.generationFinished(event);
		}
	}

}
