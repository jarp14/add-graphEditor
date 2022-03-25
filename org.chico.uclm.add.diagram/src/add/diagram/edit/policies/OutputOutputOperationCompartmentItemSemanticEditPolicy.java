/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.OperationCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class OutputOutputOperationCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public OutputOutputOperationCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Output_2008);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Operation_3005 == req.getElementType()) {
			return getGEFWrapper(new OperationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
