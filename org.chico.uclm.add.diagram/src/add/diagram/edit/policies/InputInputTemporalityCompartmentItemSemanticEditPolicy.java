/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.TimeCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class InputInputTemporalityCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public InputInputTemporalityCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Input_2007);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Time_3002 == req.getElementType()) {
			return getGEFWrapper(new TimeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
