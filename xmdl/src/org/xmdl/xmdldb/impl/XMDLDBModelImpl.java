/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.xmdl.xmdldb.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.xmdl.xmdl.XProject;
import org.xmdl.xmdl.init.Initializer;
import org.xmdl.xmdldb.DModel;
import org.xmdl.xmdldb.XMDLDBModel;
import org.xmdl.xmdldb.XmdldbFactory;
import org.xmdl.xmdldb.XmdldbPackage;
import org.xmdl.xmdldb.init.XMDLDBInitializer;

/**
 * <!-- begin-user-doc --> 
 * An implementation of the model object '<em><b>XMDLDB Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMDLDBModelImpl extends EObjectImpl implements XMDLDBModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	private Initializer initializer;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public XMDLDBModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XmdldbPackage.Literals.XMDLDB_MODEL;
	}

	//	/**
	//	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	//	 */
	//	public IPath path(IPath modelPath) {
	//		IPath path = modelPath.removeFileExtension().addFileExtension("xmdldb");
	//		return path;
	//	}

	/**
	 * @model
	 */
	public EObject createRoot(XProject project, URI uri) {
		DModel dModel = XmdldbFactory.eINSTANCE.createDModel();
		dModel.setXModel(uri.toString());
		return dModel;
	}

	/**
	 * @model
	 */
	public URI path(URI modelURI) {
		URI uri = modelURI.trimFileExtension().appendFileExtension("xmdldb");
		return uri;
	}

	/**
	 * @model
	 */
	public EObject loadRoot(XProject project, Resource resource) {
		List<EObject> contents = resource.getContents();
		for (Iterator<EObject> it = contents.iterator(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (element instanceof DModel) {
				DModel model = (DModel) element;
				return model;
			}
		}
		return null;
	}

	/**
	 * @model
	 */
	public Initializer getInitializer() {
		if (initializer == null) {
			initializer = new XMDLDBInitializer();
		}
		return initializer;
	}

	/**
	 * @model
	 */
	public String name() {
		return "xmdldb";
	}

} // XMDLDBModelImpl
