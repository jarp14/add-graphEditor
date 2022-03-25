/**
 */
package add.impl;

import add.ADDDiagram;
import add.AddFactory;
import add.AddPackage;
import add.Area;
import add.Awareness;
import add.Controller;
import add.DashLink;
import add.Data;
import add.Datax;
import add.Device;
import add.Dimension;
import add.Element;
import add.Environment;
import add.Event;
import add.Flow;
import add.Hear;
import add.Input;
import add.Interaction;
import add.Link;
import add.Node;
import add.NormalLink;
import add.NoteNode;
import add.Operation;
import add.Output;
import add.Sense;
import add.Share;
import add.Sight;
import add.Smell;
import add.SolidGreyLink;
import add.SolidLink;
import add.Taste;
import add.Time;
import add.Touch;
import add.Widget;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AddPackageImpl extends EPackageImpl implements AddPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awarenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass senseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidGreyLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see add.AddPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AddPackageImpl() {
		super(eNS_URI, AddFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link AddPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AddPackage init() {
		if (isInited) return (AddPackage)EPackage.Registry.INSTANCE.getEPackage(AddPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAddPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AddPackageImpl theAddPackage = registeredAddPackage instanceof AddPackageImpl ? (AddPackageImpl)registeredAddPackage : new AddPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theAddPackage.createPackageContents();

		// Initialize created meta-data
		theAddPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAddPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AddPackage.eNS_URI, theAddPackage);
		return theAddPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getADDDiagram() {
		return addDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getADDDiagram_Senses() {
		return (EReference)addDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getADDDiagram_Elements() {
		return (EReference)addDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getADDDiagram_Others() {
		return (EReference)addDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getADDDiagram_Links() {
		return (EReference)addDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getArea_Text() {
		return (EAttribute)areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDimension() {
		return dimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDimension_Text() {
		return (EAttribute)dimensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getElement_Text() {
		return (EAttribute)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInteraction_Text() {
		return (EAttribute)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTime() {
		return timeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTime_Text() {
		return (EAttribute)timeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Text() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_Text() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatax() {
		return dataxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatax_Text() {
		return (EAttribute)dataxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Name() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Interaction() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Temporality() {
		return (EReference)inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Event() {
		return (EReference)inputEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Name() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Temporality() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Operation() {
		return (EReference)outputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getData() {
		return dataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getData_Name() {
		return (EAttribute)dataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getData_Data() {
		return (EReference)dataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAwareness() {
		return awarenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAwareness_Name() {
		return (EAttribute)awarenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_Area() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_Dimension() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAwareness_Element() {
		return (EReference)awarenessEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDevice_Name() {
		return (EAttribute)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getController_Name() {
		return (EAttribute)controllerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSense() {
		return senseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSense_Name() {
		return (EAttribute)senseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSight() {
		return sightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTouch() {
		return touchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaste() {
		return tasteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHear() {
		return hearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSmell() {
		return smellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNoteNode() {
		return noteNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNoteNode_Name() {
		return (EAttribute)noteNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShare() {
		return shareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalLink() {
		return normalLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalLink_Origin() {
		return (EReference)normalLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalLink_Target() {
		return (EReference)normalLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidLink() {
		return solidLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidLink_Origin() {
		return (EReference)solidLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidLink_Target() {
		return (EReference)solidLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSolidGreyLink() {
		return solidGreyLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidGreyLink_Origin() {
		return (EReference)solidGreyLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSolidGreyLink_Target() {
		return (EReference)solidGreyLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDashLink() {
		return dashLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDashLink_Origin() {
		return (EReference)dashLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDashLink_Target() {
		return (EReference)dashLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddFactory getAddFactory() {
		return (AddFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		addDiagramEClass = createEClass(ADD_DIAGRAM);
		createEReference(addDiagramEClass, ADD_DIAGRAM__SENSES);
		createEReference(addDiagramEClass, ADD_DIAGRAM__ELEMENTS);
		createEReference(addDiagramEClass, ADD_DIAGRAM__OTHERS);
		createEReference(addDiagramEClass, ADD_DIAGRAM__LINKS);

		areaEClass = createEClass(AREA);
		createEAttribute(areaEClass, AREA__TEXT);

		dimensionEClass = createEClass(DIMENSION);
		createEAttribute(dimensionEClass, DIMENSION__TEXT);

		elementEClass = createEClass(ELEMENT);
		createEAttribute(elementEClass, ELEMENT__TEXT);

		interactionEClass = createEClass(INTERACTION);
		createEAttribute(interactionEClass, INTERACTION__TEXT);

		timeEClass = createEClass(TIME);
		createEAttribute(timeEClass, TIME__TEXT);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__TEXT);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__TEXT);

		dataxEClass = createEClass(DATAX);
		createEAttribute(dataxEClass, DATAX__TEXT);

		nodeEClass = createEClass(NODE);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__NAME);
		createEReference(inputEClass, INPUT__INTERACTION);
		createEReference(inputEClass, INPUT__TEMPORALITY);
		createEReference(inputEClass, INPUT__EVENT);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__NAME);
		createEReference(outputEClass, OUTPUT__TEMPORALITY);
		createEReference(outputEClass, OUTPUT__OPERATION);

		dataEClass = createEClass(DATA);
		createEAttribute(dataEClass, DATA__NAME);
		createEReference(dataEClass, DATA__DATA);

		awarenessEClass = createEClass(AWARENESS);
		createEAttribute(awarenessEClass, AWARENESS__NAME);
		createEReference(awarenessEClass, AWARENESS__AREA);
		createEReference(awarenessEClass, AWARENESS__DIMENSION);
		createEReference(awarenessEClass, AWARENESS__ELEMENT);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__NAME);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__NAME);

		controllerEClass = createEClass(CONTROLLER);
		createEAttribute(controllerEClass, CONTROLLER__NAME);

		senseEClass = createEClass(SENSE);
		createEAttribute(senseEClass, SENSE__NAME);

		sightEClass = createEClass(SIGHT);

		touchEClass = createEClass(TOUCH);

		tasteEClass = createEClass(TASTE);

		hearEClass = createEClass(HEAR);

		smellEClass = createEClass(SMELL);

		environmentEClass = createEClass(ENVIRONMENT);

		noteNodeEClass = createEClass(NOTE_NODE);
		createEAttribute(noteNodeEClass, NOTE_NODE__NAME);

		shareEClass = createEClass(SHARE);

		flowEClass = createEClass(FLOW);

		linkEClass = createEClass(LINK);

		normalLinkEClass = createEClass(NORMAL_LINK);
		createEReference(normalLinkEClass, NORMAL_LINK__ORIGIN);
		createEReference(normalLinkEClass, NORMAL_LINK__TARGET);

		solidLinkEClass = createEClass(SOLID_LINK);
		createEReference(solidLinkEClass, SOLID_LINK__ORIGIN);
		createEReference(solidLinkEClass, SOLID_LINK__TARGET);

		solidGreyLinkEClass = createEClass(SOLID_GREY_LINK);
		createEReference(solidGreyLinkEClass, SOLID_GREY_LINK__ORIGIN);
		createEReference(solidGreyLinkEClass, SOLID_GREY_LINK__TARGET);

		dashLinkEClass = createEClass(DASH_LINK);
		createEReference(dashLinkEClass, DASH_LINK__ORIGIN);
		createEReference(dashLinkEClass, DASH_LINK__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputEClass.getESuperTypes().add(this.getNode());
		outputEClass.getESuperTypes().add(this.getNode());
		dataEClass.getESuperTypes().add(this.getNode());
		awarenessEClass.getESuperTypes().add(this.getNode());
		widgetEClass.getESuperTypes().add(this.getNode());
		deviceEClass.getESuperTypes().add(this.getNode());
		controllerEClass.getESuperTypes().add(this.getNode());
		sightEClass.getESuperTypes().add(this.getSense());
		touchEClass.getESuperTypes().add(this.getSense());
		tasteEClass.getESuperTypes().add(this.getSense());
		hearEClass.getESuperTypes().add(this.getSense());
		smellEClass.getESuperTypes().add(this.getSense());
		environmentEClass.getESuperTypes().add(this.getSense());
		shareEClass.getESuperTypes().add(this.getNoteNode());
		flowEClass.getESuperTypes().add(this.getNoteNode());
		normalLinkEClass.getESuperTypes().add(this.getLink());
		solidLinkEClass.getESuperTypes().add(this.getLink());
		solidGreyLinkEClass.getESuperTypes().add(this.getLink());
		dashLinkEClass.getESuperTypes().add(this.getLink());

		// Initialize classes and features; add operations and parameters
		initEClass(addDiagramEClass, ADDDiagram.class, "ADDDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getADDDiagram_Senses(), this.getSense(), null, "senses", null, 0, -1, ADDDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADDDiagram_Elements(), this.getNode(), null, "elements", null, 0, -1, ADDDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADDDiagram_Others(), this.getNoteNode(), null, "others", null, 0, -1, ADDDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getADDDiagram_Links(), this.getLink(), null, "links", null, 0, -1, ADDDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArea_Text(), ecorePackage.getEString(), "text", "<Awareness area>", 0, 1, Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dimensionEClass, Dimension.class, "Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDimension_Text(), ecorePackage.getEString(), "text", "<Awareness dimension>", 0, 1, Dimension.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElement_Text(), ecorePackage.getEString(), "text", "<Information element>", 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteraction_Text(), ecorePackage.getEString(), "text", "<Explicit | Implicit> interaction", 0, 1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeEClass, Time.class, "Time", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTime_Text(), ecorePackage.getEString(), "text", "<Event temporality>", 0, 1, Time.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Text(), ecorePackage.getEString(), "text", "<Event and parameters>", 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Text(), ecorePackage.getEString(), "text", "<Operations and parameters>", 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataxEClass, Datax.class, "Datax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatax_Text(), ecorePackage.getEString(), "text", "<description>", 0, 1, Datax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", "Input", 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Interaction(), this.getInteraction(), null, "interaction", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Temporality(), this.getTime(), null, "temporality", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Event(), this.getEvent(), null, "event", null, 1, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Name(), ecorePackage.getEString(), "name", "Output", 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Temporality(), this.getTime(), null, "temporality", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Operation(), this.getOperation(), null, "operation", null, 1, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataEClass, Data.class, "Data", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getData_Name(), ecorePackage.getEString(), "name", "Data [Optional]", 0, 1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getData_Data(), this.getDatax(), null, "data", null, 0, -1, Data.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(awarenessEClass, Awareness.class, "Awareness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAwareness_Name(), ecorePackage.getEString(), "name", "Awareness specification", 0, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_Area(), this.getArea(), null, "area", null, 1, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_Dimension(), this.getDimension(), null, "dimension", null, 1, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAwareness_Element(), this.getElement(), null, "element", null, 1, 1, Awareness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_Name(), ecorePackage.getEString(), "name", "<x: WidgetX>", 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Name(), ecorePackage.getEString(), "name", "<x: DeviceX>", 0, 1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getController_Name(), ecorePackage.getEString(), "name", "<x: ControllerX>", 0, 1, Controller.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(senseEClass, Sense.class, "Sense", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSense_Name(), ecorePackage.getEString(), "name", " ", 0, 1, Sense.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sightEClass, Sight.class, "Sight", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchEClass, Touch.class, "Touch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tasteEClass, Taste.class, "Taste", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hearEClass, Hear.class, "Hear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smellEClass, Smell.class, "Smell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(environmentEClass, Environment.class, "Environment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noteNodeEClass, NoteNode.class, "NoteNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteNode_Name(), ecorePackage.getEString(), "name", " ", 0, 1, NoteNode.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shareEClass, Share.class, "Share", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEClass, Link.class, "Link", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(normalLinkEClass, NormalLink.class, "NormalLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNormalLink_Origin(), this.getNode(), null, "origin", null, 1, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNormalLink_Target(), this.getNode(), null, "target", null, 1, 1, NormalLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solidLinkEClass, SolidLink.class, "SolidLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolidLink_Origin(), this.getNode(), null, "origin", null, 1, 1, SolidLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolidLink_Target(), this.getNode(), null, "target", null, 1, 1, SolidLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(solidGreyLinkEClass, SolidGreyLink.class, "SolidGreyLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolidGreyLink_Origin(), this.getNode(), null, "origin", null, 1, 1, SolidGreyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSolidGreyLink_Target(), this.getNode(), null, "target", null, 1, 1, SolidGreyLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dashLinkEClass, DashLink.class, "DashLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDashLink_Origin(), this.getNode(), null, "origin", null, 1, 1, DashLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashLink_Target(), this.getNode(), null, "target", null, 1, 1, DashLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
		// gmf.link
		createGmf_4Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (addDiagramEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (areaEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Awareness area",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/003-menu-1.png"
		   });
		addAnnotation
		  (dimensionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Awareness dimension",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/001-menu.png"
		   });
		addAnnotation
		  (elementEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Information element",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/002-button.png"
		   });
		addAnnotation
		  (interactionEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Interaction",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/011-mouse.png"
		   });
		addAnnotation
		  (timeEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Temporality",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/010-alarm.png"
		   });
		addAnnotation
		  (eventEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Event",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/016-drag.png"
		   });
		addAnnotation
		  (operationEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Operation",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/006-sports-and-competition.png"
		   });
		addAnnotation
		  (dataxEClass,
		   source,
		   new String[] {
			   "label", "text",
			   "tool.name", "Data parameter",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/024-bit.png"
		   });
		addAnnotation
		  (inputEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/005-upload.png"
		   });
		addAnnotation
		  (outputEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/004-download.png"
		   });
		addAnnotation
		  (dataEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/023-data.png"
		   });
		addAnnotation
		  (awarenessEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/009-cardiogram.png"
		   });
		addAnnotation
		  (widgetEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "border.color", "0,0,128",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/015-radar.png"
		   });
		addAnnotation
		  (deviceEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "figure", "rectangle",
			   "border.color", "0,0,128",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/014-game-controller.png"
		   });
		addAnnotation
		  (controllerEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "border.color", "0,0,128",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/013-cogwheel.png"
		   });
		addAnnotation
		  (sightEClass,
		   source,
		   new String[] {
			   "figure", "VistaFigura",
			   "tool.name", "Sight",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/008-eye.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (touchEClass,
		   source,
		   new String[] {
			   "figure", "TactoFigura",
			   "tool.name", "Touch",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/017-hold.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (tasteEClass,
		   source,
		   new String[] {
			   "figure", "GustoFigura",
			   "tool.name", "Taste",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/018-tongue.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (hearEClass,
		   source,
		   new String[] {
			   "figure", "OidoFigura",
			   "tool.name", "Hear",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/019-ear.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (smellEClass,
		   source,
		   new String[] {
			   "figure", "NarizFigura",
			   "tool.name", "Smell",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/020-nose.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (environmentEClass,
		   source,
		   new String[] {
			   "figure", "EntornoFigura",
			   "tool.name", "Environment",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/022-sensor.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (shareEClass,
		   source,
		   new String[] {
			   "figure", "CompartirFigura",
			   "tool.name", "Share",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/021-share.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
		addAnnotation
		  (flowEClass,
		   source,
		   new String[] {
			   "figure", "FlujoFigura",
			   "tool.name", "Flow",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/007-flow.png",
			   "label", "name",
			   "label.icon", "false",
			   "label.placement", "external",
			   "resizable", "false",
			   "size", "16,16"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getInput_Interaction(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getInput_Temporality(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getInput_Event(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getOutput_Temporality(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getOutput_Operation(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getData_Data(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getAwareness_Area(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getAwareness_Dimension(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getAwareness_Element(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (normalLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Link",
			   "style", "solid",
			   "width", "1",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/027-link.png",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (solidLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Solid black",
			   "style", "solid",
			   "width", "2",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/025-solid-link.png",
			   "target.decoration", "arrow",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (solidGreyLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Solid grey",
			   "style", "solid",
			   "width", "2",
			   "color", "128,128,128",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/026-solid-link-grey.png",
			   "target.decoration", "arrow",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
		addAnnotation
		  (dashLinkEClass,
		   source,
		   new String[] {
			   "source", "origin",
			   "target", "target",
			   "tool.name", "Dash",
			   "style", "dash",
			   "width", "2",
			   "color", "0,0,0",
			   "tool.small.bundle", "org.chico.uclm.add.figuras",
			   "tool.small.path", "images/028-dash-link.gif",
			   "target.decoration", "arrow",
			   "source.constraint", "self <> oppositeEnd",
			   "target.constraint", "self <> oppositeEnd"
		   });
	}

} //AddPackageImpl
