/**
 */
package add.provider;


import add.ADDDiagram;
import add.AddFactory;
import add.AddPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link add.ADDDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ADDDiagramItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADDDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AddPackage.Literals.ADD_DIAGRAM__SENSES);
			childrenFeatures.add(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS);
			childrenFeatures.add(AddPackage.Literals.ADD_DIAGRAM__OTHERS);
			childrenFeatures.add(AddPackage.Literals.ADD_DIAGRAM__LINKS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ADDDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ADDDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ADDDiagram_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ADDDiagram.class)) {
			case AddPackage.ADD_DIAGRAM__SENSES:
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
			case AddPackage.ADD_DIAGRAM__OTHERS:
			case AddPackage.ADD_DIAGRAM__LINKS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createSight()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createTouch()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createTaste()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createHear()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createSmell()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__SENSES,
				 AddFactory.eINSTANCE.createEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createData()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createAwareness()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createWidget()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createDevice()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__ELEMENTS,
				 AddFactory.eINSTANCE.createController()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__OTHERS,
				 AddFactory.eINSTANCE.createShare()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__OTHERS,
				 AddFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__LINKS,
				 AddFactory.eINSTANCE.createNormalLink()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__LINKS,
				 AddFactory.eINSTANCE.createSolidLink()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__LINKS,
				 AddFactory.eINSTANCE.createSolidGreyLink()));

		newChildDescriptors.add
			(createChildParameter
				(AddPackage.Literals.ADD_DIAGRAM__LINKS,
				 AddFactory.eINSTANCE.createDashLink()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return AddEditPlugin.INSTANCE;
	}

}
