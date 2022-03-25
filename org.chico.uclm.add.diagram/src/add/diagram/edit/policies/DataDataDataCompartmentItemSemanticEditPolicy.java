/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.DataxCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class DataDataDataCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DataDataDataCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Data_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Datax_3006 == req.getElementType()) {
			return getGEFWrapper(new DataxCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
