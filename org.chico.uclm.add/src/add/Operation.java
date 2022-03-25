/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Operation#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getOperation()
 * @model annotation="gmf.node label='text' tool.name='Operation' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/006-sports-and-competition.png'"
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Operations and parameters>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getOperation_Text()
	 * @model default="&lt;Operations and parameters&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Operation#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Operation
