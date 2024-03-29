/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlPackageImpl.java,v 1.19 2006/02/27 07:21:34 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl.impl;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.XAssociationBehaviour;
import org.xmdl.xmdl.XAssociationType;
import org.xmdl.xmdl.XAttribute;
import org.xmdl.xmdl.XBase;
import org.xmdl.xmdl.XClass;
import org.xmdl.xmdl.XClassBehavior;
import org.xmdl.xmdl.XEnumeration;
import org.xmdl.xmdl.XEnumerationLiteral;
import org.xmdl.xmdl.XException;
import org.xmdl.xmdl.XMDLModel;
import org.xmdl.xmdl.XMethod;
import org.xmdl.xmdl.XModel;
import org.xmdl.xmdl.XPackage;
import org.xmdl.xmdl.XParameter;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.XType;
import org.xmdl.xmdl.XVisitor;
import org.xmdl.xmdl.XVisitorBase;
import org.xmdl.xmdl.XmdlFactory;
import org.xmdl.xmdl.XmdlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlPackageImpl extends EPackageImpl implements XmdlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xVisitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xVisitorBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmdlModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xEnumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xAssociationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xAssociationBehaviourEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xClassBehaviorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iPathEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparableEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.xmdl.xmdl.XmdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private XmdlPackageImpl() {
		super(eNS_URI, XmdlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated NOT
	 */
	public static XmdlPackage init() {
		if (isInited)
			return (XmdlPackage) EPackage.Registry.INSTANCE
					.getEPackage(XmdlPackage.eNS_URI);

		// Obtain or create and register package
		XmdlPackageImpl theXmdlPackage = (XmdlPackageImpl) (EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI) instanceof XmdlPackageImpl ? EPackage.Registry.INSTANCE
				.getEPackage(eNS_URI)
				: new XmdlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		//MappingPackage.eINSTANCE.eClass();
		//GenModelPackage.eINSTANCE.eClass();
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theXmdlPackage.createPackageContents();

		// Initialize created meta-data
		theXmdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theXmdlPackage.freeze();

		return theXmdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXAttribute() {
		return xAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_Name() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_Length() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_DefaultValue() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAttribute_XClass() {
		return (EReference) xAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAttribute_Type() {
		return (EReference) xAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_AssociationType() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_AssociationBehaviour() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXAttribute_Opposite() {
		return (EReference) xAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXAttribute_Navigable() {
		return (EAttribute) xAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXClass() {
		return xClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_XPackage() {
		return (EReference) xClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_SuperTypes() {
		return (EReference) xClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_Attributes() {
		return (EReference) xClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXClass_Methods() {
		return (EReference) xClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXClass_Comparable() {
		return (EAttribute) xClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXClass_Behavior() {
		return (EAttribute) xClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXPackage() {
		return xPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXPackage_Name() {
		return (EAttribute) xPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_Project() {
		return (EReference) xPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_Classes() {
		return (EReference) xPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXPackage_Enumerations() {
		return (EReference) xPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXProject() {
		return xProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXProject_Name() {
		return (EAttribute) xProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXProject_Packages() {
		return (EReference) xProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBase() {
		return xBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMethod() {
		return xMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMethod_Index() {
		return (EAttribute) xMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXMethod_Name() {
		return (EAttribute) xMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMethod_XClass() {
		return (EReference) xMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMethod_Type() {
		return (EReference) xMethodEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMethod_Parameters() {
		return (EReference) xMethodEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXMethod_Exceptions() {
		return (EReference) xMethodEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXParameter() {
		return xParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXParameter_Method() {
		return (EReference) xParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXParameter_Name() {
		return (EAttribute) xParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXParameter_Type() {
		return (EReference) xParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXException() {
		return xExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXException_JavaClass() {
		return (EAttribute) xExceptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXType() {
		return xTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXType_Name() {
		return (EAttribute) xTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXType_ClassName() {
		return (EAttribute) xTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXModel() {
		return xModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXVisitor() {
		return xVisitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXVisitorBase() {
		return xVisitorBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXMDLModel() {
		return xmdlModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnumeration() {
		return xEnumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumeration_XPackage() {
		return (EReference) xEnumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumeration_Literals() {
		return (EReference) xEnumerationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumeration_DefaultLiteral() {
		return (EReference) xEnumerationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXEnumerationLiteral() {
		return xEnumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXEnumerationLiteral_Enumeration() {
		return (EReference) xEnumerationLiteralEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumerationLiteral_Name() {
		return (EAttribute) xEnumerationLiteralEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXEnumerationLiteral_Value() {
		return (EAttribute) xEnumerationLiteralEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXAssociationType() {
		return xAssociationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXAssociationBehaviour() {
		return xAssociationBehaviourEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXClassBehavior() {
		return xClassBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIPath() {
		return iPathEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResource() {
		return resourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComparable() {
		return comparableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlFactory getXmdlFactory() {
		return (XmdlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		xProjectEClass = createEClass(XPROJECT);
		createEAttribute(xProjectEClass, XPROJECT__NAME);
		createEReference(xProjectEClass, XPROJECT__PACKAGES);

		xPackageEClass = createEClass(XPACKAGE);
		createEAttribute(xPackageEClass, XPACKAGE__NAME);
		createEReference(xPackageEClass, XPACKAGE__PROJECT);
		createEReference(xPackageEClass, XPACKAGE__CLASSES);
		createEReference(xPackageEClass, XPACKAGE__ENUMERATIONS);

		xClassEClass = createEClass(XCLASS);
		createEReference(xClassEClass, XCLASS__XPACKAGE);
		createEReference(xClassEClass, XCLASS__SUPER_TYPES);
		createEReference(xClassEClass, XCLASS__ATTRIBUTES);
		createEReference(xClassEClass, XCLASS__METHODS);
		createEAttribute(xClassEClass, XCLASS__COMPARABLE);
		createEAttribute(xClassEClass, XCLASS__BEHAVIOR);

		xEnumerationEClass = createEClass(XENUMERATION);
		createEReference(xEnumerationEClass, XENUMERATION__XPACKAGE);
		createEReference(xEnumerationEClass, XENUMERATION__LITERALS);
		createEReference(xEnumerationEClass, XENUMERATION__DEFAULT_LITERAL);

		xEnumerationLiteralEClass = createEClass(XENUMERATION_LITERAL);
		createEReference(xEnumerationLiteralEClass,
				XENUMERATION_LITERAL__ENUMERATION);
		createEAttribute(xEnumerationLiteralEClass, XENUMERATION_LITERAL__NAME);
		createEAttribute(xEnumerationLiteralEClass, XENUMERATION_LITERAL__VALUE);

		xAttributeEClass = createEClass(XATTRIBUTE);
		createEAttribute(xAttributeEClass, XATTRIBUTE__NAME);
		createEAttribute(xAttributeEClass, XATTRIBUTE__LENGTH);
		createEAttribute(xAttributeEClass, XATTRIBUTE__DEFAULT_VALUE);
		createEReference(xAttributeEClass, XATTRIBUTE__XCLASS);
		createEReference(xAttributeEClass, XATTRIBUTE__TYPE);
		createEAttribute(xAttributeEClass, XATTRIBUTE__ASSOCIATION_TYPE);
		createEAttribute(xAttributeEClass, XATTRIBUTE__ASSOCIATION_BEHAVIOUR);
		createEReference(xAttributeEClass, XATTRIBUTE__OPPOSITE);
		createEAttribute(xAttributeEClass, XATTRIBUTE__NAVIGABLE);

		xMethodEClass = createEClass(XMETHOD);
		createEAttribute(xMethodEClass, XMETHOD__INDEX);
		createEAttribute(xMethodEClass, XMETHOD__NAME);
		createEReference(xMethodEClass, XMETHOD__XCLASS);
		createEReference(xMethodEClass, XMETHOD__TYPE);
		createEReference(xMethodEClass, XMETHOD__PARAMETERS);
		createEReference(xMethodEClass, XMETHOD__EXCEPTIONS);

		xParameterEClass = createEClass(XPARAMETER);
		createEReference(xParameterEClass, XPARAMETER__METHOD);
		createEAttribute(xParameterEClass, XPARAMETER__NAME);
		createEReference(xParameterEClass, XPARAMETER__TYPE);

		xBaseEClass = createEClass(XBASE);

		xTypeEClass = createEClass(XTYPE);
		createEAttribute(xTypeEClass, XTYPE__NAME);
		createEAttribute(xTypeEClass, XTYPE__CLASS_NAME);

		xExceptionEClass = createEClass(XEXCEPTION);
		createEAttribute(xExceptionEClass, XEXCEPTION__JAVA_CLASS);

		xModelEClass = createEClass(XMODEL);

		xVisitorEClass = createEClass(XVISITOR);

		xVisitorBaseEClass = createEClass(XVISITOR_BASE);

		xmdlModelEClass = createEClass(XMDL_MODEL);

		// Create enums
		xAssociationTypeEEnum = createEEnum(XASSOCIATION_TYPE);
		xAssociationBehaviourEEnum = createEEnum(XASSOCIATION_BEHAVIOUR);
		xClassBehaviorEEnum = createEEnum(XCLASS_BEHAVIOR);

		// Create data types
		iPathEDataType = createEDataType(IPATH);
		uriEDataType = createEDataType(URI);
		resourceEDataType = createEDataType(RESOURCE);
		comparableEDataType = createEDataType(COMPARABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xProjectEClass.getESuperTypes().add(this.getXBase());
		xPackageEClass.getESuperTypes().add(this.getXBase());
		xClassEClass.getESuperTypes().add(this.getXBase());
		xClassEClass.getESuperTypes().add(this.getXType());
		xEnumerationEClass.getESuperTypes().add(this.getXBase());
		xEnumerationEClass.getESuperTypes().add(this.getXType());
		xEnumerationLiteralEClass.getESuperTypes().add(this.getXBase());
		xAttributeEClass.getESuperTypes().add(this.getXBase());
		xMethodEClass.getESuperTypes().add(this.getXBase());
		xParameterEClass.getESuperTypes().add(this.getXBase());
		xExceptionEClass.getESuperTypes().add(this.getXBase());
		xVisitorBaseEClass.getESuperTypes().add(this.getXVisitor());
		xmdlModelEClass.getESuperTypes().add(this.getXModel());

		// Initialize classes and features; add operations and parameters
		initEClass(xProjectEClass, XProject.class, "XProject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXProject_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XProject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXProject_Packages(), this.getXPackage(), this
				.getXPackage_Project(), "packages", null, 0, -1,
				XProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xPackageEClass, XPackage.class, "XPackage", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXPackage_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XPackage.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXPackage_Project(), this.getXProject(), this
				.getXProject_Packages(), "project", null, 1, 1, XPackage.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXPackage_Classes(), this.getXClass(), this
				.getXClass_XPackage(), "classes", null, 0, -1, XPackage.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXPackage_Enumerations(), this.getXEnumeration(), this
				.getXEnumeration_XPackage(), "enumerations", null, 0, -1,
				XPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xClassEClass, XClass.class, "XClass", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXClass_XPackage(), this.getXPackage(), this
				.getXPackage_Classes(), "xPackage", null, 1, 1, XClass.class,
				IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXClass_SuperTypes(), this.getXClass(), null,
				"superTypes", null, 0, -1, XClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXClass_Attributes(), this.getXAttribute(), this
				.getXAttribute_XClass(), "attributes", null, 0, -1,
				XClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXClass_Methods(), this.getXMethod(), this
				.getXMethod_XClass(), "methods", null, 0, -1, XClass.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXClass_Comparable(), ecorePackage.getEBoolean(),
				"comparable", null, 0, 1, XClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXClass_Behavior(), this.getXClassBehavior(),
				"behavior", "PERSISTED", 0, 1, XClass.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xEnumerationEClass, XEnumeration.class, "XEnumeration",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXEnumeration_XPackage(), this.getXPackage(), this
				.getXPackage_Enumerations(), "xPackage", null, 1, 1,
				XEnumeration.class, IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXEnumeration_Literals(), this
				.getXEnumerationLiteral(), this
				.getXEnumerationLiteral_Enumeration(), "literals", null, 0, -1,
				XEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXEnumeration_DefaultLiteral(), this
				.getXEnumerationLiteral(), null, "defaultLiteral", null, 1, 1,
				XEnumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xEnumerationLiteralEClass, XEnumerationLiteral.class,
				"XEnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXEnumerationLiteral_Enumeration(), this
				.getXEnumeration(), this.getXEnumeration_Literals(),
				"enumeration", null, 1, 1, XEnumerationLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXEnumerationLiteral_Name(),
				ecorePackage.getEString(), "name", null, 1, 1,
				XEnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXEnumerationLiteral_Value(), ecorePackage.getEInt(),
				"value", null, 1, 1, XEnumerationLiteral.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xAttributeEClass, XAttribute.class, "XAttribute",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXAttribute_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXAttribute_Length(), ecorePackage.getEInt(),
				"length", "15", 0, 1, XAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXAttribute_DefaultValue(), ecorePackage
				.getEJavaObject(), "defaultValue", null, 0, 1,
				XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXAttribute_XClass(), this.getXClass(), this
				.getXClass_Attributes(), "xClass", null, 1, 1,
				XAttribute.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXAttribute_Type(), this.getXType(), null, "type",
				null, 1, 1, XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXAttribute_AssociationType(), this
				.getXAssociationType(), "associationType", "OneToOne", 0, 1,
				XAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXAttribute_AssociationBehaviour(), this
				.getXAssociationBehaviour(), "associationBehaviour",
				"aggregation", 0, 1, XAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXAttribute_Opposite(), this.getXAttribute(), null,
				"opposite", null, 0, 1, XAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXAttribute_Navigable(), ecorePackage.getEBoolean(),
				"navigable", "false", 0, 1, XAttribute.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(xAttributeEClass, ecorePackage.getEBoolean(),
				"isReference", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xMethodEClass, XMethod.class, "XMethod", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMethod_Index(), ecorePackage.getEString(), "index",
				null, 0, 1, XMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXMethod_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXMethod_XClass(), this.getXClass(), this
				.getXClass_Methods(), "xClass", null, 1, 1, XMethod.class,
				IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXMethod_Type(), this.getXType(), null, "type", null,
				1, 1, XMethod.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXMethod_Parameters(), this.getXParameter(), this
				.getXParameter_Method(), "parameters", null, 0, -1,
				XMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getXMethod_Exceptions(), this.getXException(), null,
				"exceptions", null, 0, -1, XMethod.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xParameterEClass, XParameter.class, "XParameter",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXParameter_Method(), this.getXMethod(), this
				.getXMethod_Parameters(), "method", null, 1, 1,
				XParameter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getXParameter_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getXParameter_Type(), this.getXType(), null, "type",
				null, 1, 1, XParameter.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xBaseEClass, XBase.class, "XBase", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(xBaseEClass, ecorePackage.getEBoolean(),
				"accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXVisitor(), "visitor", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(xTypeEClass, XType.class, "XType", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXType_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, XType.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getXType_ClassName(), ecorePackage.getEString(),
				"className", null, 0, 1, XType.class, !IS_TRANSIENT,
				IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		addEOperation(xTypeEClass, ecorePackage.getEBoolean(), "isPrimitive",
				1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xTypeEClass, ecorePackage.getEBoolean(), "isBasic", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xTypeEClass, ecorePackage.getEInt(), "compareTo", 1,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXType(), "o", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(xTypeEClass, ecorePackage.getEBoolean(), "isComparable",
				1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(xExceptionEClass, XException.class, "XException",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		EGenericType g1 = createEGenericType(ecorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEAttribute(getXException_JavaClass(), g1, "javaClass",
				"java.lang.Exception", 1, 1, XException.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(xModelEClass, XModel.class, "XModel", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(xModelEClass, this.getURI(), "path", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getURI(), "modelURI", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xModelEClass, ecorePackage.getEObject(),
				"createRoot", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXProject(), "project", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getURI(), "uri", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xModelEClass, ecorePackage.getEObject(), "loadRoot",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXProject(), "project", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getResource(), "resource", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		addEOperation(xModelEClass, ecorePackage.getEString(), "name", 1, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(xVisitorEClass, XVisitor.class, "XVisitor", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXProject(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXProject(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXPackage(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXPackage(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXClass(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXClass(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXEnumeration(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXEnumeration(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitEnter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXMethod(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(),
				"visitLeave", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXMethod(), "x", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(), "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXAttribute(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(), "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXParameter(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(), "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXException(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = addEOperation(xVisitorEClass, ecorePackage.getEBoolean(), "visit",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getXEnumerationLiteral(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(xVisitorBaseEClass, XVisitorBase.class, "XVisitorBase",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmdlModelEClass, XMDLModel.class, "XMDLModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(xAssociationTypeEEnum, XAssociationType.class,
				"XAssociationType");
		addEEnumLiteral(xAssociationTypeEEnum,
				XAssociationType.ONE_TO_ONE_LITERAL);
		addEEnumLiteral(xAssociationTypeEEnum,
				XAssociationType.ONE_TO_MANY_LITERAL);
		addEEnumLiteral(xAssociationTypeEEnum,
				XAssociationType.MANY_TO_ONE_LITERAL);
		addEEnumLiteral(xAssociationTypeEEnum,
				XAssociationType.MANY_TO_MANY_LITERAL);

		initEEnum(xAssociationBehaviourEEnum, XAssociationBehaviour.class,
				"XAssociationBehaviour");
		addEEnumLiteral(xAssociationBehaviourEEnum,
				XAssociationBehaviour.AGGREGATION_LITERAL);
		addEEnumLiteral(xAssociationBehaviourEEnum,
				XAssociationBehaviour.COMPOSITION_LITERAL);

		initEEnum(xClassBehaviorEEnum, XClassBehavior.class, "XClassBehavior");
		addEEnumLiteral(xClassBehaviorEEnum, XClassBehavior.PERSISTED);
		addEEnumLiteral(xClassBehaviorEEnum, XClassBehavior.VIRTUAL);
		addEEnumLiteral(xClassBehaviorEEnum, XClassBehavior.EMBEDDABLE);

		// Initialize data types
		initEDataType(iPathEDataType, IPath.class, "IPath", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, org.eclipse.emf.common.util.URI.class,
				"URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(resourceEDataType, Resource.class, "Resource",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(comparableEDataType, Comparable.class, "Comparable",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //XmdlPackageImpl
