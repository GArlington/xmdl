package org.xmdl.ida.templates.dao;

import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class EntityDAOImpl
{
  protected static String nl;
  public static synchronized EntityDAOImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityDAOImpl result = new EntityDAOImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".dao;" + NL;
  protected final String TEXT_3 = NL + "package ";
  protected final String TEXT_4 = ".dao;";
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL + "/**" + NL + " *" + NL + " * ";
  protected final String TEXT_7 = " DAO interface" + NL + " *  " + NL + " * $Id$" + NL + " *" + NL + " * @generated" + NL + " */ " + NL + "public interface ";
  protected final String TEXT_8 = "DAO extends GenericDao<";
  protected final String TEXT_9 = ", Long> {" + NL + "" + NL + "    Collection<";
  protected final String TEXT_10 = "> search(String name, Double fromPrice, Double toPrice, ProductType productType);" + NL + "    Collection<";
  protected final String TEXT_11 = "> search(";
  protected final String TEXT_12 = "Search searchBean);" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
    ClassHelper helper = XMDLClassHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    

    stringBuffer.append(TEXT_1);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_4);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_5);
    importManager.addImport("org.xmdl.ida.lib.dao.GenericDao");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.search.*");
    importManager.addImport("java.util.*");
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_6);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_12);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
