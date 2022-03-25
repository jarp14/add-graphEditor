/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Element#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getElement()
 * @model annotation="gmf.node label='text' tool.name='Information element' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/002-button.png'"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Information element>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getElement_Text()
	 * @model default="&lt;Information element&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Element#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Element
