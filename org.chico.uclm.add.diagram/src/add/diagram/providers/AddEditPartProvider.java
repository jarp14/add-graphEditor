/*
 * 
 */
package add.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import add.diagram.edit.parts.ADDDiagramEditPart;
import add.diagram.edit.parts.AddEditPartFactory;
import add.diagram.part.AddVisualIDRegistry;

/**
 * @generated
 */
public class AddEditPartProvider extends DefaultEditPartProvider {

	/**
	* @generated
	*/
	public AddEditPartProvider() {
		super(new AddEditPartFactory(), AddVisualIDRegistry.TYPED_INSTANCE, ADDDiagramEditPart.MODEL_ID);
	}

}
