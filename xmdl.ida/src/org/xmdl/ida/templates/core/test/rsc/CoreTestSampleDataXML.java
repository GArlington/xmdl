package org.xmdl.ida.templates.core.test.rsc;

import org.xmdl.xgen.Template;
import org.xmdl.xmdldb.DModel;


/**
 * Sample data configuration template file
 * 
 * @author Hakan Dilek
 *
 */
public class CoreTestSampleDataXML extends SampleDataXMLImpl implements Template {

    public String targetFile(Object object) {
        StringBuffer buffer = new StringBuffer("core/src/test/resources/sample-data.xml");
        return buffer.toString();
    }

    public boolean accept(Object object) {
        return (object instanceof DModel);
    }

	@Override
	public String parameterName() {
		return "model";
	}

}
