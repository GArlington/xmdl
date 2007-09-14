package chrome.xmdl.core.templates.ui.web;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.ui.web.impl.IndexJSPImpl;
import chrome.xmdl.xgen.Template;

public class IndexJSP extends IndexJSPImpl implements Template {

	public String targetFile(Object object) {
		StringBuffer buffer = new StringBuffer("web/");		

		buffer.append("index.jsp");	
		
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject);
	}

}
