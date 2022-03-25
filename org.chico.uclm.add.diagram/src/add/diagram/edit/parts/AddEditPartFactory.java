/*
 * 
 */
package add.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import add.diagram.part.AddVisualIDRegistry;

/**
 * @generated
 */
public class AddEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (AddVisualIDRegistry.getVisualID(view)) {

			case ADDDiagramEditPart.VISUAL_ID:
				return new ADDDiagramEditPart(view);

			case SightEditPart.VISUAL_ID:
				return new SightEditPart(view);

			case SightNameEditPart.VISUAL_ID:
				return new SightNameEditPart(view);

			case TouchEditPart.VISUAL_ID:
				return new TouchEditPart(view);

			case TouchNameEditPart.VISUAL_ID:
				return new TouchNameEditPart(view);

			case TasteEditPart.VISUAL_ID:
				return new TasteEditPart(view);

			case TasteNameEditPart.VISUAL_ID:
				return new TasteNameEditPart(view);

			case HearEditPart.VISUAL_ID:
				return new HearEditPart(view);

			case HearNameEditPart.VISUAL_ID:
				return new HearNameEditPart(view);

			case SmellEditPart.VISUAL_ID:
				return new SmellEditPart(view);

			case SmellNameEditPart.VISUAL_ID:
				return new SmellNameEditPart(view);

			case EnvironmentEditPart.VISUAL_ID:
				return new EnvironmentEditPart(view);

			case EnvironmentNameEditPart.VISUAL_ID:
				return new EnvironmentNameEditPart(view);

			case InputEditPart.VISUAL_ID:
				return new InputEditPart(view);

			case InputNameEditPart.VISUAL_ID:
				return new InputNameEditPart(view);

			case OutputEditPart.VISUAL_ID:
				return new OutputEditPart(view);

			case OutputNameEditPart.VISUAL_ID:
				return new OutputNameEditPart(view);

			case DataEditPart.VISUAL_ID:
				return new DataEditPart(view);

			case DataNameEditPart.VISUAL_ID:
				return new DataNameEditPart(view);

			case AwarenessEditPart.VISUAL_ID:
				return new AwarenessEditPart(view);

			case AwarenessNameEditPart.VISUAL_ID:
				return new AwarenessNameEditPart(view);

			case WidgetEditPart.VISUAL_ID:
				return new WidgetEditPart(view);

			case WidgetNameEditPart.VISUAL_ID:
				return new WidgetNameEditPart(view);

			case DeviceEditPart.VISUAL_ID:
				return new DeviceEditPart(view);

			case DeviceNameEditPart.VISUAL_ID:
				return new DeviceNameEditPart(view);

			case ControllerEditPart.VISUAL_ID:
				return new ControllerEditPart(view);

			case ControllerNameEditPart.VISUAL_ID:
				return new ControllerNameEditPart(view);

			case ShareEditPart.VISUAL_ID:
				return new ShareEditPart(view);

			case ShareNameEditPart.VISUAL_ID:
				return new ShareNameEditPart(view);

			case FlowEditPart.VISUAL_ID:
				return new FlowEditPart(view);

			case FlowNameEditPart.VISUAL_ID:
				return new FlowNameEditPart(view);

			case InteractionEditPart.VISUAL_ID:
				return new InteractionEditPart(view);

			case InteractionTextEditPart.VISUAL_ID:
				return new InteractionTextEditPart(view);

			case TimeEditPart.VISUAL_ID:
				return new TimeEditPart(view);

			case TimeTextEditPart.VISUAL_ID:
				return new TimeTextEditPart(view);

			case EventEditPart.VISUAL_ID:
				return new EventEditPart(view);

			case EventTextEditPart.VISUAL_ID:
				return new EventTextEditPart(view);

			case Time2EditPart.VISUAL_ID:
				return new Time2EditPart(view);

			case TimeText2EditPart.VISUAL_ID:
				return new TimeText2EditPart(view);

			case OperationEditPart.VISUAL_ID:
				return new OperationEditPart(view);

			case OperationTextEditPart.VISUAL_ID:
				return new OperationTextEditPart(view);

			case DataxEditPart.VISUAL_ID:
				return new DataxEditPart(view);

			case DataxTextEditPart.VISUAL_ID:
				return new DataxTextEditPart(view);

			case AreaEditPart.VISUAL_ID:
				return new AreaEditPart(view);

			case AreaTextEditPart.VISUAL_ID:
				return new AreaTextEditPart(view);

			case DimensionEditPart.VISUAL_ID:
				return new DimensionEditPart(view);

			case DimensionTextEditPart.VISUAL_ID:
				return new DimensionTextEditPart(view);

			case ElementEditPart.VISUAL_ID:
				return new ElementEditPart(view);

			case ElementTextEditPart.VISUAL_ID:
				return new ElementTextEditPart(view);

			case InputInputInteractionCompartmentEditPart.VISUAL_ID:
				return new InputInputInteractionCompartmentEditPart(view);

			case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
				return new InputInputTemporalityCompartmentEditPart(view);

			case InputInputEventCompartmentEditPart.VISUAL_ID:
				return new InputInputEventCompartmentEditPart(view);

			case OutputOutputTemporalityCompartmentEditPart.VISUAL_ID:
				return new OutputOutputTemporalityCompartmentEditPart(view);

			case OutputOutputOperationCompartmentEditPart.VISUAL_ID:
				return new OutputOutputOperationCompartmentEditPart(view);

			case DataDataDataCompartmentEditPart.VISUAL_ID:
				return new DataDataDataCompartmentEditPart(view);

			case AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID:
				return new AwarenessAwarenessAreaCompartmentEditPart(view);

			case AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID:
				return new AwarenessAwarenessDimensionCompartmentEditPart(view);

			case AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID:
				return new AwarenessAwarenessElementCompartmentEditPart(view);

			case NormalLinkEditPart.VISUAL_ID:
				return new NormalLinkEditPart(view);

			case SolidLinkEditPart.VISUAL_ID:
				return new SolidLinkEditPart(view);

			case SolidGreyLinkEditPart.VISUAL_ID:
				return new SolidGreyLinkEditPart(view);

			case DashLinkEditPart.VISUAL_ID:
				return new DashLinkEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
