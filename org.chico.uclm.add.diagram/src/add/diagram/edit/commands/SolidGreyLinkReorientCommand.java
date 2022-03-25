/*
 * 
 */
package add.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import add.ADDDiagram;
import add.Node;
import add.SolidGreyLink;
import add.diagram.edit.policies.AddBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SolidGreyLinkReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public SolidGreyLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof SolidGreyLink) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Node && newEnd instanceof Node)) {
			return false;
		}
		Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ADDDiagram)) {
			return false;
		}
		ADDDiagram container = (ADDDiagram) getLink().eContainer();
		return AddBaseItemSemanticEditPolicy.getLinkConstraints().canExistSolidGreyLink_4003(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Node && newEnd instanceof Node)) {
			return false;
		}
		Node source = getLink().getOrigin();
		if (!(getLink().eContainer() instanceof ADDDiagram)) {
			return false;
		}
		ADDDiagram container = (ADDDiagram) getLink().eContainer();
		return AddBaseItemSemanticEditPolicy.getLinkConstraints().canExistSolidGreyLink_4003(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setOrigin(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected SolidGreyLink getLink() {
		return (SolidGreyLink) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Node getOldSource() {
		return (Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected Node getNewSource() {
		return (Node) newEnd;
	}

	/**
	* @generated
	*/
	protected Node getOldTarget() {
		return (Node) oldEnd;
	}

	/**
	* @generated
	*/
	protected Node getNewTarget() {
		return (Node) newEnd;
	}
}
