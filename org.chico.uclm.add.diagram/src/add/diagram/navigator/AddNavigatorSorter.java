/*
* 
*/
package add.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import add.diagram.part.AddVisualIDRegistry;

/**
 * @generated
 */
public class AddNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7011;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7010;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof AddNavigatorItem) {
			AddNavigatorItem item = (AddNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return AddVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
