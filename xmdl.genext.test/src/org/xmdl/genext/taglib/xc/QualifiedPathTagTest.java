package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;


public class QualifiedPathTagTest extends BaseTemplateTestCase {

    private XPackage pack;
    private XClass clazz;
    private XEnumeration enumeration;

    protected void setUp() throws Exception {
        super.setUp();
        XProject project = ResourceHelper.loadProject("model/test.xmdl");
        clazz = Locator.locateClass(project,
                "xmdl.genext.test/org.xmdl.genext.test/Class1");
        pack = Locator.locatePackage(project,
                "xmdl.genext.test/org.xmdl.genext.test");
        enumeration = Locator.locateEnumeration(project,
                "xmdl.genext.test/org.xmdl.genext.test/Enumeration1");
    }

    protected void tearDown() throws Exception {
        super.tearDown();
        clazz = null;
        pack = null;
        enumeration = null;
    }

    public void testClassName() throws BundleException {

        final String templateClass = QualifiedPathTagTestTemplateCls.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org/xmdl/genext/test/Class1;", output.trim());
    }

    public void testPackageOfClass() throws BundleException {

        final String templateClass = QualifiedPathTagTestTemplateClsPkg.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org/xmdl/genext/test;", output.trim());
    }

    public void testPackageName() throws BundleException {

        final String templateClass = QualifiedPathTagTestTemplatePkg.class.getName();
        setVariable("package", pack);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org/xmdl/genext/test;", output.trim());
    }

    public void testEnumerationName() throws BundleException {

        final String templateClass = QualifiedPathTagTestTemplateEnm.class.getName();
        setVariable("enumeration", enumeration);
        String output = runTemplate(templateClass);

        assertNotNull(output);
        assertEquals(":org/xmdl/genext/test/Enumeration1;", output.trim());
    }

}
