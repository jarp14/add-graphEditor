/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Interaction#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getInteraction()
 * @model annotation="gmf.node label='text' tool.name='Interaction' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/011-mouse.png'"
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Explicit | Implicit> interaction"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getInteraction_Text()
	 * @model default="&lt;Explicit | Implicit&gt; interaction"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Interaction#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Interaction
