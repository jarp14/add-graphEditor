/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.AreaCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class AwarenessAwarenessAreaCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AwarenessAwarenessAreaCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Awareness_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Area_3007 == req.getElementType()) {
			return getGEFWrapper(new AreaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
