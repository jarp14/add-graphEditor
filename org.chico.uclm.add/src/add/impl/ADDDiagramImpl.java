/**
 */
package add.impl;

import add.ADDDiagram;
import add.AddPackage;
import add.Link;
import add.Node;
import add.NoteNode;
import add.Sense;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ADD Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link add.impl.ADDDiagramImpl#getSenses <em>Senses</em>}</li>
 *   <li>{@link add.impl.ADDDiagramImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link add.impl.ADDDiagramImpl#getOthers <em>Others</em>}</li>
 *   <li>{@link add.impl.ADDDiagramImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ADDDiagramImpl extends EObjectImpl implements ADDDiagram {
	/**
	 * The cached value of the '{@link #getSenses() <em>Senses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenses()
	 * @generated
	 * @ordered
	 */
	protected EList<Sense> senses;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> elements;

	/**
	 * The cached value of the '{@link #getOthers() <em>Others</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOthers()
	 * @generated
	 * @ordered
	 */
	protected EList<NoteNode> others;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ADDDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AddPackage.Literals.ADD_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sense> getSenses() {
		if (senses == null) {
			senses = new EObjectContainmentEList<Sense>(Sense.class, this, AddPackage.ADD_DIAGRAM__SENSES);
		}
		return senses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<Node>(Node.class, this, AddPackage.ADD_DIAGRAM__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NoteNode> getOthers() {
		if (others == null) {
			others = new EObjectContainmentEList<NoteNode>(NoteNode.class, this, AddPackage.ADD_DIAGRAM__OTHERS);
		}
		return others;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, AddPackage.ADD_DIAGRAM__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AddPackage.ADD_DIAGRAM__SENSES:
				return ((InternalEList<?>)getSenses()).basicRemove(otherEnd, msgs);
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case AddPackage.ADD_DIAGRAM__OTHERS:
				return ((InternalEList<?>)getOthers()).basicRemove(otherEnd, msgs);
			case AddPackage.ADD_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AddPackage.ADD_DIAGRAM__SENSES:
				return getSenses();
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
				return getElements();
			case AddPackage.ADD_DIAGRAM__OTHERS:
				return getOthers();
			case AddPackage.ADD_DIAGRAM__LINKS:
				return getLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AddPackage.ADD_DIAGRAM__SENSES:
				getSenses().clear();
				getSenses().addAll((Collection<? extends Sense>)newValue);
				return;
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Node>)newValue);
				return;
			case AddPackage.ADD_DIAGRAM__OTHERS:
				getOthers().clear();
				getOthers().addAll((Collection<? extends NoteNode>)newValue);
				return;
			case AddPackage.ADD_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AddPackage.ADD_DIAGRAM__SENSES:
				getSenses().clear();
				return;
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
				getElements().clear();
				return;
			case AddPackage.ADD_DIAGRAM__OTHERS:
				getOthers().clear();
				return;
			case AddPackage.ADD_DIAGRAM__LINKS:
				getLinks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AddPackage.ADD_DIAGRAM__SENSES:
				return senses != null && !senses.isEmpty();
			case AddPackage.ADD_DIAGRAM__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case AddPackage.ADD_DIAGRAM__OTHERS:
				return others != null && !others.isEmpty();
			case AddPackage.ADD_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ADDDiagramImpl
