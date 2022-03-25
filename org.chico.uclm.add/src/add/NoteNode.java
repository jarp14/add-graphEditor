/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.NoteNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getNoteNode()
 * @model abstract="true"
 * @generated
 */
public interface NoteNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see add.AddPackage#getNoteNode_Name()
	 * @model default=" " changeable="false"
	 * @generated
	 */
	String getName();

} // NoteNode
