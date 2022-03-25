/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.Time2CreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class OutputOutputTemporalityCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OutputOutputTemporalityCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Output_2008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Time_3004 == req.getElementType()) {
			return getGEFWrapper(new Time2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
