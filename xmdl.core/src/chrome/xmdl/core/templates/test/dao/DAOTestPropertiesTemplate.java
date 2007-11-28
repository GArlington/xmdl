package chrome.xmdl.core.templates.test.dao;

import chrome.xmdl.XClass;
import chrome.xmdl.XPackage;
import chrome.xmdl.xgen.*;
import chrome.xmdl.core.templates.test.dao.impl.DAOTestPropertiesTemplateImpl;

public class DAOTestPropertiesTemplate extends DAOTestPropertiesTemplateImpl implements TemplateConfiguration {

	public String targetFile(Object object) {
		XClass class1 = (XClass) object;
		StringBuffer buffer = new StringBuffer("test/src");
		XPackage package1 = class1.getXPackage();
		String t = package1.getName().replace(".", "/");
		if (!t.startsWith("/"))
			buffer.append("/");
		buffer.append(t);
		buffer.append("/dao/");
		buffer.append(class1.getName());
		buffer.append("DAOTest.properties");
		return buffer.toString();
	}

	public boolean accept(Object object) {
		return (object instanceof XClass);
	}

}
