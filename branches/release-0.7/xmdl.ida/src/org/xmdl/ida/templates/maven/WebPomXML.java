package org.xmdl.ida.templates.maven;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * Maven Configuration for core module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class WebPomXML extends WebPomXMLImpl
		implements Template {

	@Override
	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/pom.xml");
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
