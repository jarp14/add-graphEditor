/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import add.diagram.edit.commands.DimensionCreateCommand;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class AwarenessAwarenessDimensionCompartmentItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AwarenessAwarenessDimensionCompartmentItemSemanticEditPolicy() {
		super(AddElementTypes.Awareness_2010);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (AddElementTypes.Dimension_3008 == req.getElementType()) {
			return getGEFWrapper(new DimensionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
