package org.xmdl.ida.templates.dao;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.gen.util.XMDLClassHelper;
import chrome.xmdl.xgen.Template;

/**
 * The Hibernate DAO template file
 * 
 * @author Hakan Dilek
 *
 */
public class EntityDAOHibernate extends EntityDAOImpl implements Template {

    public String targetFile(Object object) {
        XClass cls = (XClass) object;
        XPackage pkg = cls.getXPackage();
        StringBuffer buffer = new StringBuffer("core/src/main/java/");
        buffer.append(XMDLClassHelper.INSTANCE.getQualifiedPath(pkg));
        buffer.append("/dao/hibernate/");
        buffer.append(cls.getName());
        buffer.append(".java");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof XClass);
    }

}
