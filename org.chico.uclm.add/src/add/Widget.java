/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Widget#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getWidget()
 * @model annotation="gmf.node label='name' border.color='0,0,128' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/015-radar.png'"
 * @generated
 */
public interface Widget extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<x: WidgetX>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getWidget_Name()
	 * @model default="&lt;x: WidgetX&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Widget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Widget
