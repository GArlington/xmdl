package chrome.xmdl.core.templates.test.bo.impl;

import java.util.*;
import chrome.xmdl.*;
import chrome.xmdl.gen.util.*;
import org.eclipse.emf.codegen.util.*;

public class BOTestTemplateImpl
{
  protected static String nl;
  public static synchronized BOTestTemplateImpl create(String lineSeparator)
  {
    nl = lineSeparator;
    BOTestTemplateImpl result = new BOTestTemplateImpl();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "    " + NL + "    ";
  protected final String TEXT_2 = NL + "package ";
  protected final String TEXT_3 = ".bo;";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL;
  protected final String TEXT_6 = NL;
  protected final String TEXT_7 = NL + NL + "/**" + NL + " * @generated" + NL + " */" + NL + "public class ";
  protected final String TEXT_8 = "ServiceTest extends BaseServiceTest<";
  protected final String TEXT_9 = "> {" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    private static final Log LOGGER = LogFactory.getLog(";
  protected final String TEXT_10 = "ServiceTest.class);" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    private ";
  protected final String TEXT_11 = "Service ";
  protected final String TEXT_12 = "Service;" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    private DAO<";
  protected final String TEXT_13 = "> dao = null;" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void set";
  protected final String TEXT_14 = "Service(";
  protected final String TEXT_15 = "Service ";
  protected final String TEXT_16 = "Service) {" + NL + "        this.";
  protected final String TEXT_17 = "Service = ";
  protected final String TEXT_18 = "Service;" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void setDAO(";
  protected final String TEXT_19 = "DAO dao) {" + NL + "        this.dao = dao;" + NL + "    }";
  protected final String TEXT_20 = NL + "\t/**" + NL + "     * @generated " + NL + "     */ " + NL + "    public ";
  protected final String TEXT_21 = " populate(";
  protected final String TEXT_22 = " ";
  protected final String TEXT_23 = ") throws Exception {";
  protected final String TEXT_24 = NL + "        ";
  protected final String TEXT_25 = "=super.populate(";
  protected final String TEXT_26 = ");";
  protected final String TEXT_27 = NL + "        ";
  protected final String TEXT_28 = "Service ";
  protected final String TEXT_29 = "Service = (";
  protected final String TEXT_30 = "Service) applicationContext.getBean(\"";
  protected final String TEXT_31 = "Service\");";
  protected final String TEXT_32 = NL + "        ";
  protected final String TEXT_33 = " ";
  protected final String TEXT_34 = " = new ";
  protected final String TEXT_35 = "ServiceTest().populate(";
  protected final String TEXT_36 = "Service.get";
  protected final String TEXT_37 = "DAO(),identifier);";
  protected final String TEXT_38 = NL + "        ";
  protected final String TEXT_39 = ".set";
  protected final String TEXT_40 = "(";
  protected final String TEXT_41 = ");" + NL + "        return ";
  protected final String TEXT_42 = ";" + NL + "    }    ";
  protected final String TEXT_43 = NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testSave() throws Exception {" + NL + "        List<";
  protected final String TEXT_44 = "> all = dao.findAll(identifier);" + NL + "        int size = all.size();" + NL;
  protected final String TEXT_45 = NL + "        ";
  protected final String TEXT_46 = " ";
  protected final String TEXT_47 = " = dao.newEntity();";
  protected final String TEXT_48 = NL + "        ";
  protected final String TEXT_49 = " = populate(";
  protected final String TEXT_50 = ");" + NL + "" + NL + "        Context ctx = new ContextBase();";
  protected final String TEXT_51 = "        " + NL + "        ctx.put(";
  protected final String TEXT_52 = "Service.";
  protected final String TEXT_53 = "_ID_KEY,";
  protected final String TEXT_54 = ".get";
  protected final String TEXT_55 = "().getID());";
  protected final String TEXT_56 = NL + "        ";
  protected final String TEXT_57 = NL + "        ";
  protected final String TEXT_58 = "Service.putEntity(ctx, ";
  protected final String TEXT_59 = ");" + NL + "" + NL + "        LOGGER.debug(\"Executing Service...\");";
  protected final String TEXT_60 = NL + "        ";
  protected final String TEXT_61 = "Service.save(ctx);" + NL + "        LOGGER.debug(\"Service executed. \");" + NL;
  protected final String TEXT_62 = NL + "        ";
  protected final String TEXT_63 = " = ";
  protected final String TEXT_64 = "Service.getEntity(ctx);" + NL + "        assertNotNull(";
  protected final String TEXT_65 = ");" + NL + "" + NL + "        List<";
  protected final String TEXT_66 = "> list = dao.findAll(identifier);" + NL + "        assertNotNull(list);" + NL + "        assertTrue(list.size() > 0);" + NL + "        assertTrue(list.size() > size);" + NL;
  protected final String TEXT_67 = NL + "        ";
  protected final String TEXT_68 = " ";
  protected final String TEXT_69 = "2 = dao.newEntity();";
  protected final String TEXT_70 = NL + "        ";
  protected final String TEXT_71 = "2 = populate(";
  protected final String TEXT_72 = "2);" + NL;
  protected final String TEXT_73 = NL + "        assertEquals(";
  protected final String TEXT_74 = "2.";
  protected final String TEXT_75 = "(), ";
  protected final String TEXT_76 = ".";
  protected final String TEXT_77 = "());";
  protected final String TEXT_78 = "        " + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testDelete() throws Exception {";
  protected final String TEXT_79 = NL + "        ";
  protected final String TEXT_80 = " ";
  protected final String TEXT_81 = " = dao.newEntity();";
  protected final String TEXT_82 = NL + "        ";
  protected final String TEXT_83 = " = populate(";
  protected final String TEXT_84 = ");" + NL + "" + NL + "        List<";
  protected final String TEXT_85 = "> all = dao.findAll(identifier);" + NL + "        int size = all.size();" + NL + "        dao.dbInsert(";
  protected final String TEXT_86 = ", identifier);" + NL + "" + NL + "        long id = ";
  protected final String TEXT_87 = ".getID();" + NL + "        Context ctx = new ContextBase();";
  protected final String TEXT_88 = NL + "        ";
  protected final String TEXT_89 = "Service.putID(ctx, id);" + NL + "\t\t";
  protected final String TEXT_90 = "        " + NL + "        ctx.put(";
  protected final String TEXT_91 = "Service.";
  protected final String TEXT_92 = "_ID_KEY,";
  protected final String TEXT_93 = ".get";
  protected final String TEXT_94 = "().getID());";
  protected final String TEXT_95 = NL + "\t\t" + NL + "        LOGGER.debug(\"Executing Service...\");";
  protected final String TEXT_96 = NL + "        ";
  protected final String TEXT_97 = "Service.delete(ctx);" + NL + "        LOGGER.debug(\"Service executed. \");" + NL;
  protected final String TEXT_98 = NL + "        ";
  protected final String TEXT_99 = " = dao.load(id, identifier);" + NL + "        assertNull(";
  protected final String TEXT_100 = ");" + NL + "" + NL + "        List<";
  protected final String TEXT_101 = "> list =  dao.findAll(identifier);" + NL + "        assertNotNull(list);" + NL + "        assertEquals(size, list.size());" + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testEdit() throws Exception {";
  protected final String TEXT_102 = NL + "        ";
  protected final String TEXT_103 = " ";
  protected final String TEXT_104 = " = dao.newEntity();";
  protected final String TEXT_105 = NL + "        ";
  protected final String TEXT_106 = " = populate(";
  protected final String TEXT_107 = ");" + NL + "        dao.dbInsert(";
  protected final String TEXT_108 = ", identifier);" + NL + "" + NL + "        Context ctx = new ContextBase();";
  protected final String TEXT_109 = NL + "        ";
  protected final String TEXT_110 = "Service.putEntity(ctx, ";
  protected final String TEXT_111 = ");";
  protected final String TEXT_112 = "        " + NL + "        ctx.put(";
  protected final String TEXT_113 = "Service.";
  protected final String TEXT_114 = "_ID_KEY,";
  protected final String TEXT_115 = ".get";
  protected final String TEXT_116 = "().getID());";
  protected final String TEXT_117 = NL + "        LOGGER.debug(\"Executing Service...\");";
  protected final String TEXT_118 = NL + "        ";
  protected final String TEXT_119 = "Service.edit(ctx);" + NL + "        LOGGER.debug(\"Service executed. \");" + NL + "" + NL + "        List<";
  protected final String TEXT_120 = "> list = ";
  protected final String TEXT_121 = "Service.getEntityList(ctx);" + NL + "        assertNotNull(list);";
  protected final String TEXT_122 = NL + "        ";
  protected final String TEXT_123 = " ";
  protected final String TEXT_124 = "2 = ";
  protected final String TEXT_125 = "Service.getEntity(ctx);";
  protected final String TEXT_126 = NL + "        assertEquals(";
  protected final String TEXT_127 = ".";
  protected final String TEXT_128 = "(), ";
  protected final String TEXT_129 = "2.";
  protected final String TEXT_130 = "());";
  protected final String TEXT_131 = "        " + NL + "    }" + NL + "" + NL + "    /**" + NL + "     * @generated" + NL + "     */" + NL + "    public void testSearch() throws Exception {" + NL + "        int size = 10;" + NL + "        for (int i = 0; i < size; i++) {";
  protected final String TEXT_132 = NL + "            ";
  protected final String TEXT_133 = " ";
  protected final String TEXT_134 = " = dao.newEntity();";
  protected final String TEXT_135 = NL + "            ";
  protected final String TEXT_136 = " = populate(";
  protected final String TEXT_137 = ");" + NL + "            dao.dbInsert(";
  protected final String TEXT_138 = ", identifier);" + NL + "        }" + NL;
  protected final String TEXT_139 = NL + "        ";
  protected final String TEXT_140 = "Search searchBean = new ";
  protected final String TEXT_141 = "SearchImpl();";
  protected final String TEXT_142 = NL + "        searchBean.set";
  protected final String TEXT_143 = "(";
  protected final String TEXT_144 = ");";
  protected final String TEXT_145 = "        " + NL + "" + NL + "        Context ctx = new ContextBase();";
  protected final String TEXT_146 = NL + "        ";
  protected final String TEXT_147 = "Service.putSearchBean(ctx, searchBean);" + NL + "        LOGGER.debug(\"Executing Service...\");";
  protected final String TEXT_148 = NL + "        ";
  protected final String TEXT_149 = "Service.search(ctx);" + NL + "        LOGGER.debug(\"Service executed. \");" + NL + "" + NL + "        List<";
  protected final String TEXT_150 = "> list = ";
  protected final String TEXT_151 = "Service.getEntityList(ctx);" + NL + "        assertNotNull(list);" + NL + "        assertEquals(size, list.size());" + NL + "    }" + NL + "    /**" + NL + "      * populate and save to db " + NL + "      * @param dao" + NL + "      * @param identifier" + NL + "      * @return" + NL + "      * @throws Exception" + NL + "      * @generated" + NL + "      */" + NL + "      public ";
  protected final String TEXT_152 = " populate(";
  protected final String TEXT_153 = "DAO dao,Identifier identifier) throws Exception {";
  protected final String TEXT_154 = NL + "        ";
  protected final String TEXT_155 = " ";
  protected final String TEXT_156 = " = dao.newEntity();";
  protected final String TEXT_157 = NL + "        ";
  protected final String TEXT_158 = " = populate(";
  protected final String TEXT_159 = ");" + NL + "        dao.dbInsert(";
  protected final String TEXT_160 = ",identifier);" + NL + "        return ";
  protected final String TEXT_161 = ";" + NL + "     }" + NL + "}\t" + NL + "\t ";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    XClass xClass = (XClass) argument;
    XPackage xPackage = xClass.getXPackage(); 
    ClassHelper helper = XMDLEntityHelper.INSTANCE;
    TestHelper testHelper = TestHelper.INSTANCE;
    org.apache.log4j.Logger.getLogger(getClass()).debug(" generate ");    
    
    ImportManager importManager=null;
    if (helper.getQualifiedName(xPackage) != null) {
    importManager = helper.makeImportManager(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(helper.getQualifiedName(xPackage));
    stringBuffer.append(TEXT_3);
    } else {
    importManager = helper.makeImportManager("");
    }
    stringBuffer.append(TEXT_4);
    importManager.addImport("java.util.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".model.impl.*");
    importManager.addImport(helper.getQualifiedName(xPackage)+".dao.*");
    importManager.addImport("chrome.xmdl.lib.test.*");
    importManager.addImport("chrome.xmdl.lib.dao.*");
    stringBuffer.append(TEXT_5);
    importManager.addImport("org.apache.commons.logging.*");
    importManager.addImport("org.apache.commons.chain.*");
    importManager.addImport("org.apache.commons.chain.impl.*");
    stringBuffer.append(TEXT_6);
    
    StringBuffer importStringBuffer = stringBuffer;
    int importInsertionPoint = stringBuffer.length();
    importManager.addCompilationUnitImports(stringBuffer.toString());

    stringBuffer.append(TEXT_7);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_8);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_13);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_17);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_19);
     if(MasterChildHelper.INST.isChild(xClass)){
     
    	String	masterName=MasterChildHelper.INST.getMaster(xClass).getName();
    	String	unCapMasterName=helper.uncapName(masterName);
    	
    
    stringBuffer.append(TEXT_20);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(unCapMasterName);
    stringBuffer.append(TEXT_29);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_30);
    stringBuffer.append(unCapMasterName);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(unCapMasterName);
    stringBuffer.append(TEXT_34);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(unCapMasterName);
    stringBuffer.append(TEXT_36);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_39);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_40);
    stringBuffer.append(unCapMasterName);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_46);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_47);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_49);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_50);
     if(MasterChildHelper.INST.isChild(xClass)){
     
    	String	masterName=MasterChildHelper.INST.getMaster(xClass).getName();    	    	    	
    	
    stringBuffer.append(TEXT_51);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_52);
    stringBuffer.append(helper.capAllName(masterName));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(MasterChildHelper.INST.getMaster(xClass).getName());
    stringBuffer.append(TEXT_55);
    }
    stringBuffer.append(TEXT_56);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_59);
    stringBuffer.append(TEXT_60);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_61);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_63);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_65);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_66);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_69);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_71);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_72);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_73);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_74);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_75);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_76);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_77);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_78);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_80);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_81);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_83);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_84);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_85);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_87);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_89);
     if(MasterChildHelper.INST.isChild(xClass)){
     
    	String	masterName=MasterChildHelper.INST.getMaster(xClass).getName();    	    	    	
    	
    stringBuffer.append(TEXT_90);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(helper.capAllName(masterName));
    stringBuffer.append(TEXT_92);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_93);
    stringBuffer.append(MasterChildHelper.INST.getMaster(xClass).getName());
    stringBuffer.append(TEXT_94);
    }
    stringBuffer.append(TEXT_95);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_97);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_99);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_100);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_101);
    stringBuffer.append(TEXT_102);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_103);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_104);
    stringBuffer.append(TEXT_105);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_106);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_107);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_108);
    stringBuffer.append(TEXT_109);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_110);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_111);
     if(MasterChildHelper.INST.isChild(xClass)){
     
    	String	masterName=MasterChildHelper.INST.getMaster(xClass).getName();    	    	    	
    	
    stringBuffer.append(TEXT_112);
    stringBuffer.append(masterName);
    stringBuffer.append(TEXT_113);
    stringBuffer.append(helper.capAllName(masterName));
    stringBuffer.append(TEXT_114);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(MasterChildHelper.INST.getMaster(xClass).getName());
    stringBuffer.append(TEXT_116);
    }
    stringBuffer.append(TEXT_117);
    stringBuffer.append(TEXT_118);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_119);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_120);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_121);
    stringBuffer.append(TEXT_122);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_123);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_124);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_125);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference()) {
    stringBuffer.append(TEXT_126);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_127);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_128);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_129);
    stringBuffer.append(helper.getGetAccessor(attribute));
    stringBuffer.append(TEXT_130);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_131);
    stringBuffer.append(TEXT_132);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_133);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_134);
    stringBuffer.append(TEXT_135);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_136);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_137);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_138);
    stringBuffer.append(TEXT_139);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_140);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_141);
    for (Iterator<XAttribute> i= xClass.getAttributes().iterator(); i.hasNext();) {
    XAttribute attribute = (XAttribute) i.next();
    if (attribute.getType() != null && !attribute.isReference() && !attribute.getType().isComparable()) {
    stringBuffer.append(TEXT_142);
    stringBuffer.append(helper.getAccessorName(attribute));
    stringBuffer.append(TEXT_143);
    stringBuffer.append(testHelper.randomValueStringTrimmed(attribute, 2));
    stringBuffer.append(TEXT_144);
    }//if (attribute.getType() !=null
    }//for
    stringBuffer.append(TEXT_145);
    stringBuffer.append(TEXT_146);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_147);
    stringBuffer.append(TEXT_148);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_149);
    stringBuffer.append(helper.getCapName(xClass));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_151);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_153);
    stringBuffer.append(TEXT_154);
    stringBuffer.append(xClass.getName());
    stringBuffer.append(TEXT_155);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_156);
    stringBuffer.append(TEXT_157);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_158);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_159);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_160);
    stringBuffer.append(helper.uncapName(xClass.getName()));
    stringBuffer.append(TEXT_161);
    importStringBuffer.insert(importInsertionPoint, importManager.computeSortedImports());
    return stringBuffer.toString();
  }
}
