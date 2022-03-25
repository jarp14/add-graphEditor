/*
 * 
 */
package add.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import add.AddPackage;
import add.diagram.edit.parts.AreaTextEditPart;
import add.diagram.edit.parts.AwarenessNameEditPart;
import add.diagram.edit.parts.ControllerNameEditPart;
import add.diagram.edit.parts.DataNameEditPart;
import add.diagram.edit.parts.DataxTextEditPart;
import add.diagram.edit.parts.DeviceNameEditPart;
import add.diagram.edit.parts.DimensionTextEditPart;
import add.diagram.edit.parts.ElementTextEditPart;
import add.diagram.edit.parts.EnvironmentNameEditPart;
import add.diagram.edit.parts.EventTextEditPart;
import add.diagram.edit.parts.FlowNameEditPart;
import add.diagram.edit.parts.HearNameEditPart;
import add.diagram.edit.parts.InputNameEditPart;
import add.diagram.edit.parts.InteractionTextEditPart;
import add.diagram.edit.parts.OperationTextEditPart;
import add.diagram.edit.parts.OutputNameEditPart;
import add.diagram.edit.parts.ShareNameEditPart;
import add.diagram.edit.parts.SightNameEditPart;
import add.diagram.edit.parts.SmellNameEditPart;
import add.diagram.edit.parts.TasteNameEditPart;
import add.diagram.edit.parts.TimeText2EditPart;
import add.diagram.edit.parts.TimeTextEditPart;
import add.diagram.edit.parts.TouchNameEditPart;
import add.diagram.edit.parts.WidgetNameEditPart;
import add.diagram.parsers.MessageFormatParser;
import add.diagram.part.AddVisualIDRegistry;

/**
 * @generated
 */
