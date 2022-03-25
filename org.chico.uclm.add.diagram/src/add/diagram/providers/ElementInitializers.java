/*
 * 
 */
package add.diagram.providers;

import add.diagram.part.AddDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = AddDiagramEditorPlugin.getInstance().getElementInitializers();
		if (cached == null) {
			AddDiagramEditorPlugin.getInstance().setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
