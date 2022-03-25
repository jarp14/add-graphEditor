/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Sense#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getSense()
 * @model abstract="true"
 * @generated
 */
public interface Sense extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>" "</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see add.AddPackage#getSense_Name()
	 * @model default=" " changeable="false"
	 * @generated
	 */
	String getName();

} // Sense
