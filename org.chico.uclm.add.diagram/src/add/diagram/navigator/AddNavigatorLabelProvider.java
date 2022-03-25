/*
* 
*/
package add.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import add.diagram.edit.parts.ADDDiagramEditPart;
import add.diagram.edit.parts.AreaEditPart;
import add.diagram.edit.parts.AreaTextEditPart;
import add.diagram.edit.parts.AwarenessEditPart;
import add.diagram.edit.parts.AwarenessNameEditPart;
import add.diagram.edit.parts.ControllerEditPart;
import add.diagram.edit.parts.ControllerNameEditPart;
import add.diagram.edit.parts.DashLinkEditPart;
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
import add.diagram.edit.parts.InputNameEditPart;
import add.diagram.edit.parts.InteractionEditPart;
import add.diagram.edit.parts.InteractionTextEditPart;
import add.diagram.edit.parts.NormalLinkEditPart;
import add.diagram.edit.parts.OperationEditPart;
import add.diagram.edit.parts.OperationTextEditPart;
import add.diagram.edit.parts.OutputEditPart;
import add.diagram.edit.parts.OutputNameEditPart;
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
import add.diagram.part.AddDiagramEditorPlugin;
import add.diagram.part.AddVisualIDRegistry;
import add.diagram.providers.AddElementTypes;
import add.diagram.providers.AddParserProvider;

/**
 * @generated
 */
