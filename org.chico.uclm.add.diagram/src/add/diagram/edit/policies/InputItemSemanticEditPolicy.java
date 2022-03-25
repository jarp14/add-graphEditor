/*
* 
*/
package add.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import add.diagram.edit.commands.DashLinkCreateCommand;
import add.diagram.edit.commands.DashLinkReorientCommand;
import add.diagram.edit.commands.NormalLinkCreateCommand;
import add.diagram.edit.commands.NormalLinkReorientCommand;
import add.diagram.edit.commands.SolidGreyLinkCreateCommand;
import add.diagram.edit.commands.SolidGreyLinkReorientCommand;
import add.diagram.edit.commands.SolidLinkCreateCommand;
import add.diagram.edit.commands.SolidLinkReorientCommand;
import add.diagram.edit.parts.DashLinkEditPart;
import add.diagram.edit.parts.EventEditPart;
import add.diagram.edit.parts.InputInputEventCompartmentEditPart;
import add.diagram.edit.parts.InputInputInteractionCompartmentEditPart;
import add.diagram.edit.parts.InputInputTemporalityCompartmentEditPart;
import add.diagram.edit.parts.InteractionEditPart;
import add.diagram.edit.parts.NormalLinkEditPart;
import add.diagram.edit.parts.SolidGreyLinkEditPart;
import add.diagram.edit.parts.SolidLinkEditPart;
import add.diagram.edit.parts.TimeEditPart;
import add.diagram.part.AddVisualIDRegistry;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class InputItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputItemSemanticEditPolicy() {
		super(AddElementTypes.Input_2007);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (AddVisualIDRegistry.getVisualID(incomingLink) == NormalLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(incomingLink) == SolidLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(incomingLink) == SolidGreyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(incomingLink) == DashLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (AddVisualIDRegistry.getVisualID(outgoingLink) == NormalLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(outgoingLink) == SolidLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(outgoingLink) == SolidGreyLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (AddVisualIDRegistry.getVisualID(outgoingLink) == DashLinkEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	* @generated
	*/
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (AddVisualIDRegistry.getVisualID(node)) {
			case InputInputInteractionCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (AddVisualIDRegistry.getVisualID(cnode)) {
					case InteractionEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case InputInputTemporalityCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (AddVisualIDRegistry.getVisualID(cnode)) {
					case TimeEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			case InputInputEventCompartmentEditPart.VISUAL_ID:
				for (Iterator<?> cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (AddVisualIDRegistry.getVisualID(cnode)) {
					case EventEditPart.VISUAL_ID:
						cmd.add(new DestroyElementCommand(
								new DestroyElementRequest(getEditingDomain(), cnode.getElement(), false))); // directlyOwned: true
						// don't need explicit deletion of cnode as parent's view deletion would clean child views as well 
						// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (AddElementTypes.NormalLink_4001 == req.getElementType()) {
			return getGEFWrapper(new NormalLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.SolidLink_4002 == req.getElementType()) {
			return getGEFWrapper(new SolidLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.SolidGreyLink_4003 == req.getElementType()) {
			return getGEFWrapper(new SolidGreyLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.DashLink_4004 == req.getElementType()) {
			return getGEFWrapper(new DashLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (AddElementTypes.NormalLink_4001 == req.getElementType()) {
			return getGEFWrapper(new NormalLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.SolidLink_4002 == req.getElementType()) {
			return getGEFWrapper(new SolidLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.SolidGreyLink_4003 == req.getElementType()) {
			return getGEFWrapper(new SolidGreyLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (AddElementTypes.DashLink_4004 == req.getElementType()) {
			return getGEFWrapper(new DashLinkCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case NormalLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new NormalLinkReorientCommand(req));
		case SolidLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new SolidLinkReorientCommand(req));
		case SolidGreyLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new SolidGreyLinkReorientCommand(req));
		case DashLinkEditPart.VISUAL_ID:
			return getGEFWrapper(new DashLinkReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
