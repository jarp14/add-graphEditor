/**
 */
package add;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Grey Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.SolidGreyLink#getOrigin <em>Origin</em>}</li>
 *   <li>{@link add.SolidGreyLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getSolidGreyLink()
 * @model annotation="gmf.link source='origin' target='target' tool.name='Solid grey' style='solid' width='2' color='128,128,128' tool.small.bundle='org.chico.uclm.add.figuras' tool.small.path='images/026-solid-link-grey.png' target.decoration='arrow' source.constraint='self &lt;&gt; oppositeEnd' target.constraint='self &lt;&gt; oppositeEnd'"
 * @generated
 */
public interface SolidGreyLink extends Link {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference.
	 * @see #setOrigin(Node)
	 * @see add.AddPackage#getSolidGreyLink_Origin()
	 * @model required="true"
	 * @generated
	 */
	Node getOrigin();

	/**
	 * Sets the value of the '{@link add.SolidGreyLink#getOrigin <em>Origin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' reference.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see add.AddPackage#getSolidGreyLink_Target()
	 * @model required="true"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link add.SolidGreyLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // SolidGreyLink
