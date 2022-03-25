/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.InteractionCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class InputInputInteractionCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInputInteractionCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Input_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Interaction_3001 == req.getElementType()) {
			return getGEFWrapper(new InteractionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
