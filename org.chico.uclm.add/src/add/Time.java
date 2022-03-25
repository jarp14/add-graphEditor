/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Time#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getTime()
 * @model annotation="gmf.node label='text' tool.name='Temporality' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/010-alarm.png'"
 * @generated
 */
public interface Time extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Event temporality>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getTime_Text()
	 * @model default="&lt;Event temporality&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Time#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Time
