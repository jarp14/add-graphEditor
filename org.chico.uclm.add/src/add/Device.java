/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Device#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getDevice()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,128' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/014-game-controller.png'"
 * @generated
 */
public interface Device extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"<x: DeviceX>"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getDevice_Name()
	 * @model default="&lt;x: DeviceX&gt;"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Device#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Device
