/*
* 
*/
package add.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class DashLinkItemSemanticEditPolicy extends AddBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DashLinkItemSemanticEditPolicy() {
		super(AddElementTypes.DashLink_4004);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
