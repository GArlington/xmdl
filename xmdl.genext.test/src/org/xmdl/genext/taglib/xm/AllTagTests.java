package org.xmdl.genext.taglib.xm;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTagTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for org.xmdl.genext.taglib.xm");
        //$JUnit-BEGIN$
        suite.addTestSuite(IsChildTagTest.class);
        suite.addTestSuite(IsMasterTagTest.class);
        suite.addTestSuite(MasterClassNameTagTest.class);
        suite.addTestSuite(MasterAttributeNameTagTest.class);
        //$JUnit-END$
        return suite;
    }

}
