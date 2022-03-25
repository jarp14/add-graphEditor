/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.ElementCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class AwarenessAwarenessElementCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AwarenessAwarenessElementCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Awareness_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Element_3009 == req.getElementType()) {
			return getGEFWrapper(new ElementCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
