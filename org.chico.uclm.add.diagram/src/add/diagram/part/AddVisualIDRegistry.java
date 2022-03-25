/*
* 
*/
package add.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import add.ADDDiagram;
import add.AddPackage;
import add.diagram.edit.parts.ADDDiagramEditPart;
import add.diagram.edit.parts.AreaEditPart;
import add.diagram.edit.parts.AreaTextEditPart;
import add.diagram.edit.parts.AwarenessAwarenessAreaCompartmentEditPart;
import add.diagram.edit.parts.AwarenessAwarenessDimensionCompartmentEditPart;
import add.diagram.edit.parts.AwarenessAwarenessElementCompartmentEditPart;
import add.diagram.edit.parts.AwarenessEditPart;
import add.diagram.edit.parts.AwarenessNameEditPart;
import add.diagram.edit.parts.ControllerEditPart;
import add.diagram.edit.parts.ControllerNameEditPart;
import add.diagram.edit.parts.DashLinkEditPart;
import add.diagram.edit.parts.DataDataDataCompartmentEditPart;
import add.diagram.edit.parts.DataEditPart;
import add.diagram.edit.parts.DataNameEditPart;
import add.diagram.edit.parts.DataxEditPart;
import add.diagram.edit.parts.DataxTextEditPart;
import add.diagram.edit.parts.DeviceEditPart;
import add.diagram.edit.parts.DeviceNameEditPart;
import add.diagram.edit.parts.DimensionEditPart;
import add.diagram.edit.parts.DimensionTextEditPart;
import add.diagram.edit.parts.ElementEditPart;
import add.diagram.edit.parts.ElementTextEditPart;
import add.diagram.edit.parts.EnvironmentEditPart;
import add.diagram.edit.parts.EnvironmentNameEditPart;
import add.diagram.edit.parts.EventEditPart;
import add.diagram.edit.parts.EventTextEditPart;
import add.diagram.edit.parts.FlowEditPart;
import add.diagram.edit.parts.FlowNameEditPart;
import add.diagram.edit.parts.HearEditPart;
import add.diagram.edit.parts.HearNameEditPart;
import add.diagram.edit.parts.InputEditPart;
import add.diagram.edit.parts.InputInputEventCompartmentEditPart;
import add.diagram.edit.parts.InputInputInteractionCompartmentEditPart;
import add.diagram.edit.parts.InputInputTemporalityCompartmentEditPart;
import add.diagram.edit.parts.InputNameEditPart;
import add.diagram.edit.parts.InteractionEditPart;
import add.diagram.edit.parts.InteractionTextEditPart;
import add.diagram.edit.parts.NormalLinkEditPart;
import add.diagram.edit.parts.OperationEditPart;
import add.diagram.edit.parts.OperationTextEditPart;
import add.diagram.edit.parts.OutputEditPart;
import add.diagram.edit.parts.OutputNameEditPart;
import add.diagram.edit.parts.OutputOutputOperationCompartmentEditPart;
import add.diagram.edit.parts.OutputOutputTemporalityCompartmentEditPart;
import add.diagram.edit.parts.ShareEditPart;
import add.diagram.edit.parts.ShareNameEditPart;
import add.diagram.edit.parts.SightEditPart;
import add.diagram.edit.parts.SightNameEditPart;
import add.diagram.edit.parts.SmellEditPart;
import add.diagram.edit.parts.SmellNameEditPart;
import add.diagram.edit.parts.SolidGreyLinkEditPart;
import add.diagram.edit.parts.SolidLinkEditPart;
import add.diagram.edit.parts.TasteEditPart;
import add.diagram.edit.parts.TasteNameEditPart;
import add.diagram.edit.parts.Time2EditPart;
import add.diagram.edit.parts.TimeEditPart;
import add.diagram.edit.parts.TimeText2EditPart;
import add.diagram.edit.parts.TimeTextEditPart;
import add.diagram.edit.parts.TouchEditPart;
import add.diagram.edit.parts.TouchNameEditPart;
import add.diagram.edit.parts.WidgetEditPart;
import add.diagram.edit.parts.WidgetNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class AddVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "org.chico.uclm.add.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ADDDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ADDDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return add.diagram.part.AddVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				AddDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AddPackage.eINSTANCE.getADDDiagram().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((ADDDiagram) domainElement)) {
			return ADDDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = add.diagram.part.AddVisualIDRegistry.getModelID(containerView);
		if (!ADDDiagramEditPart.MODEL_ID.equals(containerModelID) && !"add".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (ADDDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = add.diagram.part.AddVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ADDDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ADDDiagramEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getSight().isSuperTypeOf(domainElement.eClass())) {
				return SightEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getTouch().isSuperTypeOf(domainElement.eClass())) {
				return TouchEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getTaste().isSuperTypeOf(domainElement.eClass())) {
				return TasteEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getHear().isSuperTypeOf(domainElement.eClass())) {
				return HearEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getSmell().isSuperTypeOf(domainElement.eClass())) {
				return SmellEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getEnvironment().isSuperTypeOf(domainElement.eClass())) {
				return EnvironmentEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return InputEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getOutput().isSuperTypeOf(domainElement.eClass())) {
				return OutputEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getData().isSuperTypeOf(domainElement.eClass())) {
				return DataEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getAwareness().isSuperTypeOf(domainElement.eClass())) {
				return AwarenessEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getWidget().isSuperTypeOf(domainElement.eClass())) {
				return WidgetEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getDevice().isSuperTypeOf(domainElement.eClass())) {
				return DeviceEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getController().isSuperTypeOf(domainElement.eClass())) {
				return ControllerEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getShare().isSuperTypeOf(domainElement.eClass())) {
				return ShareEditPart.VISUAL_ID;
			}
			if (AddPackage.eINSTANCE.getFlow().isSuperTypeOf(domainElement.eClass())) {
				return FlowEditPart.VISUAL_ID;
			}
			break;
		case InputInputInteractionCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getInteraction().isSuperTypeOf(domainElement.eClass())) {
				return InteractionEditPart.VISUAL_ID;
			}
			break;
		case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getTime().isSuperTypeOf(domainElement.eClass())) {
				return TimeEditPart.VISUAL_ID;
			}
			break;
		case InputInputEventCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getEvent().isSuperTypeOf(domainElement.eClass())) {
				return EventEditPart.VISUAL_ID;
			}
			break;
		case OutputOutputTemporalityCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getTime().isSuperTypeOf(domainElement.eClass())) {
				return Time2EditPart.VISUAL_ID;
			}
			break;
		case OutputOutputOperationCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getOperation().isSuperTypeOf(domainElement.eClass())) {
				return OperationEditPart.VISUAL_ID;
			}
			break;
		case DataDataDataCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getDatax().isSuperTypeOf(domainElement.eClass())) {
				return DataxEditPart.VISUAL_ID;
			}
			break;
		case AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getArea().isSuperTypeOf(domainElement.eClass())) {
				return AreaEditPart.VISUAL_ID;
			}
			break;
		case AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getDimension().isSuperTypeOf(domainElement.eClass())) {
				return DimensionEditPart.VISUAL_ID;
			}
			break;
		case AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID:
			if (AddPackage.eINSTANCE.getElement().isSuperTypeOf(domainElement.eClass())) {
				return ElementEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = add.diagram.part.AddVisualIDRegistry.getModelID(containerView);
		if (!ADDDiagramEditPart.MODEL_ID.equals(containerModelID) && !"add".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (ADDDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = add.diagram.part.AddVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ADDDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ADDDiagramEditPart.VISUAL_ID:
			if (SightEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TasteEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (HearEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SmellEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (EnvironmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwarenessEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (WidgetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DeviceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControllerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ShareEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SightEditPart.VISUAL_ID:
			if (SightNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TouchEditPart.VISUAL_ID:
			if (TouchNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TasteEditPart.VISUAL_ID:
			if (TasteNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case HearEditPart.VISUAL_ID:
			if (HearNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SmellEditPart.VISUAL_ID:
			if (SmellNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EnvironmentEditPart.VISUAL_ID:
			if (EnvironmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputEditPart.VISUAL_ID:
			if (InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInputInteractionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInputTemporalityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputInputEventCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputEditPart.VISUAL_ID:
			if (OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputOutputTemporalityCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputOutputOperationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataEditPart.VISUAL_ID:
			if (DataNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataDataDataCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwarenessEditPart.VISUAL_ID:
			if (AwarenessNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case WidgetEditPart.VISUAL_ID:
			if (WidgetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DeviceEditPart.VISUAL_ID:
			if (DeviceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControllerEditPart.VISUAL_ID:
			if (ControllerNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ShareEditPart.VISUAL_ID:
			if (ShareNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case FlowEditPart.VISUAL_ID:
			if (FlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InteractionEditPart.VISUAL_ID:
			if (InteractionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeEditPart.VISUAL_ID:
			if (TimeTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EventEditPart.VISUAL_ID:
			if (EventTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Time2EditPart.VISUAL_ID:
			if (TimeText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OperationEditPart.VISUAL_ID:
			if (OperationTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataxEditPart.VISUAL_ID:
			if (DataxTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AreaEditPart.VISUAL_ID:
			if (AreaTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DimensionEditPart.VISUAL_ID:
			if (DimensionTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ElementEditPart.VISUAL_ID:
			if (ElementTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInputInteractionCompartmentEditPart.VISUAL_ID:
			if (InteractionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
			if (TimeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputInputEventCompartmentEditPart.VISUAL_ID:
			if (EventEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputOutputTemporalityCompartmentEditPart.VISUAL_ID:
			if (Time2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputOutputOperationCompartmentEditPart.VISUAL_ID:
			if (OperationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataDataDataCompartmentEditPart.VISUAL_ID:
			if (DataxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID:
			if (AreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID:
			if (DimensionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID:
			if (ElementEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (AddPackage.eINSTANCE.getNormalLink().isSuperTypeOf(domainElement.eClass())) {
			return NormalLinkEditPart.VISUAL_ID;
		}
		if (AddPackage.eINSTANCE.getSolidLink().isSuperTypeOf(domainElement.eClass())) {
			return SolidLinkEditPart.VISUAL_ID;
		}
		if (AddPackage.eINSTANCE.getSolidGreyLink().isSuperTypeOf(domainElement.eClass())) {
			return SolidGreyLinkEditPart.VISUAL_ID;
		}
		if (AddPackage.eINSTANCE.getDashLink().isSuperTypeOf(domainElement.eClass())) {
			return DashLinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(ADDDiagram element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case InputInputInteractionCompartmentEditPart.VISUAL_ID:
		case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
		case InputInputEventCompartmentEditPart.VISUAL_ID:
		case OutputOutputTemporalityCompartmentEditPart.VISUAL_ID:
		case OutputOutputOperationCompartmentEditPart.VISUAL_ID:
		case DataDataDataCompartmentEditPart.VISUAL_ID:
		case AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID:
		case AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID:
		case AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ADDDiagramEditPart.VISUAL_ID:
			return false;
		case SightEditPart.VISUAL_ID:
		case TouchEditPart.VISUAL_ID:
		case TasteEditPart.VISUAL_ID:
		case HearEditPart.VISUAL_ID:
		case SmellEditPart.VISUAL_ID:
		case EnvironmentEditPart.VISUAL_ID:
		case WidgetEditPart.VISUAL_ID:
		case DeviceEditPart.VISUAL_ID:
		case ControllerEditPart.VISUAL_ID:
		case ShareEditPart.VISUAL_ID:
		case FlowEditPart.VISUAL_ID:
		case InteractionEditPart.VISUAL_ID:
		case TimeEditPart.VISUAL_ID:
		case EventEditPart.VISUAL_ID:
		case Time2EditPart.VISUAL_ID:
		case OperationEditPart.VISUAL_ID:
		case DataxEditPart.VISUAL_ID:
		case AreaEditPart.VISUAL_ID:
		case DimensionEditPart.VISUAL_ID:
		case ElementEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return add.diagram.part.AddVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return add.diagram.part.AddVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return add.diagram.part.AddVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return add.diagram.part.AddVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return add.diagram.part.AddVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return add.diagram.part.AddVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
