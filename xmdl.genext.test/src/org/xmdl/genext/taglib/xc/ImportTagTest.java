package org.xmdl.genext.taglib.xc;

import org.osgi.framework.BundleException;
import org.xmdl.gen.util.Locator;
import org.xmdl.genext.BaseTemplateTestCase;
import org.xmdl.xgen.util.ResourceHelper;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XProject;


public class ImportTagTest extends BaseTemplateTestCase {

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

        final String templateClass = ImportTagTestTemplateCls.class.getName();
        setVariable("class", clazz);
        String output = runTemplate(templateClass);
        assertNotNull(output);
        String[] pieces = output.split("\\;");

        assertNotNull(pieces);
        assertEquals(3, pieces.length);
        
        assertEquals("import Prefix-org.xmdl.genext.test.Class1-Suffix", pieces[0].trim());
        assertEquals("import SomePattern", pieces[1].trim());
    }

    public void testPackageName() throws BundleException {

        final String templateClass = ImportTagTestTemplatePkg.class.getName();
        setVariable("package", pack);
        String output = runTemplate(templateClass);
        assertNotNull(output);
        String[] pieces = output.split("\\;");

        assertNotNull(pieces);
        assertEquals(3, pieces.length);
        
        assertEquals("import Prefix-org.xmdl.genext.test-Suffix", pieces[0].trim());
        assertEquals("import SomePattern", pieces[1].trim());
    }

    public void testEnumerationName() throws BundleException {

        final String templateClass = ImportTagTestTemplateEnm.class.getName();
        setVariable("enumeration", enumeration);
        String output = runTemplate(templateClass);
        assertNotNull(output);
        String[] pieces = output.split("\\;");

        assertNotNull(pieces);
        assertEquals(3, pieces.length);
        
        assertEquals("import Prefix-org.xmdl.genext.test.Enumeration1-Suffix", pieces[0].trim());
        assertEquals("import SomePattern", pieces[1].trim());
    }

}
