package org.xmdl.ida.templates.web.webinf;

import chrome.xmdl.XProject;
import chrome.xmdl.xgen.Template;

/**
 * resin-web.xml file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class ResinWebXML extends ResinWebXMLImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
        "web/src/main/webapp/WEB-INF/resin-web.xml");
        return buffer.toString();
    }

    @Override
    public boolean accept(Object object) {
        return object instanceof XProject;
    }

    @Override
    public String parameterName() {
        return "project";
    }

}
