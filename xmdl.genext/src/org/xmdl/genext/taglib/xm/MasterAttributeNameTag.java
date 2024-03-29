package org.xmdl.genext.taglib.xm;

import org.eclipse.jet.JET2Context;
import org.eclipse.jet.JET2Writer;
import org.eclipse.jet.taglib.JET2TagException;
import org.eclipse.jet.taglib.TagInfo;
import org.xmdl.genext.taglib.BaseEmptyTag;
import org.xmdl.genext.taglib.ClassTagUtils;
import org.xmdl.genext.taglib.MetadataTagUtils;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XClass;

/**
 * This tag checks whether the given element is a Master attribute or class.
 * 
 * @author Hakan Dilek
 * 
 */
public class MasterAttributeNameTag extends BaseEmptyTag {

	@Override
	public void doAction(TagInfo td, JET2Context context, JET2Writer out)
			throws JET2TagException {
		Object object = fetchObject(context, "element");

		boolean capitalize = false;
		try {
			String cap = fetchAttribute("cap");
			capitalize = Boolean.parseBoolean(cap);
		} catch (Exception e) {
			// skip
		}

		String eval = "";
		if (object instanceof XClass) {
			XClass xClass = (XClass) object;
			if (MetadataTagUtils.isChild(xClass)) {
				XAttribute attrib = MetadataTagUtils
						.getMasterPointerAttribute(xClass);
				eval = capitalize ? ClassTagUtils.capName(attrib)
						: ClassTagUtils.uncapName(attrib);
			}
		}
		out.write(eval);
	}

}
