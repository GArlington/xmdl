package org.xmdl.core.templates.ui.web.jsp.part.impl;

import org.xmdl.xmdl.*;
import org.xmdl.gen.util.*;
import org.xmdl.core.util.*;

public class SearchFormFieldDoubleImpl
{
  protected static String nl;
  public static synchronized SearchFormFieldDoubleImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    SearchFormFieldDoubleImpl result = new SearchFormFieldDoubleImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "<layout:row>" + NL + "\t<layout:text name=\"";
  protected final String TEXT_2 = "Form\" property=\"";
  protected final String TEXT_3 = ".";
  protected final String TEXT_4 = "Min\" styleClass=\"";
  protected final String TEXT_5 = "Min\"  " + NL + "\t\tkey=\"";
  protected final String TEXT_6 = ".form.";
  protected final String TEXT_7 = "Min\" editType=\"formatDouble\" />" + NL + "\t<layout:text name=\"";
  protected final String TEXT_8 = "Form\" property=\"";
  protected final String TEXT_9 = ".";
  protected final String TEXT_10 = "Max\" styleClass=\"";
  protected final String TEXT_11 = "Max\"  " + NL + "\t\tkey=\"";
  protected final String TEXT_12 = ".form.";
  protected final String TEXT_13 = "Max\" editType=\"formatDouble\" />" + NL + "</layout:row>";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	XAttribute attrib = (XAttribute) argument;
	XClass xClass = attrib.getXClass();	
	ClassHelper helper = XMDLClassHelper.INSTANCE;
	String formName = UIHelper.formObject(xClass);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(formName);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_4);
    stringBuffer.append(helper.uncapSafeName(attrib));
    stringBuffer.append(TEXT_5);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_6);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_7);
    stringBuffer.append(formName);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.uncapSafeName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.uncapSafeName(attrib));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getObjectName(xClass));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(attrib.getName());
    stringBuffer.append(TEXT_13);
    return stringBuffer.toString();
  }
}