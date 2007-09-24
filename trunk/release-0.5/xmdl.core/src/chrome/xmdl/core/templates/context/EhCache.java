package chrome.xmdl.core.templates.context;

import chrome.xmdl.XProject;
import chrome.xmdl.core.templates.context.impl.EhCacheImpl;
import chrome.xmdl.xgen.Template;

public class EhCache extends EhCacheImpl implements Template{

	public String targetFile(Object object) {
		StringBuffer buffer= new StringBuffer("rsc/");
		buffer.append("ehcache.xml");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XProject) ;
	}

}
