/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Output#getName <em>Name</em>}</li>
 *   <li>{@link add.Output#getTemporality <em>Temporality</em>}</li>
 *   <li>{@link add.Output#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getOutput()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/004-download.png'"
 * @generated
 */
public interface Output extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Output"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getOutput_Name()
	 * @model default="Output"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Output#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporality</em>' containment reference.
	 * @see #setTemporality(Time)
	 * @see add.AddPackage#getOutput_Temporality()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Time getTemporality();

	/**
	 * Sets the value of the '{@link add.Output#getTemporality <em>Temporality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporality</em>' containment reference.
	 * @see #getTemporality()
	 * @generated
	 */
	void setTemporality(Time value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference.
	 * @see #setOperation(Operation)
	 * @see add.AddPackage#getOutput_Operation()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Sets the value of the '{@link add.Output#getOperation <em>Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' containment reference.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Operation value);

} // Output
