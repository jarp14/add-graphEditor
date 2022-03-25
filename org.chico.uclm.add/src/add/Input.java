/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Input#getName <em>Name</em>}</li>
 *   <li>{@link add.Input#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link add.Input#getTemporality <em>Temporality</em>}</li>
 *   <li>{@link add.Input#getEvent <em>Event</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getInput()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/005-upload.png'"
 * @generated
 */
public interface Input extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Input"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getInput_Name()
	 * @model default="Input"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Input#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference.
	 * @see #setInteraction(Interaction)
	 * @see add.AddPackage#getInput_Interaction()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Interaction getInteraction();

	/**
	 * Sets the value of the '{@link add.Input#getInteraction <em>Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction</em>' containment reference.
	 * @see #getInteraction()
	 * @generated
	 */
	void setInteraction(Interaction value);

	/**
	 * Returns the value of the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temporality</em>' containment reference.
	 * @see #setTemporality(Time)
	 * @see add.AddPackage#getInput_Temporality()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Time getTemporality();

	/**
	 * Sets the value of the '{@link add.Input#getTemporality <em>Temporality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temporality</em>' containment reference.
	 * @see #getTemporality()
	 * @generated
	 */
	void setTemporality(Time value);

	/**
	 * Returns the value of the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event</em>' containment reference.
	 * @see #setEvent(Event)
	 * @see add.AddPackage#getInput_Event()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Event getEvent();

	/**
	 * Sets the value of the '{@link add.Input#getEvent <em>Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event</em>' containment reference.
	 * @see #getEvent()
	 * @generated
	 */
	void setEvent(Event value);

} // Input
