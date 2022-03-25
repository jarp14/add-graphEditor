/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Dimension#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getDimension()
 * @model annotation="gmf.node label='text' tool.name='Awareness dimension' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/001-menu.png'"
 * @generated
 */
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Awareness dimension>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getDimension_Text()
	 * @model default="&lt;Awareness dimension&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Dimension#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Dimension