public class AddParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser sightName_5001Parser;

	/**
	* @generated
	*/
	private IParser getSightName_5001Parser() {
		if (sightName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			sightName_5001Parser = parser;
		}
		return sightName_5001Parser;
	}

	/**
	* @generated
	*/
	private IParser touchName_5002Parser;

	/**
	* @generated
	*/
	private IParser getTouchName_5002Parser() {
		if (touchName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			touchName_5002Parser = parser;
		}
		return touchName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser tasteName_5003Parser;

	/**
	* @generated
	*/
	private IParser getTasteName_5003Parser() {
		if (tasteName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			tasteName_5003Parser = parser;
		}
		return tasteName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser hearName_5004Parser;

	/**
	* @generated
	*/
	private IParser getHearName_5004Parser() {
		if (hearName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			hearName_5004Parser = parser;
		}
		return hearName_5004Parser;
	}

	/**
	* @generated
	*/
	private IParser smellName_5005Parser;

	/**
	* @generated
	*/
	private IParser getSmellName_5005Parser() {
		if (smellName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			smellName_5005Parser = parser;
		}
		return smellName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser environmentName_5006Parser;

	/**
	* @generated
	*/
	private IParser getEnvironmentName_5006Parser() {
		if (environmentName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getSense_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			environmentName_5006Parser = parser;
		}
		return environmentName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5010Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5010Parser() {
		if (inputName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getInput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			inputName_5010Parser = parser;
		}
		return inputName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser outputName_5013Parser;

	/**
	* @generated
	*/
	private IParser getOutputName_5013Parser() {
		if (outputName_5013Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getOutput_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			outputName_5013Parser = parser;
		}
		return outputName_5013Parser;
	}

	/**
	* @generated
	*/
	private IParser dataName_5015Parser;

	/**
	* @generated
	*/
	private IParser getDataName_5015Parser() {
		if (dataName_5015Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getData_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataName_5015Parser = parser;
		}
		return dataName_5015Parser;
	}

	/**
	* @generated
	*/
	private IParser awarenessName_5019Parser;

	/**
	* @generated
	*/
	private IParser getAwarenessName_5019Parser() {
		if (awarenessName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getAwareness_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			awarenessName_5019Parser = parser;
		}
		return awarenessName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser widgetName_5020Parser;

	/**
	* @generated
	*/
	private IParser getWidgetName_5020Parser() {
		if (widgetName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getWidget_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			widgetName_5020Parser = parser;
		}
		return widgetName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser deviceName_5021Parser;

	/**
	* @generated
	*/
	private IParser getDeviceName_5021Parser() {
		if (deviceName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getDevice_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			deviceName_5021Parser = parser;
		}
		return deviceName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser controllerName_5022Parser;

	/**
	* @generated
	*/
	private IParser getControllerName_5022Parser() {
		if (controllerName_5022Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getController_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			controllerName_5022Parser = parser;
		}
		return controllerName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser shareName_5023Parser;

	/**
	* @generated
	*/
	private IParser getShareName_5023Parser() {
		if (shareName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getNoteNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			shareName_5023Parser = parser;
		}
		return shareName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser flowName_5024Parser;

	/**
	* @generated
	*/
	private IParser getFlowName_5024Parser() {
		if (flowName_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getNoteNode_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			flowName_5024Parser = parser;
		}
		return flowName_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser interactionText_5007Parser;

	/**
	* @generated
	*/
	private IParser getInteractionText_5007Parser() {
		if (interactionText_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getInteraction_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			interactionText_5007Parser = parser;
		}
		return interactionText_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser timeText_5008Parser;

	/**
	* @generated
	*/
	private IParser getTimeText_5008Parser() {
		if (timeText_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getTime_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeText_5008Parser = parser;
		}
		return timeText_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser eventText_5009Parser;

	/**
	* @generated
	*/
	private IParser getEventText_5009Parser() {
		if (eventText_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getEvent_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			eventText_5009Parser = parser;
		}
		return eventText_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser timeText_5011Parser;

	/**
	* @generated
	*/
	private IParser getTimeText_5011Parser() {
		if (timeText_5011Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getTime_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			timeText_5011Parser = parser;
		}
		return timeText_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser operationText_5012Parser;

	/**
	* @generated
	*/
	private IParser getOperationText_5012Parser() {
		if (operationText_5012Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getOperation_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			operationText_5012Parser = parser;
		}
		return operationText_5012Parser;
	}

	/**
	* @generated
	*/
	private IParser dataxText_5014Parser;

	/**
	* @generated
	*/
	private IParser getDataxText_5014Parser() {
		if (dataxText_5014Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getDatax_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dataxText_5014Parser = parser;
		}
		return dataxText_5014Parser;
	}

	/**
	* @generated
	*/
	private IParser areaText_5016Parser;

	/**
	* @generated
	*/
	private IParser getAreaText_5016Parser() {
		if (areaText_5016Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getArea_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			areaText_5016Parser = parser;
		}
		return areaText_5016Parser;
	}

	/**
	* @generated
	*/
	private IParser dimensionText_5017Parser;

	/**
	* @generated
	*/
	private IParser getDimensionText_5017Parser() {
		if (dimensionText_5017Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getDimension_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			dimensionText_5017Parser = parser;
		}
		return dimensionText_5017Parser;
	}

	/**
	* @generated
	*/
	private IParser elementText_5018Parser;

	/**
	* @generated
	*/
	private IParser getElementText_5018Parser() {
		if (elementText_5018Parser == null) {
			EAttribute[] features = new EAttribute[] { AddPackage.eINSTANCE.getElement_Text() };
			MessageFormatParser parser = new MessageFormatParser(features);
			elementText_5018Parser = parser;
		}
		return elementText_5018Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SightNameEditPart.VISUAL_ID:
			return getSightName_5001Parser();
		case TouchNameEditPart.VISUAL_ID:
			return getTouchName_5002Parser();
		case TasteNameEditPart.VISUAL_ID:
			return getTasteName_5003Parser();
		case HearNameEditPart.VISUAL_ID:
			return getHearName_5004Parser();
		case SmellNameEditPart.VISUAL_ID:
			return getSmellName_5005Parser();
		case EnvironmentNameEditPart.VISUAL_ID:
			return getEnvironmentName_5006Parser();
		case InputNameEditPart.VISUAL_ID:
			return getInputName_5010Parser();
		case OutputNameEditPart.VISUAL_ID:
			return getOutputName_5013Parser();
		case DataNameEditPart.VISUAL_ID:
			return getDataName_5015Parser();
		case AwarenessNameEditPart.VISUAL_ID:
			return getAwarenessName_5019Parser();
		case WidgetNameEditPart.VISUAL_ID:
			return getWidgetName_5020Parser();
		case DeviceNameEditPart.VISUAL_ID:
			return getDeviceName_5021Parser();
		case ControllerNameEditPart.VISUAL_ID:
			return getControllerName_5022Parser();
		case ShareNameEditPart.VISUAL_ID:
			return getShareName_5023Parser();
		case FlowNameEditPart.VISUAL_ID:
			return getFlowName_5024Parser();
		case InteractionTextEditPart.VISUAL_ID:
			return getInteractionText_5007Parser();
		case TimeTextEditPart.VISUAL_ID:
			return getTimeText_5008Parser();
		case EventTextEditPart.VISUAL_ID:
			return getEventText_5009Parser();
		case TimeText2EditPart.VISUAL_ID:
			return getTimeText_5011Parser();
		case OperationTextEditPart.VISUAL_ID:
			return getOperationText_5012Parser();
		case DataxTextEditPart.VISUAL_ID:
			return getDataxText_5014Parser();
		case AreaTextEditPart.VISUAL_ID:
			return getAreaText_5016Parser();
		case DimensionTextEditPart.VISUAL_ID:
			return getDimensionText_5017Parser();
		case ElementTextEditPart.VISUAL_ID:
			return getElementText_5018Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(AddVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(AddVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (AddElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
