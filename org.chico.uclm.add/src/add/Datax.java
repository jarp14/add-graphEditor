/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datax</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Datax#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getDatax()
 * @model annotation="gmf.node label='text' tool.name='Data parameter' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/024-bit.png'"
 * @generated
 */
public interface Datax extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<description>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getDatax_Text()
	 * @model default="&lt;description&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Datax#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Datax
