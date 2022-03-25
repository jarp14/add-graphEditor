/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import add.diagram.edit.commands.AwarenessCreateCommand;
import add.diagram.edit.commands.ControllerCreateCommand;
import add.diagram.edit.commands.DataCreateCommand;
import add.diagram.edit.commands.DeviceCreateCommand;
import add.diagram.edit.commands.EnvironmentCreateCommand;
import add.diagram.edit.commands.FlowCreateCommand;
import add.diagram.edit.commands.HearCreateCommand;
import add.diagram.edit.commands.InputCreateCommand;
import add.diagram.edit.commands.OutputCreateCommand;
import add.diagram.edit.commands.ShareCreateCommand;
import add.diagram.edit.commands.SightCreateCommand;
import add.diagram.edit.commands.SmellCreateCommand;
import add.diagram.edit.commands.TasteCreateCommand;
import add.diagram.edit.commands.TouchCreateCommand;
import add.diagram.edit.commands.WidgetCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class ADDDiagramItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ADDDiagramItemSemanticEditPolicy() {
		super(AddElementTypes.ADDDiagram_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Sight_2001 == req.getElementType()) {
			return getGEFWrapper(new SightCreateCommand(req));
		}
		if (AddElementTypes.Touch_2002 == req.getElementType()) {
			return getGEFWrapper(new TouchCreateCommand(req));
		}
		if (AddElementTypes.Taste_2003 == req.getElementType()) {
			return getGEFWrapper(new TasteCreateCommand(req));
		}
		if (AddElementTypes.Hear_2004 == req.getElementType()) {
			return getGEFWrapper(new HearCreateCommand(req));
		}
		if (AddElementTypes.Smell_2005 == req.getElementType()) {
			return getGEFWrapper(new SmellCreateCommand(req));
		}
		if (AddElementTypes.Environment_2006 == req.getElementType()) {
			return getGEFWrapper(new EnvironmentCreateCommand(req));
		}
		if (AddElementTypes.Input_2007 == req.getElementType()) {
			return getGEFWrapper(new InputCreateCommand(req));
		}
		if (AddElementTypes.Output_2008 == req.getElementType()) {
			return getGEFWrapper(new OutputCreateCommand(req));
		}
		if (AddElementTypes.Data_2009 == req.getElementType()) {
			return getGEFWrapper(new DataCreateCommand(req));
		}
		if (AddElementTypes.Awareness_2010 == req.getElementType()) {
			return getGEFWrapper(new AwarenessCreateCommand(req));
		}
		if (AddElementTypes.Widget_2011 == req.getElementType()) {
			return getGEFWrapper(new WidgetCreateCommand(req));
		}
		if (AddElementTypes.Device_2012 == req.getElementType()) {
			return getGEFWrapper(new DeviceCreateCommand(req));
		}
		if (AddElementTypes.Controller_2013 == req.getElementType()) {
			return getGEFWrapper(new ControllerCreateCommand(req));
		}
		if (AddElementTypes.Share_2014 == req.getElementType()) {
			return getGEFWrapper(new ShareCreateCommand(req));
		}
		if (AddElementTypes.Flow_2015 == req.getElementType()) {
			return getGEFWrapper(new FlowCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
