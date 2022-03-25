/**
 */
package add;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Data#getName <em>Name</em>}</li>
 *   <li>{@link add.Data#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getData()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/023-data.png'"
 * @generated
 */
public interface Data extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Data [Optional]"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getData_Name()
	 * @model default="Data [Optional]"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Data#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link add.Datax}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see add.AddPackage#getData_Data()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	EList<Datax> getData();

} // Data
