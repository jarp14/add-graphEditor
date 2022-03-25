/**
 */
package add;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Area#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getArea()
 * @model annotation="gmf.node label='text' tool.name='Awareness area' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/003-menu-1.png'"
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * The default value is <code>"<Awareness area>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see add.AddPackage#getArea_Text()
	 * @model default="&lt;Awareness area&gt;"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link add.Area#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // Area
