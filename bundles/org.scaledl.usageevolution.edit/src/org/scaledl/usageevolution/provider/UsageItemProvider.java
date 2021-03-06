/**
 */
package org.scaledl.usageevolution.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.palladiosimulator.pcm.core.entity.provider.EntityItemProvider;
import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageevolutionFactory;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * This is the item provider adapter for a {@link org.scaledl.usageevolution.Usage} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 *
 * @generated
 */
public class UsageItemProvider extends EntityItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public UsageItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addLoadEvolutionPropertyDescriptor(object);
			addScenarioPropertyDescriptor(object);
			addRepeatingPatternPropertyDescriptor(object);
			addEvolutionStepWidthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Load Evolution feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addLoadEvolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Usage_loadEvolution_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Usage_loadEvolution_feature", "_UI_Usage_type"),
				UsageevolutionPackage.Literals.USAGE__LOAD_EVOLUTION, true,
				false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Scenario feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addScenarioPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Usage_scenario_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Usage_scenario_feature", "_UI_Usage_type"),
				UsageevolutionPackage.Literals.USAGE__SCENARIO, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Repeating Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepeatingPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_Usage_repeatingPattern_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Usage_repeatingPattern_feature",
								"_UI_Usage_type"),
						UsageevolutionPackage.Literals.USAGE__REPEATING_PATTERN,
						true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Evolution Step Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionStepWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Usage_evolutionStepWidth_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Usage_evolutionStepWidth_feature",
						"_UI_Usage_type"),
				UsageevolutionPackage.Literals.USAGE__EVOLUTION_STEP_WIDTH,
				true, false, false, ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate
	 * feature for an {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(UsageevolutionPackage.Literals.USAGE__WORK_EVOLUTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Usage.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Usage"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Usage) object).getEntityName();
		return label == null || label.length() == 0 ? getString("_UI_Usage_type")
				: getString("_UI_Usage_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Usage.class)) {
		case UsageevolutionPackage.USAGE__REPEATING_PATTERN:
		case UsageevolutionPackage.USAGE__EVOLUTION_STEP_WIDTH:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors
				.add(createChildParameter(
						UsageevolutionPackage.Literals.USAGE__WORK_EVOLUTIONS,
						UsageevolutionFactory.eINSTANCE
								.createWorkParameterEvolution()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UsageevolutionEditPlugin.INSTANCE;
	}

}
