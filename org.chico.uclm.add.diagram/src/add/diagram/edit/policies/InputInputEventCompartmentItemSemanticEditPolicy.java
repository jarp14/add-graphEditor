/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.EventCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class InputInputEventCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInputEventCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Input_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Event_3003 == req.getElementType()) {
			return getGEFWrapper(new EventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
