/*
* 
*/
package add.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import add.ADDDiagram;
import add.AddPackage;
import add.Area;
import add.Awareness;
import add.Controller;
import add.DashLink;
import add.Data;
import add.Datax;
import add.Device;
import add.Dimension;
import add.Element;
import add.Event;
import add.Input;
import add.Interaction;
import add.Node;
import add.NormalLink;
import add.NoteNode;
import add.Operation;
import add.Output;
import add.Sense;
import add.SolidGreyLink;
import add.SolidLink;
import add.Time;
import add.Widget;
import add.diagram.edit.parts.ADDDiagramEditPart;
import add.diagram.edit.parts.AreaEditPart;
import add.diagram.edit.parts.AwarenessAwarenessAreaCompartmentEditPart;
import add.diagram.edit.parts.AwarenessAwarenessDimensionCompartmentEditPart;
import add.diagram.edit.parts.AwarenessAwarenessElementCompartmentEditPart;
import add.diagram.edit.parts.AwarenessEditPart;
import add.diagram.edit.parts.ControllerEditPart;
import add.diagram.edit.parts.DashLinkEditPart;
import add.diagram.edit.parts.DataDataDataCompartmentEditPart;
import add.diagram.edit.parts.DataEditPart;
import add.diagram.edit.parts.DataxEditPart;
import add.diagram.edit.parts.DeviceEditPart;
import add.diagram.edit.parts.DimensionEditPart;
import add.diagram.edit.parts.ElementEditPart;
import add.diagram.edit.parts.EnvironmentEditPart;
import add.diagram.edit.parts.EventEditPart;
import add.diagram.edit.parts.FlowEditPart;
import add.diagram.edit.parts.HearEditPart;
import add.diagram.edit.parts.InputEditPart;
import add.diagram.edit.parts.InputInputEventCompartmentEditPart;
import add.diagram.edit.parts.InputInputInteractionCompartmentEditPart;
import add.diagram.edit.parts.InputInputTemporalityCompartmentEditPart;
import add.diagram.edit.parts.InteractionEditPart;
import add.diagram.edit.parts.NormalLinkEditPart;
import add.diagram.edit.parts.OperationEditPart;
import add.diagram.edit.parts.OutputEditPart;
import add.diagram.edit.parts.OutputOutputOperationCompartmentEditPart;
import add.diagram.edit.parts.OutputOutputTemporalityCompartmentEditPart;
import add.diagram.edit.parts.ShareEditPart;
import add.diagram.edit.parts.SightEditPart;
import add.diagram.edit.parts.SmellEditPart;
import add.diagram.edit.parts.SolidGreyLinkEditPart;
import add.diagram.edit.parts.SolidLinkEditPart;
import add.diagram.edit.parts.TasteEditPart;
import add.diagram.edit.parts.Time2EditPart;
import add.diagram.edit.parts.TimeEditPart;
import add.diagram.edit.parts.TouchEditPart;
import add.diagram.edit.parts.WidgetEditPart;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class AddDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getSemanticChildren(View view) {
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case ADDDiagramEditPart.VISUAL_ID:
			return getADDDiagram_1000SemanticChildren(view);
		case InputInputInteractionCompartmentEditPart.VISUAL_ID:
			return getInputInputInteractionCompartment_7001SemanticChildren(view);
		case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
			return getInputInputTemporalityCompartment_7002SemanticChildren(view);
		case InputInputEventCompartmentEditPart.VISUAL_ID:
			return getInputInputEventCompartment_7003SemanticChildren(view);
		case OutputOutputTemporalityCompartmentEditPart.VISUAL_ID:
			return getOutputOutputTemporalityCompartment_7004SemanticChildren(view);
		case OutputOutputOperationCompartmentEditPart.VISUAL_ID:
			return getOutputOutputOperationCompartment_7005SemanticChildren(view);
		case DataDataDataCompartmentEditPart.VISUAL_ID:
			return getDataDataDataCompartment_7006SemanticChildren(view);
		case AwarenessAwarenessAreaCompartmentEditPart.VISUAL_ID:
			return getAwarenessAwarenessAreaCompartment_7007SemanticChildren(view);
		case AwarenessAwarenessDimensionCompartmentEditPart.VISUAL_ID:
			return getAwarenessAwarenessDimensionCompartment_7008SemanticChildren(view);
		case AwarenessAwarenessElementCompartmentEditPart.VISUAL_ID:
			return getAwarenessAwarenessElementCompartment_7009SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getADDDiagram_1000SemanticChildren(View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ADDDiagram modelElement = (ADDDiagram) view.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSenses().iterator(); it.hasNext();) {
			Sense childElement = (Sense) it.next();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == SightEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TouchEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TasteEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == HearEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SmellEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == EnvironmentEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getElements().iterator(); it.hasNext();) {
			Node childElement = (Node) it.next();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InputEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == OutputEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DataEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AwarenessEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == WidgetEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == DeviceEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ControllerEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getOthers().iterator(); it.hasNext();) {
			NoteNode childElement = (NoteNode) it.next();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ShareEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == FlowEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getInputInputInteractionCompartment_7001SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Input modelElement = (Input) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Interaction childElement = modelElement.getInteraction();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == InteractionEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getInputInputTemporalityCompartment_7002SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Input modelElement = (Input) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Time childElement = modelElement.getTemporality();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == TimeEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getInputInputEventCompartment_7003SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Input modelElement = (Input) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Event childElement = modelElement.getEvent();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == EventEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getOutputOutputTemporalityCompartment_7004SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Output modelElement = (Output) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Time childElement = modelElement.getTemporality();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == Time2EditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getOutputOutputOperationCompartment_7005SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Output modelElement = (Output) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Operation childElement = modelElement.getOperation();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == OperationEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getDataDataDataCompartment_7006SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Data modelElement = (Data) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		for (Iterator<?> it = modelElement.getData().iterator(); it.hasNext();) {
			Datax childElement = (Datax) it.next();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DataxEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getAwarenessAwarenessAreaCompartment_7007SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Awareness modelElement = (Awareness) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Area childElement = modelElement.getArea();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == AreaEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getAwarenessAwarenessDimensionCompartment_7008SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Awareness modelElement = (Awareness) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Dimension childElement = modelElement.getDimension();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == DimensionEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddNodeDescriptor> getAwarenessAwarenessElementCompartment_7009SemanticChildren(View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		Awareness modelElement = (Awareness) containerView.getElement();
		LinkedList<AddNodeDescriptor> result = new LinkedList<AddNodeDescriptor>();
		{
			Element childElement = modelElement.getElement();
			int visualID = AddVisualIDRegistry.getNodeVisualID(view, childElement);
			if (visualID == ElementEditPart.VISUAL_ID) {
				result.add(new AddNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<AddLinkDescriptor> getContainedLinks(View view) {
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case ADDDiagramEditPart.VISUAL_ID:
			return getADDDiagram_1000ContainedLinks(view);
		case SightEditPart.VISUAL_ID:
			return getSight_2001ContainedLinks(view);
		case TouchEditPart.VISUAL_ID:
			return getTouch_2002ContainedLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_2003ContainedLinks(view);
		case HearEditPart.VISUAL_ID:
			return getHear_2004ContainedLinks(view);
		case SmellEditPart.VISUAL_ID:
			return getSmell_2005ContainedLinks(view);
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2006ContainedLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2007ContainedLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2008ContainedLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_2009ContainedLinks(view);
		case AwarenessEditPart.VISUAL_ID:
			return getAwareness_2010ContainedLinks(view);
		case WidgetEditPart.VISUAL_ID:
			return getWidget_2011ContainedLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2012ContainedLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2013ContainedLinks(view);
		case ShareEditPart.VISUAL_ID:
			return getShare_2014ContainedLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2015ContainedLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_3001ContainedLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_3002ContainedLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3003ContainedLinks(view);
		case Time2EditPart.VISUAL_ID:
			return getTime_3004ContainedLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005ContainedLinks(view);
		case DataxEditPart.VISUAL_ID:
			return getDatax_3006ContainedLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_3007ContainedLinks(view);
		case DimensionEditPart.VISUAL_ID:
			return getDimension_3008ContainedLinks(view);
		case ElementEditPart.VISUAL_ID:
			return getElement_3009ContainedLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001ContainedLinks(view);
		case SolidLinkEditPart.VISUAL_ID:
			return getSolidLink_4002ContainedLinks(view);
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getSolidGreyLink_4003ContainedLinks(view);
		case DashLinkEditPart.VISUAL_ID:
			return getDashLink_4004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AddLinkDescriptor> getIncomingLinks(View view) {
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case SightEditPart.VISUAL_ID:
			return getSight_2001IncomingLinks(view);
		case TouchEditPart.VISUAL_ID:
			return getTouch_2002IncomingLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_2003IncomingLinks(view);
		case HearEditPart.VISUAL_ID:
			return getHear_2004IncomingLinks(view);
		case SmellEditPart.VISUAL_ID:
			return getSmell_2005IncomingLinks(view);
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2006IncomingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2007IncomingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2008IncomingLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_2009IncomingLinks(view);
		case AwarenessEditPart.VISUAL_ID:
			return getAwareness_2010IncomingLinks(view);
		case WidgetEditPart.VISUAL_ID:
			return getWidget_2011IncomingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2012IncomingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2013IncomingLinks(view);
		case ShareEditPart.VISUAL_ID:
			return getShare_2014IncomingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2015IncomingLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_3001IncomingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_3002IncomingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3003IncomingLinks(view);
		case Time2EditPart.VISUAL_ID:
			return getTime_3004IncomingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005IncomingLinks(view);
		case DataxEditPart.VISUAL_ID:
			return getDatax_3006IncomingLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_3007IncomingLinks(view);
		case DimensionEditPart.VISUAL_ID:
			return getDimension_3008IncomingLinks(view);
		case ElementEditPart.VISUAL_ID:
			return getElement_3009IncomingLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001IncomingLinks(view);
		case SolidLinkEditPart.VISUAL_ID:
			return getSolidLink_4002IncomingLinks(view);
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getSolidGreyLink_4003IncomingLinks(view);
		case DashLinkEditPart.VISUAL_ID:
			return getDashLink_4004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<AddLinkDescriptor> getOutgoingLinks(View view) {
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case SightEditPart.VISUAL_ID:
			return getSight_2001OutgoingLinks(view);
		case TouchEditPart.VISUAL_ID:
			return getTouch_2002OutgoingLinks(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_2003OutgoingLinks(view);
		case HearEditPart.VISUAL_ID:
			return getHear_2004OutgoingLinks(view);
		case SmellEditPart.VISUAL_ID:
			return getSmell_2005OutgoingLinks(view);
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2006OutgoingLinks(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2007OutgoingLinks(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2008OutgoingLinks(view);
		case DataEditPart.VISUAL_ID:
			return getData_2009OutgoingLinks(view);
		case AwarenessEditPart.VISUAL_ID:
			return getAwareness_2010OutgoingLinks(view);
		case WidgetEditPart.VISUAL_ID:
			return getWidget_2011OutgoingLinks(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2012OutgoingLinks(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2013OutgoingLinks(view);
		case ShareEditPart.VISUAL_ID:
			return getShare_2014OutgoingLinks(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2015OutgoingLinks(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_3001OutgoingLinks(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_3002OutgoingLinks(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3003OutgoingLinks(view);
		case Time2EditPart.VISUAL_ID:
			return getTime_3004OutgoingLinks(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005OutgoingLinks(view);
		case DataxEditPart.VISUAL_ID:
			return getDatax_3006OutgoingLinks(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_3007OutgoingLinks(view);
		case DimensionEditPart.VISUAL_ID:
			return getDimension_3008OutgoingLinks(view);
		case ElementEditPart.VISUAL_ID:
			return getElement_3009OutgoingLinks(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001OutgoingLinks(view);
		case SolidLinkEditPart.VISUAL_ID:
			return getSolidLink_4002OutgoingLinks(view);
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getSolidGreyLink_4003OutgoingLinks(view);
		case DashLinkEditPart.VISUAL_ID:
			return getDashLink_4004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getADDDiagram_1000ContainedLinks(View view) {
		ADDDiagram modelElement = (ADDDiagram) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSight_2001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTouch_2002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTaste_2003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getHear_2004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSmell_2005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEnvironment_2006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInput_2007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOutput_2008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getData_2009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getAwareness_2010ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getWidget_2011ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDevice_2012ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getController_2013ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getShare_2014ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getFlow_2015ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInteraction_3001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEvent_3003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOperation_3005ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDatax_3006ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getArea_3007ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDimension_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getElement_3009ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getNormalLink_4001ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidLink_4002ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidGreyLink_4003ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDashLink_4004ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSight_2001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTouch_2002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTaste_2003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getHear_2004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSmell_2005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEnvironment_2006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInput_2007IncomingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOutput_2008IncomingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getData_2009IncomingLinks(View view) {
		Data modelElement = (Data) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getAwareness_2010IncomingLinks(View view) {
		Awareness modelElement = (Awareness) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getWidget_2011IncomingLinks(View view) {
		Widget modelElement = (Widget) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDevice_2012IncomingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getController_2013IncomingLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_NormalLink_4001(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidLink_4002(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_SolidGreyLink_4003(modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashLink_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getShare_2014IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getFlow_2015IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInteraction_3001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEvent_3003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOperation_3005IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDatax_3006IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getArea_3007IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDimension_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getElement_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getNormalLink_4001IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidLink_4002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidGreyLink_4003IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDashLink_4004IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSight_2001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTouch_2002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTaste_2003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getHear_2004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSmell_2005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEnvironment_2006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInput_2007OutgoingLinks(View view) {
		Input modelElement = (Input) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOutput_2008OutgoingLinks(View view) {
		Output modelElement = (Output) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getData_2009OutgoingLinks(View view) {
		Data modelElement = (Data) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getAwareness_2010OutgoingLinks(View view) {
		Awareness modelElement = (Awareness) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getWidget_2011OutgoingLinks(View view) {
		Widget modelElement = (Widget) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDevice_2012OutgoingLinks(View view) {
		Device modelElement = (Device) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getController_2013OutgoingLinks(View view) {
		Controller modelElement = (Controller) view.getElement();
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_NormalLink_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidLink_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashLink_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getShare_2014OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getFlow_2015OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getInteraction_3001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getEvent_3003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getTime_3004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getOperation_3005OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDatax_3006OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getArea_3007OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDimension_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getElement_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getNormalLink_4001OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidLink_4002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getSolidGreyLink_4003OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<AddLinkDescriptor> getDashLink_4004OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getContainedTypeModelFacetLinks_NormalLink_4001(ADDDiagram container) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) linkObject;
			if (NormalLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, dst, link, AddElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getContainedTypeModelFacetLinks_SolidLink_4002(ADDDiagram container) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolidLink) {
				continue;
			}
			SolidLink link = (SolidLink) linkObject;
			if (SolidLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			result.add(
					new AddLinkDescriptor(src, dst, link, AddElementTypes.SolidLink_4002, SolidLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getContainedTypeModelFacetLinks_SolidGreyLink_4003(
			ADDDiagram container) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolidGreyLink) {
				continue;
			}
			SolidGreyLink link = (SolidGreyLink) linkObject;
			if (SolidGreyLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, dst, link, AddElementTypes.SolidGreyLink_4003,
					SolidGreyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getContainedTypeModelFacetLinks_DashLink_4004(ADDDiagram container) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DashLink) {
				continue;
			}
			DashLink link = (DashLink) linkObject;
			if (DashLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			result.add(
					new AddLinkDescriptor(src, dst, link, AddElementTypes.DashLink_4004, DashLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AddLinkDescriptor> getIncomingTypeModelFacetLinks_NormalLink_4001(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AddPackage.eINSTANCE.getNormalLink_Target()
					|| false == setting.getEObject() instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) setting.getEObject();
			if (NormalLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, target, link, AddElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AddLinkDescriptor> getIncomingTypeModelFacetLinks_SolidLink_4002(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AddPackage.eINSTANCE.getSolidLink_Target()
					|| false == setting.getEObject() instanceof SolidLink) {
				continue;
			}
			SolidLink link = (SolidLink) setting.getEObject();
			if (SolidLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, target, link, AddElementTypes.SolidLink_4002,
					SolidLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AddLinkDescriptor> getIncomingTypeModelFacetLinks_SolidGreyLink_4003(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AddPackage.eINSTANCE.getSolidGreyLink_Target()
					|| false == setting.getEObject() instanceof SolidGreyLink) {
				continue;
			}
			SolidGreyLink link = (SolidGreyLink) setting.getEObject();
			if (SolidGreyLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, target, link, AddElementTypes.SolidGreyLink_4003,
					SolidGreyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<AddLinkDescriptor> getIncomingTypeModelFacetLinks_DashLink_4004(Node target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != AddPackage.eINSTANCE.getDashLink_Target()
					|| false == setting.getEObject() instanceof DashLink) {
				continue;
			}
			DashLink link = (DashLink) setting.getEObject();
			if (DashLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node src = link.getOrigin();
			result.add(new AddLinkDescriptor(src, target, link, AddElementTypes.DashLink_4004,
					DashLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getOutgoingTypeModelFacetLinks_NormalLink_4001(Node source) {
		ADDDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ADDDiagram) {
				container = (ADDDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof NormalLink) {
				continue;
			}
			NormalLink link = (NormalLink) linkObject;
			if (NormalLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new AddLinkDescriptor(src, dst, link, AddElementTypes.NormalLink_4001,
					NormalLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getOutgoingTypeModelFacetLinks_SolidLink_4002(Node source) {
		ADDDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ADDDiagram) {
				container = (ADDDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolidLink) {
				continue;
			}
			SolidLink link = (SolidLink) linkObject;
			if (SolidLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(
					new AddLinkDescriptor(src, dst, link, AddElementTypes.SolidLink_4002, SolidLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getOutgoingTypeModelFacetLinks_SolidGreyLink_4003(Node source) {
		ADDDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ADDDiagram) {
				container = (ADDDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SolidGreyLink) {
				continue;
			}
			SolidGreyLink link = (SolidGreyLink) linkObject;
			if (SolidGreyLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(new AddLinkDescriptor(src, dst, link, AddElementTypes.SolidGreyLink_4003,
					SolidGreyLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<AddLinkDescriptor> getOutgoingTypeModelFacetLinks_DashLink_4004(Node source) {
		ADDDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof ADDDiagram) {
				container = (ADDDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<AddLinkDescriptor> result = new LinkedList<AddLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DashLink) {
				continue;
			}
			DashLink link = (DashLink) linkObject;
			if (DashLinkEditPart.VISUAL_ID != AddVisualIDRegistry.getLinkWithClassVisualID(link)) {
				continue;
			}
			Node dst = link.getTarget();
			Node src = link.getOrigin();
			if (src != source) {
				continue;
			}
			result.add(
					new AddLinkDescriptor(src, dst, link, AddElementTypes.DashLink_4004, DashLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<AddNodeDescriptor> getSemanticChildren(View view) {
			return AddDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AddLinkDescriptor> getContainedLinks(View view) {
			return AddDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AddLinkDescriptor> getIncomingLinks(View view) {
			return AddDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<AddLinkDescriptor> getOutgoingLinks(View view) {
			return AddDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
