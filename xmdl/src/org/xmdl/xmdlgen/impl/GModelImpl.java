/**
 * <copyright>
 * </copyright>
 *
 * $Id: GModelImpl.java,v 1.2 2006/01/17 15:50:56 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdlgen.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdlgen.GModel;
import org.xmdl.xmdlgen.GPackage;
import org.xmdl.xmdlgen.XmdlgenPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GModel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xmdl.xmdlgen.impl.GModelImpl#getXProject <em>XProject</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GModelImpl#getXModel <em>XModel</em>}</li>
 *   <li>{@link org.xmdl.xmdlgen.impl.GModelImpl#getGPackages <em>GPackages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GModelImpl extends EObjectImpl implements GModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * The cached value of the '{@link #getXProject() <em>XProject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXProject()
	 * @generated
	 * @ordered
	 */
	protected XProject xProject;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected static final String XMODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXModel() <em>XModel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXModel()
	 * @generated
	 * @ordered
	 */
	protected String xModel = XMODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGPackages() <em>GPackages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<GPackage> gPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdlgenPackage.Literals.GMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject getXProject() {
		if (xProject != null && xProject.eIsProxy()) {
			InternalEObject oldXProject = (InternalEObject)xProject;
			xProject = (XProject)eResolveProxy(oldXProject);
			if (xProject != oldXProject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, XmdlgenPackage.GMODEL__XPROJECT, oldXProject, xProject));
			}
		}
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XProject basicGetXProject() {
		return xProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXProject(XProject newXProject) {
		XProject oldXProject = xProject;
		xProject = newXProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__XPROJECT, oldXProject, xProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getXModel() {
		return xModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXModel(String newXModel) {
		String oldXModel = xModel;
		xModel = newXModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XmdlgenPackage.GMODEL__XMODEL, oldXModel, xModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GPackage> getGPackages() {
		if (gPackages == null) {
			gPackages = new EObjectContainmentWithInverseEList<GPackage>(GPackage.class, this, XmdlgenPackage.GMODEL__GPACKAGES, XmdlgenPackage.GPACKAGE__GMODEL);
		}
		return gPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGPackages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return ((InternalEList<?>)getGPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				if (resolve) return getXProject();
				return basicGetXProject();
			case XmdlgenPackage.GMODEL__NAME:
				return getName();
			case XmdlgenPackage.GMODEL__XMODEL:
				return getXModel();
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return getGPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				setXProject((XProject)newValue);
				return;
			case XmdlgenPackage.GMODEL__NAME:
				setName((String)newValue);
				return;
			case XmdlgenPackage.GMODEL__XMODEL:
				setXModel((String)newValue);
				return;
			case XmdlgenPackage.GMODEL__GPACKAGES:
				getGPackages().clear();
				getGPackages().addAll((Collection<? extends GPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				setXProject((XProject)null);
				return;
			case XmdlgenPackage.GMODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XmdlgenPackage.GMODEL__XMODEL:
				setXModel(XMODEL_EDEFAULT);
				return;
			case XmdlgenPackage.GMODEL__GPACKAGES:
				getGPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case XmdlgenPackage.GMODEL__XPROJECT:
				return xProject != null;
			case XmdlgenPackage.GMODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XmdlgenPackage.GMODEL__XMODEL:
				return XMODEL_EDEFAULT == null ? xModel != null : !XMODEL_EDEFAULT.equals(xModel);
			case XmdlgenPackage.GMODEL__GPACKAGES:
				return gPackages != null && !gPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", xModel: ");
		result.append(xModel);
		result.append(')');
		return result.toString();
	}

} //GModelImpl
