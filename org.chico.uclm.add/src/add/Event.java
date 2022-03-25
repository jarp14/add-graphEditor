/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Event#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getEvent()
 * @model annotation="gmf.node label='text' tool.name='Event' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/016-drag.png'"
 * @generated
 */
public interface Event extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Event and parameters>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getEvent_Text()
	 * @model default="&lt;Event and parameters&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Event#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Event
