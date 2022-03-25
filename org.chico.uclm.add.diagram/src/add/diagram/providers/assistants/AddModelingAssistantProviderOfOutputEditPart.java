/*
 * 
 */
package add.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import add.diagram.edit.parts.AwarenessEditPart;
import add.diagram.edit.parts.ControllerEditPart;
import add.diagram.edit.parts.DataEditPart;
import add.diagram.edit.parts.DeviceEditPart;
import add.diagram.edit.parts.InputEditPart;
import add.diagram.edit.parts.OutputEditPart;
import add.diagram.edit.parts.WidgetEditPart;
import add.diagram.providers.AddElementTypes;
import add.diagram.providers.AddModelingAssistantProvider;

/**
 * @generated
 */
public class AddModelingAssistantProviderOfOutputEditPart extends AddModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(AddElementTypes.Time_3004);
		types.add(AddElementTypes.Operation_3005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((OutputEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(OutputEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(AddElementTypes.NormalLink_4001);
		types.add(AddElementTypes.SolidLink_4002);
		types.add(AddElementTypes.SolidGreyLink_4003);
		types.add(AddElementTypes.DashLink_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((OutputEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(OutputEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof InputEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof DataEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof AwarenessEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof WidgetEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(AddElementTypes.NormalLink_4001);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof DataEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof AwarenessEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof WidgetEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(AddElementTypes.SolidLink_4002);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof DataEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof AwarenessEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof WidgetEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(AddElementTypes.SolidGreyLink_4003);
		}
		if (targetEditPart instanceof InputEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof OutputEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof DataEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof AwarenessEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof WidgetEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof DeviceEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		if (targetEditPart instanceof ControllerEditPart) {
			types.add(AddElementTypes.DashLink_4004);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((OutputEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(OutputEditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AddElementTypes.NormalLink_4001) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.SolidLink_4002) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.SolidGreyLink_4003) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.DashLink_4004) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((OutputEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(OutputEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(AddElementTypes.NormalLink_4001);
		types.add(AddElementTypes.SolidLink_4002);
		types.add(AddElementTypes.SolidGreyLink_4003);
		types.add(AddElementTypes.DashLink_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((OutputEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(OutputEditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == AddElementTypes.NormalLink_4001) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.SolidLink_4002) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.SolidGreyLink_4003) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		} else if (relationshipType == AddElementTypes.DashLink_4004) {
			types.add(AddElementTypes.Input_2007);
			types.add(AddElementTypes.Output_2008);
			types.add(AddElementTypes.Data_2009);
			types.add(AddElementTypes.Awareness_2010);
			types.add(AddElementTypes.Widget_2011);
			types.add(AddElementTypes.Device_2012);
			types.add(AddElementTypes.Controller_2013);
		}
		return types;
	}

}
