/**
 * <copyright>
 * </copyright>
 *
 * $Id: XmdlItemProviderAdapterFactory.java,v 1.6 2006/02/10 09:32:59 tr001\tr1d2643 Exp $
 */
package org.xmdl.xmdl.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.xmdl.xmdl.util.XmdlAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XmdlItemProviderAdapterFactory extends XmdlAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "hd";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmdlItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XAttribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XAttributeItemProvider xAttributeItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XAttribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXAttributeAdapter() {
		if (xAttributeItemProvider == null) {
			xAttributeItemProvider = new XAttributeItemProvider(this);
		}

		return xAttributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XClassItemProvider xClassItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXClassAdapter() {
		if (xClassItemProvider == null) {
			xClassItemProvider = new XClassItemProvider(this);
		}

		return xClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XPackageItemProvider xPackageItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXPackageAdapter() {
		if (xPackageItemProvider == null) {
			xPackageItemProvider = new XPackageItemProvider(this);
		}

		return xPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XProject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XProjectItemProvider xProjectItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XProject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXProjectAdapter() {
		if (xProjectItemProvider == null) {
			xProjectItemProvider = new XProjectItemProvider(this);
		}

		return xProjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XMethod} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMethodItemProvider xMethodItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XMethod}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMethodAdapter() {
		if (xMethodItemProvider == null) {
			xMethodItemProvider = new XMethodItemProvider(this);
		}

		return xMethodItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XParameterItemProvider xParameterItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXParameterAdapter() {
		if (xParameterItemProvider == null) {
			xParameterItemProvider = new XParameterItemProvider(this);
		}

		return xParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XException} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XExceptionItemProvider xExceptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XException}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXExceptionAdapter() {
		if (xExceptionItemProvider == null) {
			xExceptionItemProvider = new XExceptionItemProvider(this);
		}

		return xExceptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XVisitorBase} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XVisitorBaseItemProvider xVisitorBaseItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XVisitorBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXVisitorBaseAdapter() {
		if (xVisitorBaseItemProvider == null) {
			xVisitorBaseItemProvider = new XVisitorBaseItemProvider(this);
		}

		return xVisitorBaseItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XMDLModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMDLModelItemProvider xmdlModelItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XMDLModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXMDLModelAdapter() {
		if (xmdlModelItemProvider == null) {
			xmdlModelItemProvider = new XMDLModelItemProvider(this);
		}

		return xmdlModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XEnumeration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XEnumerationItemProvider xEnumerationItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XEnumeration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXEnumerationAdapter() {
		if (xEnumerationItemProvider == null) {
			xEnumerationItemProvider = new XEnumerationItemProvider(this);
		}

		return xEnumerationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.xmdl.xmdl.XEnumerationLiteral} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XEnumerationLiteralItemProvider xEnumerationLiteralItemProvider;

	/**
	 * This creates an adapter for a {@link org.xmdl.xmdl.XEnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createXEnumerationLiteralAdapter() {
		if (xEnumerationLiteralItemProvider == null) {
			xEnumerationLiteralItemProvider = new XEnumerationLiteralItemProvider(
					this);
		}

		return xEnumerationLiteralItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory
				.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(
			ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class)
					|| (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (xProjectItemProvider != null)
			xProjectItemProvider.dispose();
		if (xPackageItemProvider != null)
			xPackageItemProvider.dispose();
		if (xClassItemProvider != null)
			xClassItemProvider.dispose();
		if (xEnumerationItemProvider != null)
			xEnumerationItemProvider.dispose();
		if (xEnumerationLiteralItemProvider != null)
			xEnumerationLiteralItemProvider.dispose();
		if (xAttributeItemProvider != null)
			xAttributeItemProvider.dispose();
		if (xMethodItemProvider != null)
			xMethodItemProvider.dispose();
		if (xParameterItemProvider != null)
			xParameterItemProvider.dispose();
		if (xExceptionItemProvider != null)
			xExceptionItemProvider.dispose();
		if (xVisitorBaseItemProvider != null)
			xVisitorBaseItemProvider.dispose();
		if (xmdlModelItemProvider != null)
			xmdlModelItemProvider.dispose();
	}

}
