package org.xmdl.ida.templates.web.jsp;

import org.xmdl.xgen.Template;
import org.xmdl.xmdl.XProject;


/**
 * menu.jsp file for web module template file
 * 
 * @author Hakan Dilek
 * 
 */
public class MenuJSP extends MenuJSPImpl implements Template {

    @Override
    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer(
                "web/src/main/webapp/common/menu.jsp");
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
