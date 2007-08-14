/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMDLBOModelImpl.java,v 1.2 2006/01/19 12:21:22 tr001\tr1d2643 Exp $
 */
package chrome.xmdlbo.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;

import chrome.xmdl.XProject;
import chrome.xmdl.init.Initializer;
import chrome.xmdlbo.BModel;
import chrome.xmdlbo.XMDLBOModel;
import chrome.xmdlbo.XmdlboFactory;
import chrome.xmdlbo.XmdlboPackage;
import chrome.xmdlbo.init.XMDLBOInitializer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMDLBO Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class XMDLBOModelImpl extends EObjectImpl implements XMDLBOModel {
	private XMDLBOInitializer initializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMDLBOModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return XmdlboPackage.eINSTANCE.getXMDLBOModel();
	}

	/**
	 * @model
	 */
	public URI path(URI modelURI) {
		URI uri = modelURI.trimFileExtension().appendFileExtension("xmdlbo");
		return uri;
	}

	/**
	 * @model
	 */
	public EObject createRoot(XProject project, URI uri) {
		BModel bModel = XmdlboFactory.eINSTANCE.createBModel();
		bModel.setXModel(uri.toString());
		return bModel;
	}

	/**
	 * @model
	 */
	public EObject loadRoot(XProject project, Resource resource) {
		List contents = resource.getContents();
		for (Iterator it = contents.iterator(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (element instanceof BModel) {
				BModel model = (BModel) element;
				return model;
			}
		}
		return null;
	}

	/**
	 * @model
	 */
	public String name() {
		return "xmdlbo";
	}

	/**
	 * @model
	 */
	public Initializer getInitializer() {
		if (initializer == null) {
			initializer = new XMDLBOInitializer();
		}
		return initializer;
	}

} //XMDLBOModelImpl
