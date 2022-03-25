/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Awareness</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.Awareness#getName <em>Name</em>}</li>
 *   <li>{@link add.Awareness#getArea <em>Area</em>}</li>
 *   <li>{@link add.Awareness#getDimension <em>Dimension</em>}</li>
 *   <li>{@link add.Awareness#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getAwareness()
 * @model annotation="gmf.node label='name' figure='rectangle' border.color='0,0,0' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/009-cardiogram.png'"
 * @generated
 */
public interface Awareness extends Node {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Awareness specification"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see add.AddPackage#getAwareness_Name()
	 * @model default="Awareness specification"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link add.Awareness#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference.
	 * @see #setArea(Area)
	 * @see add.AddPackage#getAwareness_Area()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link add.Awareness#getArea <em>Area</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' containment reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimension</em>' containment reference.
	 * @see #setDimension(Dimension)
	 * @see add.AddPackage#getAwareness_Dimension()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Dimension getDimension();

	/**
	 * Sets the value of the '{@link add.Awareness#getDimension <em>Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimension</em>' containment reference.
	 * @see #getDimension()
	 * @generated
	 */
	void setDimension(Dimension value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference.
	 * @see #setElement(Element)
	 * @see add.AddPackage#getAwareness_Element()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Element getElement();

	/**
	 * Sets the value of the '{@link add.Awareness#getElement <em>Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element</em>' containment reference.
	 * @see #getElement()
	 * @generated
	 */
	void setElement(Element value);

} // Awareness