public class AddNavigatorLabelProvider extends LabelProvider implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		AddDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?UnknownElement", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
		AddDiagramEditorPlugin.getInstance().getImageRegistry().put("Navigator?ImageNotFound", //$NON-NLS-1$
				ImageDescriptor.getMissingImageDescriptor());
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof AddNavigatorItem && !isOwnView(((AddNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof AddNavigatorGroup) {
			AddNavigatorGroup group = (AddNavigatorGroup) element;
			return AddDiagramEditorPlugin.getInstance().getBundledImage(group.getIcon());
		}

		if (element instanceof AddNavigatorItem) {
			AddNavigatorItem navigatorItem = (AddNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case ADDDiagramEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?add?ADDDiagram", AddElementTypes.ADDDiagram_1000); //$NON-NLS-1$
		case SightEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Sight", AddElementTypes.Sight_2001); //$NON-NLS-1$
		case TouchEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Touch", AddElementTypes.Touch_2002); //$NON-NLS-1$
		case TasteEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Taste", AddElementTypes.Taste_2003); //$NON-NLS-1$
		case HearEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Hear", AddElementTypes.Hear_2004); //$NON-NLS-1$
		case SmellEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Smell", AddElementTypes.Smell_2005); //$NON-NLS-1$
		case EnvironmentEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Environment", AddElementTypes.Environment_2006); //$NON-NLS-1$
		case InputEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Input", AddElementTypes.Input_2007); //$NON-NLS-1$
		case OutputEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Output", AddElementTypes.Output_2008); //$NON-NLS-1$
		case DataEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Data", AddElementTypes.Data_2009); //$NON-NLS-1$
		case AwarenessEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Awareness", AddElementTypes.Awareness_2010); //$NON-NLS-1$
		case WidgetEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Widget", AddElementTypes.Widget_2011); //$NON-NLS-1$
		case DeviceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Device", AddElementTypes.Device_2012); //$NON-NLS-1$
		case ControllerEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Controller", AddElementTypes.Controller_2013); //$NON-NLS-1$
		case ShareEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Share", AddElementTypes.Share_2014); //$NON-NLS-1$
		case FlowEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?add?Flow", AddElementTypes.Flow_2015); //$NON-NLS-1$
		case InteractionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Interaction", AddElementTypes.Interaction_3001); //$NON-NLS-1$
		case TimeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Time", AddElementTypes.Time_3002); //$NON-NLS-1$
		case EventEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Event", AddElementTypes.Event_3003); //$NON-NLS-1$
		case Time2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Time", AddElementTypes.Time_3004); //$NON-NLS-1$
		case OperationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Operation", AddElementTypes.Operation_3005); //$NON-NLS-1$
		case DataxEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Datax", AddElementTypes.Datax_3006); //$NON-NLS-1$
		case AreaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Area", AddElementTypes.Area_3007); //$NON-NLS-1$
		case DimensionEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Dimension", AddElementTypes.Dimension_3008); //$NON-NLS-1$
		case ElementEditPart.VISUAL_ID:
			return getImage("Navigator?Node?add?Element", AddElementTypes.Element_3009); //$NON-NLS-1$
		case NormalLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?add?NormalLink", AddElementTypes.NormalLink_4001); //$NON-NLS-1$
		case SolidLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?add?SolidLink", AddElementTypes.SolidLink_4002); //$NON-NLS-1$
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?add?SolidGreyLink", AddElementTypes.SolidGreyLink_4003); //$NON-NLS-1$
		case DashLinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?add?DashLink", AddElementTypes.DashLink_4004); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = AddDiagramEditorPlugin.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null && AddElementTypes.isKnownElementType(elementType)) {
			image = AddElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof AddNavigatorGroup) {
			AddNavigatorGroup group = (AddNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof AddNavigatorItem) {
			AddNavigatorItem navigatorItem = (AddNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (AddVisualIDRegistry.getVisualID(view)) {
		case ADDDiagramEditPart.VISUAL_ID:
			return getADDDiagram_1000Text(view);
		case SightEditPart.VISUAL_ID:
			return getSight_2001Text(view);
		case TouchEditPart.VISUAL_ID:
			return getTouch_2002Text(view);
		case TasteEditPart.VISUAL_ID:
			return getTaste_2003Text(view);
		case HearEditPart.VISUAL_ID:
			return getHear_2004Text(view);
		case SmellEditPart.VISUAL_ID:
			return getSmell_2005Text(view);
		case EnvironmentEditPart.VISUAL_ID:
			return getEnvironment_2006Text(view);
		case InputEditPart.VISUAL_ID:
			return getInput_2007Text(view);
		case OutputEditPart.VISUAL_ID:
			return getOutput_2008Text(view);
		case DataEditPart.VISUAL_ID:
			return getData_2009Text(view);
		case AwarenessEditPart.VISUAL_ID:
			return getAwareness_2010Text(view);
		case WidgetEditPart.VISUAL_ID:
			return getWidget_2011Text(view);
		case DeviceEditPart.VISUAL_ID:
			return getDevice_2012Text(view);
		case ControllerEditPart.VISUAL_ID:
			return getController_2013Text(view);
		case ShareEditPart.VISUAL_ID:
			return getShare_2014Text(view);
		case FlowEditPart.VISUAL_ID:
			return getFlow_2015Text(view);
		case InteractionEditPart.VISUAL_ID:
			return getInteraction_3001Text(view);
		case TimeEditPart.VISUAL_ID:
			return getTime_3002Text(view);
		case EventEditPart.VISUAL_ID:
			return getEvent_3003Text(view);
		case Time2EditPart.VISUAL_ID:
			return getTime_3004Text(view);
		case OperationEditPart.VISUAL_ID:
			return getOperation_3005Text(view);
		case DataxEditPart.VISUAL_ID:
			return getDatax_3006Text(view);
		case AreaEditPart.VISUAL_ID:
			return getArea_3007Text(view);
		case DimensionEditPart.VISUAL_ID:
			return getDimension_3008Text(view);
		case ElementEditPart.VISUAL_ID:
			return getElement_3009Text(view);
		case NormalLinkEditPart.VISUAL_ID:
			return getNormalLink_4001Text(view);
		case SolidLinkEditPart.VISUAL_ID:
			return getSolidLink_4002Text(view);
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getSolidGreyLink_4003Text(view);
		case DashLinkEditPart.VISUAL_ID:
			return getDashLink_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getADDDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSight_2001Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Sight_2001,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(SightNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTouch_2002Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Touch_2002,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(TouchNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTaste_2003Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Taste_2003,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(TasteNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getHear_2004Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Hear_2004,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(HearNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSmell_2005Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Smell_2005,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(SmellNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEnvironment_2006Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Environment_2006,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(EnvironmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_2007Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Input_2007,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutput_2008Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Output_2008,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getData_2009Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Data_2009,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(DataNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAwareness_2010Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Awareness_2010,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(AwarenessNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getWidget_2011Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Widget_2011,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(WidgetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDevice_2012Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Device_2012,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(DeviceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getController_2013Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Controller_2013,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(ControllerNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getShare_2014Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Share_2014,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(ShareNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFlow_2015Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Flow_2015,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(FlowNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInteraction_3001Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Interaction_3001,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(InteractionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTime_3002Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Time_3002,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(TimeTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEvent_3003Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Event_3003,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(EventTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTime_3004Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Time_3004,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(TimeText2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOperation_3005Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Operation_3005,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(OperationTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDatax_3006Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Datax_3006,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(DataxTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getArea_3007Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Area_3007,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(AreaTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDimension_3008Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Dimension_3008,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(DimensionTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getElement_3009Text(View view) {
		IParser parser = AddParserProvider.getParser(AddElementTypes.Element_3009,
				view.getElement() != null ? view.getElement() : view,
				AddVisualIDRegistry.getType(ElementTextEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			AddDiagramEditorPlugin.getInstance().logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNormalLink_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSolidLink_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getSolidGreyLink_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getDashLink_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return ADDDiagramEditPart.MODEL_ID.equals(AddVisualIDRegistry.getModelID(view));
	}

}
