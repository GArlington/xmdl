package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XProject;


public class UncapitalizeTagTest extends BaseTemplateTestCase {

    private XClass clazz;
    private XAttribute attribute;
    private XEnumeration enumeration;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        clazz = Locator.locateClass(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class1");
        attribute = Locator.locateAttribute(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class1/attribute1");
        enumeration = Locator.locateEnumeration(project,
                "xmdl.genext.test/org.xmdl.genext.test/Enumeration1");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        clazz = null;
        attribute = null;
        enumeration = null;
    }

    public void testClassNameCap() throws BundleException {

        final String templateClass = UncapitalizeTagTestTemplateCls.class.getName();
        setVariable("xClass", clazz);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":class1;", output.trim());
    }

    public void testAttributeNameCap() throws BundleException {

        final String templateClass = UncapitalizeTagTestTemplateAtt.class.getName();
        setVariable("attribute", attribute);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":attribute1;", output.trim());
    }

    public void testEnumerationNameCap() throws BundleException {

        final String templateClass = UncapitalizeTagTestTemplateEnm.class.getName();
        setVariable("enumeration", enumeration);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":enumeration1;", output.trim());
    }

}
