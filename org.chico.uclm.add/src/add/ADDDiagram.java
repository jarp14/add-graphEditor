/**
 */
package add;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ADD Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link add.ADDDiagram#getSenses <em>Senses</em>}</li>
 *   <li>{@link add.ADDDiagram#getElements <em>Elements</em>}</li>
 *   <li>{@link add.ADDDiagram#getOthers <em>Others</em>}</li>
 *   <li>{@link add.ADDDiagram#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @see add.AddPackage#getADDDiagram()
 * @model annotation="gmf.diagram"
 * @generated
 */
public interface ADDDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Senses</b></em>' containment reference list.
	 * The list contents are of type {@link add.Sense}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Senses</em>' containment reference list.
	 * @see add.AddPackage#getADDDiagram_Senses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Sense> getSenses();

	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link add.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see add.AddPackage#getADDDiagram_Elements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getElements();

	/**
	 * Returns the value of the '<em><b>Others</b></em>' containment reference list.
	 * The list contents are of type {@link add.NoteNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' containment reference list.
	 * @see add.AddPackage#getADDDiagram_Others()
	 * @model containment="true"
	 * @generated
	 */
	EList<NoteNode> getOthers();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link add.Link}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see add.AddPackage#getADDDiagram_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

} // ADDDiagram
