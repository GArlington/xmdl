package org.xmdl.ida.templates.eclipse;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * Eclipse project classpath template file
 * 
 * @author Hakan Dilek
 * 
 */
public class Classpath extends ClasspathImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer(".classpath");
		return buffer.toString();
	}

	@Override
	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

	@Override
	public String parameterName() {
		return "project";
	}

}
