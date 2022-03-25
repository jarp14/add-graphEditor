/**
 */
package add;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see add.AddFactory
 * @model kind="package"
 *        annotation="gmf"
 * @generated
 */
public interface AddPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "add";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "add";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "add";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AddPackage eINSTANCE = add.impl.AddPackageImpl.init();

	/**
	 * The meta object id for the '{@link add.impl.ADDDiagramImpl <em>ADD Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.ADDDiagramImpl
	 * @see add.impl.AddPackageImpl#getADDDiagram()
	 * @generated
	 */
	int ADD_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Senses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DIAGRAM__SENSES = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DIAGRAM__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Others</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DIAGRAM__OTHERS = 2;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DIAGRAM__LINKS = 3;

	/**
	 * The number of structural features of the '<em>ADD Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link add.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.AreaImpl
	 * @see add.impl.AddPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.DimensionImpl
	 * @see add.impl.AddPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.ElementImpl
	 * @see add.impl.AddPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.InteractionImpl <em>Interaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.InteractionImpl
	 * @see add.impl.AddPackageImpl#getInteraction()
	 * @generated
	 */
	int INTERACTION = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Interaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.TimeImpl <em>Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.TimeImpl
	 * @see add.impl.AddPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.EventImpl
	 * @see add.impl.AddPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.OperationImpl
	 * @see add.impl.AddPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.DataxImpl <em>Datax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.DataxImpl
	 * @see add.impl.AddPackageImpl#getDatax()
	 * @generated
	 */
	int DATAX = 8;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAX__TEXT = 0;

	/**
	 * The number of structural features of the '<em>Datax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATAX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.NodeImpl
	 * @see add.impl.AddPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 9;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link add.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.InputImpl
	 * @see add.impl.AddPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INTERACTION = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TEMPORALITY = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__EVENT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link add.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.OutputImpl
	 * @see add.impl.AddPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Temporality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TEMPORALITY = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__OPERATION = NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = NODE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link add.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.DataImpl
	 * @see add.impl.AddPackageImpl#getData()
	 * @generated
	 */
	int DATA = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__DATA = NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link add.impl.AwarenessImpl <em>Awareness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.AwarenessImpl
	 * @see add.impl.AddPackageImpl#getAwareness()
	 * @generated
	 */
	int AWARENESS = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS__AREA = NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS__DIMENSION = NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS__ELEMENT = NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Awareness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWARENESS_FEATURE_COUNT = NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link add.impl.WidgetImpl <em>Widget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.WidgetImpl
	 * @see add.impl.AddPackageImpl#getWidget()
	 * @generated
	 */
	int WIDGET = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Widget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIDGET_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link add.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.DeviceImpl
	 * @see add.impl.AddPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link add.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.ControllerImpl
	 * @see add.impl.AddPackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link add.impl.SenseImpl <em>Sense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.SenseImpl
	 * @see add.impl.AddPackageImpl#getSense()
	 * @generated
	 */
	int SENSE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Sense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.SightImpl <em>Sight</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.SightImpl
	 * @see add.impl.AddPackageImpl#getSight()
	 * @generated
	 */
	int SIGHT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGHT__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Sight</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGHT_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.TouchImpl <em>Touch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.TouchImpl
	 * @see add.impl.AddPackageImpl#getTouch()
	 * @generated
	 */
	int TOUCH = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Touch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOUCH_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.TasteImpl <em>Taste</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.TasteImpl
	 * @see add.impl.AddPackageImpl#getTaste()
	 * @generated
	 */
	int TASTE = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Taste</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASTE_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.HearImpl <em>Hear</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.HearImpl
	 * @see add.impl.AddPackageImpl#getHear()
	 * @generated
	 */
	int HEAR = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAR__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Hear</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEAR_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.SmellImpl <em>Smell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.SmellImpl
	 * @see add.impl.AddPackageImpl#getSmell()
	 * @generated
	 */
	int SMELL = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMELL__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Smell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMELL_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.EnvironmentImpl <em>Environment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.EnvironmentImpl
	 * @see add.impl.AddPackageImpl#getEnvironment()
	 * @generated
	 */
	int ENVIRONMENT = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT__NAME = SENSE__NAME;

	/**
	 * The number of structural features of the '<em>Environment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_FEATURE_COUNT = SENSE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.NoteNodeImpl <em>Note Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.NoteNodeImpl
	 * @see add.impl.AddPackageImpl#getNoteNode()
	 * @generated
	 */
	int NOTE_NODE = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_NODE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Note Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_NODE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link add.impl.ShareImpl <em>Share</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.ShareImpl
	 * @see add.impl.AddPackageImpl#getShare()
	 * @generated
	 */
	int SHARE = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE__NAME = NOTE_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Share</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARE_FEATURE_COUNT = NOTE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.FlowImpl
	 * @see add.impl.AddPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__NAME = NOTE_NODE__NAME;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = NOTE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link add.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.LinkImpl
	 * @see add.impl.AddPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 27;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link add.impl.NormalLinkImpl <em>Normal Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.NormalLinkImpl
	 * @see add.impl.AddPackageImpl#getNormalLink()
	 * @generated
	 */
	int NORMAL_LINK = 28;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Normal Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NORMAL_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link add.impl.SolidLinkImpl <em>Solid Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.SolidLinkImpl
	 * @see add.impl.AddPackageImpl#getSolidLink()
	 * @generated
	 */
	int SOLID_LINK = 29;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solid Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link add.impl.SolidGreyLinkImpl <em>Solid Grey Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.SolidGreyLinkImpl
	 * @see add.impl.AddPackageImpl#getSolidGreyLink()
	 * @generated
	 */
	int SOLID_GREY_LINK = 30;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_GREY_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_GREY_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Solid Grey Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_GREY_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link add.impl.DashLinkImpl <em>Dash Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see add.impl.DashLinkImpl
	 * @see add.impl.AddPackageImpl#getDashLink()
	 * @generated
	 */
	int DASH_LINK = 31;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_LINK__ORIGIN = LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_LINK__TARGET = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dash Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASH_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 2;


	/**
	 * Returns the meta object for class '{@link add.ADDDiagram <em>ADD Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADD Diagram</em>'.
	 * @see add.ADDDiagram
	 * @generated
	 */
	EClass getADDDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link add.ADDDiagram#getSenses <em>Senses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Senses</em>'.
	 * @see add.ADDDiagram#getSenses()
	 * @see #getADDDiagram()
	 * @generated
	 */
	EReference getADDDiagram_Senses();

	/**
	 * Returns the meta object for the containment reference list '{@link add.ADDDiagram#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see add.ADDDiagram#getElements()
	 * @see #getADDDiagram()
	 * @generated
	 */
	EReference getADDDiagram_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link add.ADDDiagram#getOthers <em>Others</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Others</em>'.
	 * @see add.ADDDiagram#getOthers()
	 * @see #getADDDiagram()
	 * @generated
	 */
	EReference getADDDiagram_Others();

	/**
	 * Returns the meta object for the containment reference list '{@link add.ADDDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see add.ADDDiagram#getLinks()
	 * @see #getADDDiagram()
	 * @generated
	 */
	EReference getADDDiagram_Links();

	/**
	 * Returns the meta object for class '{@link add.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see add.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the attribute '{@link add.Area#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Area#getText()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Text();

	/**
	 * Returns the meta object for class '{@link add.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see add.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link add.Dimension#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Dimension#getText()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Text();

	/**
	 * Returns the meta object for class '{@link add.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see add.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the attribute '{@link add.Element#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Element#getText()
	 * @see #getElement()
	 * @generated
	 */
	EAttribute getElement_Text();

	/**
	 * Returns the meta object for class '{@link add.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction</em>'.
	 * @see add.Interaction
	 * @generated
	 */
	EClass getInteraction();

	/**
	 * Returns the meta object for the attribute '{@link add.Interaction#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Interaction#getText()
	 * @see #getInteraction()
	 * @generated
	 */
	EAttribute getInteraction_Text();

	/**
	 * Returns the meta object for class '{@link add.Time <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time</em>'.
	 * @see add.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for the attribute '{@link add.Time#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Time#getText()
	 * @see #getTime()
	 * @generated
	 */
	EAttribute getTime_Text();

	/**
	 * Returns the meta object for class '{@link add.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see add.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link add.Event#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Event#getText()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Text();

	/**
	 * Returns the meta object for class '{@link add.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see add.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link add.Operation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Operation#getText()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Text();

	/**
	 * Returns the meta object for class '{@link add.Datax <em>Datax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Datax</em>'.
	 * @see add.Datax
	 * @generated
	 */
	EClass getDatax();

	/**
	 * Returns the meta object for the attribute '{@link add.Datax#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see add.Datax#getText()
	 * @see #getDatax()
	 * @generated
	 */
	EAttribute getDatax_Text();

	/**
	 * Returns the meta object for class '{@link add.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see add.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for class '{@link add.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see add.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link add.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the containment reference '{@link add.Input#getInteraction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Interaction</em>'.
	 * @see add.Input#getInteraction()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Interaction();

	/**
	 * Returns the meta object for the containment reference '{@link add.Input#getTemporality <em>Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporality</em>'.
	 * @see add.Input#getTemporality()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Temporality();

	/**
	 * Returns the meta object for the containment reference '{@link add.Input#getEvent <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Event</em>'.
	 * @see add.Input#getEvent()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Event();

	/**
	 * Returns the meta object for class '{@link add.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see add.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link add.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the containment reference '{@link add.Output#getTemporality <em>Temporality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporality</em>'.
	 * @see add.Output#getTemporality()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Temporality();

	/**
	 * Returns the meta object for the containment reference '{@link add.Output#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operation</em>'.
	 * @see add.Output#getOperation()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Operation();

	/**
	 * Returns the meta object for class '{@link add.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see add.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for the attribute '{@link add.Data#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Data#getName()
	 * @see #getData()
	 * @generated
	 */
	EAttribute getData_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link add.Data#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see add.Data#getData()
	 * @see #getData()
	 * @generated
	 */
	EReference getData_Data();

	/**
	 * Returns the meta object for class '{@link add.Awareness <em>Awareness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Awareness</em>'.
	 * @see add.Awareness
	 * @generated
	 */
	EClass getAwareness();

	/**
	 * Returns the meta object for the attribute '{@link add.Awareness#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Awareness#getName()
	 * @see #getAwareness()
	 * @generated
	 */
	EAttribute getAwareness_Name();

	/**
	 * Returns the meta object for the containment reference '{@link add.Awareness#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Area</em>'.
	 * @see add.Awareness#getArea()
	 * @see #getAwareness()
	 * @generated
	 */
	EReference getAwareness_Area();

	/**
	 * Returns the meta object for the containment reference '{@link add.Awareness#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see add.Awareness#getDimension()
	 * @see #getAwareness()
	 * @generated
	 */
	EReference getAwareness_Dimension();

	/**
	 * Returns the meta object for the containment reference '{@link add.Awareness#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see add.Awareness#getElement()
	 * @see #getAwareness()
	 * @generated
	 */
	EReference getAwareness_Element();

	/**
	 * Returns the meta object for class '{@link add.Widget <em>Widget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Widget</em>'.
	 * @see add.Widget
	 * @generated
	 */
	EClass getWidget();

	/**
	 * Returns the meta object for the attribute '{@link add.Widget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Widget#getName()
	 * @see #getWidget()
	 * @generated
	 */
	EAttribute getWidget_Name();

	/**
	 * Returns the meta object for class '{@link add.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see add.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link add.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for class '{@link add.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see add.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link add.Controller#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Controller#getName()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Name();

	/**
	 * Returns the meta object for class '{@link add.Sense <em>Sense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sense</em>'.
	 * @see add.Sense
	 * @generated
	 */
	EClass getSense();

	/**
	 * Returns the meta object for the attribute '{@link add.Sense#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.Sense#getName()
	 * @see #getSense()
	 * @generated
	 */
	EAttribute getSense_Name();

	/**
	 * Returns the meta object for class '{@link add.Sight <em>Sight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sight</em>'.
	 * @see add.Sight
	 * @generated
	 */
	EClass getSight();

	/**
	 * Returns the meta object for class '{@link add.Touch <em>Touch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Touch</em>'.
	 * @see add.Touch
	 * @generated
	 */
	EClass getTouch();

	/**
	 * Returns the meta object for class '{@link add.Taste <em>Taste</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taste</em>'.
	 * @see add.Taste
	 * @generated
	 */
	EClass getTaste();

	/**
	 * Returns the meta object for class '{@link add.Hear <em>Hear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hear</em>'.
	 * @see add.Hear
	 * @generated
	 */
	EClass getHear();

	/**
	 * Returns the meta object for class '{@link add.Smell <em>Smell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smell</em>'.
	 * @see add.Smell
	 * @generated
	 */
	EClass getSmell();

	/**
	 * Returns the meta object for class '{@link add.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment</em>'.
	 * @see add.Environment
	 * @generated
	 */
	EClass getEnvironment();

	/**
	 * Returns the meta object for class '{@link add.NoteNode <em>Note Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Node</em>'.
	 * @see add.NoteNode
	 * @generated
	 */
	EClass getNoteNode();

	/**
	 * Returns the meta object for the attribute '{@link add.NoteNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see add.NoteNode#getName()
	 * @see #getNoteNode()
	 * @generated
	 */
	EAttribute getNoteNode_Name();

	/**
	 * Returns the meta object for class '{@link add.Share <em>Share</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Share</em>'.
	 * @see add.Share
	 * @generated
	 */
	EClass getShare();

	/**
	 * Returns the meta object for class '{@link add.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see add.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for class '{@link add.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see add.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for class '{@link add.NormalLink <em>Normal Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normal Link</em>'.
	 * @see add.NormalLink
	 * @generated
	 */
	EClass getNormalLink();

	/**
	 * Returns the meta object for the reference '{@link add.NormalLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see add.NormalLink#getOrigin()
	 * @see #getNormalLink()
	 * @generated
	 */
	EReference getNormalLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link add.NormalLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see add.NormalLink#getTarget()
	 * @see #getNormalLink()
	 * @generated
	 */
	EReference getNormalLink_Target();

	/**
	 * Returns the meta object for class '{@link add.SolidLink <em>Solid Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid Link</em>'.
	 * @see add.SolidLink
	 * @generated
	 */
	EClass getSolidLink();

	/**
	 * Returns the meta object for the reference '{@link add.SolidLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see add.SolidLink#getOrigin()
	 * @see #getSolidLink()
	 * @generated
	 */
	EReference getSolidLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link add.SolidLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see add.SolidLink#getTarget()
	 * @see #getSolidLink()
	 * @generated
	 */
	EReference getSolidLink_Target();

	/**
	 * Returns the meta object for class '{@link add.SolidGreyLink <em>Solid Grey Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid Grey Link</em>'.
	 * @see add.SolidGreyLink
	 * @generated
	 */
	EClass getSolidGreyLink();

	/**
	 * Returns the meta object for the reference '{@link add.SolidGreyLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see add.SolidGreyLink#getOrigin()
	 * @see #getSolidGreyLink()
	 * @generated
	 */
	EReference getSolidGreyLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link add.SolidGreyLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see add.SolidGreyLink#getTarget()
	 * @see #getSolidGreyLink()
	 * @generated
	 */
	EReference getSolidGreyLink_Target();

	/**
	 * Returns the meta object for class '{@link add.DashLink <em>Dash Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dash Link</em>'.
	 * @see add.DashLink
	 * @generated
	 */
	EClass getDashLink();

	/**
	 * Returns the meta object for the reference '{@link add.DashLink#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see add.DashLink#getOrigin()
	 * @see #getDashLink()
	 * @generated
	 */
	EReference getDashLink_Origin();

	/**
	 * Returns the meta object for the reference '{@link add.DashLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see add.DashLink#getTarget()
	 * @see #getDashLink()
	 * @generated
	 */
	EReference getDashLink_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AddFactory getAddFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link add.impl.ADDDiagramImpl <em>ADD Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.ADDDiagramImpl
		 * @see add.impl.AddPackageImpl#getADDDiagram()
		 * @generated
		 */
		EClass ADD_DIAGRAM = eINSTANCE.getADDDiagram();

		/**
		 * The meta object literal for the '<em><b>Senses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_DIAGRAM__SENSES = eINSTANCE.getADDDiagram_Senses();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_DIAGRAM__ELEMENTS = eINSTANCE.getADDDiagram_Elements();

		/**
		 * The meta object literal for the '<em><b>Others</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_DIAGRAM__OTHERS = eINSTANCE.getADDDiagram_Others();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADD_DIAGRAM__LINKS = eINSTANCE.getADDDiagram_Links();

		/**
		 * The meta object literal for the '{@link add.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.AreaImpl
		 * @see add.impl.AddPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__TEXT = eINSTANCE.getArea_Text();

		/**
		 * The meta object literal for the '{@link add.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.DimensionImpl
		 * @see add.impl.AddPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__TEXT = eINSTANCE.getDimension_Text();

		/**
		 * The meta object literal for the '{@link add.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.ElementImpl
		 * @see add.impl.AddPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT__TEXT = eINSTANCE.getElement_Text();

		/**
		 * The meta object literal for the '{@link add.impl.InteractionImpl <em>Interaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.InteractionImpl
		 * @see add.impl.AddPackageImpl#getInteraction()
		 * @generated
		 */
		EClass INTERACTION = eINSTANCE.getInteraction();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION__TEXT = eINSTANCE.getInteraction_Text();

		/**
		 * The meta object literal for the '{@link add.impl.TimeImpl <em>Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.TimeImpl
		 * @see add.impl.AddPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME__TEXT = eINSTANCE.getTime_Text();

		/**
		 * The meta object literal for the '{@link add.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.EventImpl
		 * @see add.impl.AddPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__TEXT = eINSTANCE.getEvent_Text();

		/**
		 * The meta object literal for the '{@link add.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.OperationImpl
		 * @see add.impl.AddPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__TEXT = eINSTANCE.getOperation_Text();

		/**
		 * The meta object literal for the '{@link add.impl.DataxImpl <em>Datax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.DataxImpl
		 * @see add.impl.AddPackageImpl#getDatax()
		 * @generated
		 */
		EClass DATAX = eINSTANCE.getDatax();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATAX__TEXT = eINSTANCE.getDatax_Text();

		/**
		 * The meta object literal for the '{@link add.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.NodeImpl
		 * @see add.impl.AddPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '{@link add.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.InputImpl
		 * @see add.impl.AddPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Interaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__INTERACTION = eINSTANCE.getInput_Interaction();

		/**
		 * The meta object literal for the '<em><b>Temporality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__TEMPORALITY = eINSTANCE.getInput_Temporality();

		/**
		 * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__EVENT = eINSTANCE.getInput_Event();

		/**
		 * The meta object literal for the '{@link add.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.OutputImpl
		 * @see add.impl.AddPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Temporality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__TEMPORALITY = eINSTANCE.getOutput_Temporality();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__OPERATION = eINSTANCE.getOutput_Operation();

		/**
		 * The meta object literal for the '{@link add.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.DataImpl
		 * @see add.impl.AddPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA__NAME = eINSTANCE.getData_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA__DATA = eINSTANCE.getData_Data();

		/**
		 * The meta object literal for the '{@link add.impl.AwarenessImpl <em>Awareness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.AwarenessImpl
		 * @see add.impl.AddPackageImpl#getAwareness()
		 * @generated
		 */
		EClass AWARENESS = eINSTANCE.getAwareness();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AWARENESS__NAME = eINSTANCE.getAwareness_Name();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWARENESS__AREA = eINSTANCE.getAwareness_Area();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWARENESS__DIMENSION = eINSTANCE.getAwareness_Dimension();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AWARENESS__ELEMENT = eINSTANCE.getAwareness_Element();

		/**
		 * The meta object literal for the '{@link add.impl.WidgetImpl <em>Widget</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.WidgetImpl
		 * @see add.impl.AddPackageImpl#getWidget()
		 * @generated
		 */
		EClass WIDGET = eINSTANCE.getWidget();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIDGET__NAME = eINSTANCE.getWidget_Name();

		/**
		 * The meta object literal for the '{@link add.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.DeviceImpl
		 * @see add.impl.AddPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '{@link add.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.ControllerImpl
		 * @see add.impl.AddPackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__NAME = eINSTANCE.getController_Name();

		/**
		 * The meta object literal for the '{@link add.impl.SenseImpl <em>Sense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.SenseImpl
		 * @see add.impl.AddPackageImpl#getSense()
		 * @generated
		 */
		EClass SENSE = eINSTANCE.getSense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSE__NAME = eINSTANCE.getSense_Name();

		/**
		 * The meta object literal for the '{@link add.impl.SightImpl <em>Sight</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.SightImpl
		 * @see add.impl.AddPackageImpl#getSight()
		 * @generated
		 */
		EClass SIGHT = eINSTANCE.getSight();

		/**
		 * The meta object literal for the '{@link add.impl.TouchImpl <em>Touch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.TouchImpl
		 * @see add.impl.AddPackageImpl#getTouch()
		 * @generated
		 */
		EClass TOUCH = eINSTANCE.getTouch();

		/**
		 * The meta object literal for the '{@link add.impl.TasteImpl <em>Taste</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.TasteImpl
		 * @see add.impl.AddPackageImpl#getTaste()
		 * @generated
		 */
		EClass TASTE = eINSTANCE.getTaste();

		/**
		 * The meta object literal for the '{@link add.impl.HearImpl <em>Hear</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.HearImpl
		 * @see add.impl.AddPackageImpl#getHear()
		 * @generated
		 */
		EClass HEAR = eINSTANCE.getHear();

		/**
		 * The meta object literal for the '{@link add.impl.SmellImpl <em>Smell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.SmellImpl
		 * @see add.impl.AddPackageImpl#getSmell()
		 * @generated
		 */
		EClass SMELL = eINSTANCE.getSmell();

		/**
		 * The meta object literal for the '{@link add.impl.EnvironmentImpl <em>Environment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.EnvironmentImpl
		 * @see add.impl.AddPackageImpl#getEnvironment()
		 * @generated
		 */
		EClass ENVIRONMENT = eINSTANCE.getEnvironment();

		/**
		 * The meta object literal for the '{@link add.impl.NoteNodeImpl <em>Note Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.NoteNodeImpl
		 * @see add.impl.AddPackageImpl#getNoteNode()
		 * @generated
		 */
		EClass NOTE_NODE = eINSTANCE.getNoteNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_NODE__NAME = eINSTANCE.getNoteNode_Name();

		/**
		 * The meta object literal for the '{@link add.impl.ShareImpl <em>Share</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.ShareImpl
		 * @see add.impl.AddPackageImpl#getShare()
		 * @generated
		 */
		EClass SHARE = eINSTANCE.getShare();

		/**
		 * The meta object literal for the '{@link add.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.FlowImpl
		 * @see add.impl.AddPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '{@link add.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.LinkImpl
		 * @see add.impl.AddPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '{@link add.impl.NormalLinkImpl <em>Normal Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.NormalLinkImpl
		 * @see add.impl.AddPackageImpl#getNormalLink()
		 * @generated
		 */
		EClass NORMAL_LINK = eINSTANCE.getNormalLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_LINK__ORIGIN = eINSTANCE.getNormalLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NORMAL_LINK__TARGET = eINSTANCE.getNormalLink_Target();

		/**
		 * The meta object literal for the '{@link add.impl.SolidLinkImpl <em>Solid Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.SolidLinkImpl
		 * @see add.impl.AddPackageImpl#getSolidLink()
		 * @generated
		 */
		EClass SOLID_LINK = eINSTANCE.getSolidLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID_LINK__ORIGIN = eINSTANCE.getSolidLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID_LINK__TARGET = eINSTANCE.getSolidLink_Target();

		/**
		 * The meta object literal for the '{@link add.impl.SolidGreyLinkImpl <em>Solid Grey Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.SolidGreyLinkImpl
		 * @see add.impl.AddPackageImpl#getSolidGreyLink()
		 * @generated
		 */
		EClass SOLID_GREY_LINK = eINSTANCE.getSolidGreyLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID_GREY_LINK__ORIGIN = eINSTANCE.getSolidGreyLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID_GREY_LINK__TARGET = eINSTANCE.getSolidGreyLink_Target();

		/**
		 * The meta object literal for the '{@link add.impl.DashLinkImpl <em>Dash Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see add.impl.DashLinkImpl
		 * @see add.impl.AddPackageImpl#getDashLink()
		 * @generated
		 */
		EClass DASH_LINK = eINSTANCE.getDashLink();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASH_LINK__ORIGIN = eINSTANCE.getDashLink_Origin();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASH_LINK__TARGET = eINSTANCE.getDashLink_Target();

	}

} //AddPackage
