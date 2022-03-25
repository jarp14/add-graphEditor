/*
 * 
 */
package add.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import add.AddPackage;
import add.diagram.edit.parts.ADDDiagramEditPart;
import add.diagram.edit.parts.AreaEditPart;
import add.diagram.edit.parts.AwarenessEditPart;
import add.diagram.edit.parts.ControllerEditPart;
import add.diagram.edit.parts.DashLinkEditPart;
import add.diagram.edit.parts.DataEditPart;
import add.diagram.edit.parts.DataxEditPart;
import add.diagram.edit.parts.DeviceEditPart;
import add.diagram.edit.parts.DimensionEditPart;
import add.diagram.edit.parts.ElementEditPart;
import add.diagram.edit.parts.EnvironmentEditPart;
import add.diagram.edit.parts.EventEditPart;
import add.diagram.edit.parts.FlowEditPart;
import add.diagram.edit.parts.HearEditPart;
import add.diagram.edit.parts.InputEditPart;
import add.diagram.edit.parts.InteractionEditPart;
import add.diagram.edit.parts.NormalLinkEditPart;
import add.diagram.edit.parts.OperationEditPart;
import add.diagram.edit.parts.OutputEditPart;
import add.diagram.edit.parts.ShareEditPart;
import add.diagram.edit.parts.SightEditPart;
import add.diagram.edit.parts.SmellEditPart;
import add.diagram.edit.parts.SolidGreyLinkEditPart;
import add.diagram.edit.parts.SolidLinkEditPart;
import add.diagram.edit.parts.TasteEditPart;
import add.diagram.edit.parts.Time2EditPart;
import add.diagram.edit.parts.TimeEditPart;
import add.diagram.edit.parts.TouchEditPart;
import add.diagram.edit.parts.WidgetEditPart;
import add.diagram.part.AddDiagramEditorPlugin;

/**
 * @generated
 */
public class AddElementTypes {

	/**
	* @generated
	*/
	private AddElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			AddDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType ADDDiagram_1000 = getElementType("org.chico.uclm.add.diagram.ADDDiagram_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Sight_2001 = getElementType("org.chico.uclm.add.diagram.Sight_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Touch_2002 = getElementType("org.chico.uclm.add.diagram.Touch_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Taste_2003 = getElementType("org.chico.uclm.add.diagram.Taste_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Hear_2004 = getElementType("org.chico.uclm.add.diagram.Hear_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Smell_2005 = getElementType("org.chico.uclm.add.diagram.Smell_2005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Environment_2006 = getElementType("org.chico.uclm.add.diagram.Environment_2006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_2007 = getElementType("org.chico.uclm.add.diagram.Input_2007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Output_2008 = getElementType("org.chico.uclm.add.diagram.Output_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Data_2009 = getElementType("org.chico.uclm.add.diagram.Data_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Awareness_2010 = getElementType("org.chico.uclm.add.diagram.Awareness_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Widget_2011 = getElementType("org.chico.uclm.add.diagram.Widget_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Device_2012 = getElementType("org.chico.uclm.add.diagram.Device_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Controller_2013 = getElementType("org.chico.uclm.add.diagram.Controller_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Share_2014 = getElementType("org.chico.uclm.add.diagram.Share_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Flow_2015 = getElementType("org.chico.uclm.add.diagram.Flow_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Interaction_3001 = getElementType("org.chico.uclm.add.diagram.Interaction_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Time_3002 = getElementType("org.chico.uclm.add.diagram.Time_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Event_3003 = getElementType("org.chico.uclm.add.diagram.Event_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Time_3004 = getElementType("org.chico.uclm.add.diagram.Time_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Operation_3005 = getElementType("org.chico.uclm.add.diagram.Operation_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Datax_3006 = getElementType("org.chico.uclm.add.diagram.Datax_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Area_3007 = getElementType("org.chico.uclm.add.diagram.Area_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Dimension_3008 = getElementType("org.chico.uclm.add.diagram.Dimension_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Element_3009 = getElementType("org.chico.uclm.add.diagram.Element_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NormalLink_4001 = getElementType("org.chico.uclm.add.diagram.NormalLink_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SolidLink_4002 = getElementType("org.chico.uclm.add.diagram.SolidLink_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SolidGreyLink_4003 = getElementType(
			"org.chico.uclm.add.diagram.SolidGreyLink_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DashLink_4004 = getElementType("org.chico.uclm.add.diagram.DashLink_4004"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ADDDiagram_1000, AddPackage.eINSTANCE.getADDDiagram());

			elements.put(Sight_2001, AddPackage.eINSTANCE.getSight());

			elements.put(Touch_2002, AddPackage.eINSTANCE.getTouch());

			elements.put(Taste_2003, AddPackage.eINSTANCE.getTaste());

			elements.put(Hear_2004, AddPackage.eINSTANCE.getHear());

			elements.put(Smell_2005, AddPackage.eINSTANCE.getSmell());

			elements.put(Environment_2006, AddPackage.eINSTANCE.getEnvironment());

			elements.put(Input_2007, AddPackage.eINSTANCE.getInput());

			elements.put(Output_2008, AddPackage.eINSTANCE.getOutput());

			elements.put(Data_2009, AddPackage.eINSTANCE.getData());

			elements.put(Awareness_2010, AddPackage.eINSTANCE.getAwareness());

			elements.put(Widget_2011, AddPackage.eINSTANCE.getWidget());

			elements.put(Device_2012, AddPackage.eINSTANCE.getDevice());

			elements.put(Controller_2013, AddPackage.eINSTANCE.getController());

			elements.put(Share_2014, AddPackage.eINSTANCE.getShare());

			elements.put(Flow_2015, AddPackage.eINSTANCE.getFlow());

			elements.put(Interaction_3001, AddPackage.eINSTANCE.getInteraction());

			elements.put(Time_3002, AddPackage.eINSTANCE.getTime());

			elements.put(Event_3003, AddPackage.eINSTANCE.getEvent());

			elements.put(Time_3004, AddPackage.eINSTANCE.getTime());

			elements.put(Operation_3005, AddPackage.eINSTANCE.getOperation());

			elements.put(Datax_3006, AddPackage.eINSTANCE.getDatax());

			elements.put(Area_3007, AddPackage.eINSTANCE.getArea());

			elements.put(Dimension_3008, AddPackage.eINSTANCE.getDimension());

			elements.put(Element_3009, AddPackage.eINSTANCE.getElement());

			elements.put(NormalLink_4001, AddPackage.eINSTANCE.getNormalLink());

			elements.put(SolidLink_4002, AddPackage.eINSTANCE.getSolidLink());

			elements.put(SolidGreyLink_4003, AddPackage.eINSTANCE.getSolidGreyLink());

			elements.put(DashLink_4004, AddPackage.eINSTANCE.getDashLink());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ADDDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Sight_2001);
			KNOWN_ELEMENT_TYPES.add(Touch_2002);
			KNOWN_ELEMENT_TYPES.add(Taste_2003);
			KNOWN_ELEMENT_TYPES.add(Hear_2004);
			KNOWN_ELEMENT_TYPES.add(Smell_2005);
			KNOWN_ELEMENT_TYPES.add(Environment_2006);
			KNOWN_ELEMENT_TYPES.add(Input_2007);
			KNOWN_ELEMENT_TYPES.add(Output_2008);
			KNOWN_ELEMENT_TYPES.add(Data_2009);
			KNOWN_ELEMENT_TYPES.add(Awareness_2010);
			KNOWN_ELEMENT_TYPES.add(Widget_2011);
			KNOWN_ELEMENT_TYPES.add(Device_2012);
			KNOWN_ELEMENT_TYPES.add(Controller_2013);
			KNOWN_ELEMENT_TYPES.add(Share_2014);
			KNOWN_ELEMENT_TYPES.add(Flow_2015);
			KNOWN_ELEMENT_TYPES.add(Interaction_3001);
			KNOWN_ELEMENT_TYPES.add(Time_3002);
			KNOWN_ELEMENT_TYPES.add(Event_3003);
			KNOWN_ELEMENT_TYPES.add(Time_3004);
			KNOWN_ELEMENT_TYPES.add(Operation_3005);
			KNOWN_ELEMENT_TYPES.add(Datax_3006);
			KNOWN_ELEMENT_TYPES.add(Area_3007);
			KNOWN_ELEMENT_TYPES.add(Dimension_3008);
			KNOWN_ELEMENT_TYPES.add(Element_3009);
			KNOWN_ELEMENT_TYPES.add(NormalLink_4001);
			KNOWN_ELEMENT_TYPES.add(SolidLink_4002);
			KNOWN_ELEMENT_TYPES.add(SolidGreyLink_4003);
			KNOWN_ELEMENT_TYPES.add(DashLink_4004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case ADDDiagramEditPart.VISUAL_ID:
			return ADDDiagram_1000;
		case SightEditPart.VISUAL_ID:
			return Sight_2001;
		case TouchEditPart.VISUAL_ID:
			return Touch_2002;
		case TasteEditPart.VISUAL_ID:
			return Taste_2003;
		case HearEditPart.VISUAL_ID:
			return Hear_2004;
		case SmellEditPart.VISUAL_ID:
			return Smell_2005;
		case EnvironmentEditPart.VISUAL_ID:
			return Environment_2006;
		case InputEditPart.VISUAL_ID:
			return Input_2007;
		case OutputEditPart.VISUAL_ID:
			return Output_2008;
		case DataEditPart.VISUAL_ID:
			return Data_2009;
		case AwarenessEditPart.VISUAL_ID:
			return Awareness_2010;
		case WidgetEditPart.VISUAL_ID:
			return Widget_2011;
		case DeviceEditPart.VISUAL_ID:
			return Device_2012;
		case ControllerEditPart.VISUAL_ID:
			return Controller_2013;
		case ShareEditPart.VISUAL_ID:
			return Share_2014;
		case FlowEditPart.VISUAL_ID:
			return Flow_2015;
		case InteractionEditPart.VISUAL_ID:
			return Interaction_3001;
		case TimeEditPart.VISUAL_ID:
			return Time_3002;
		case EventEditPart.VISUAL_ID:
			return Event_3003;
		case Time2EditPart.VISUAL_ID:
			return Time_3004;
		case OperationEditPart.VISUAL_ID:
			return Operation_3005;
		case DataxEditPart.VISUAL_ID:
			return Datax_3006;
		case AreaEditPart.VISUAL_ID:
			return Area_3007;
		case DimensionEditPart.VISUAL_ID:
			return Dimension_3008;
		case ElementEditPart.VISUAL_ID:
			return Element_3009;
		case NormalLinkEditPart.VISUAL_ID:
			return NormalLink_4001;
		case SolidLinkEditPart.VISUAL_ID:
			return SolidLink_4002;
		case SolidGreyLinkEditPart.VISUAL_ID:
			return SolidGreyLink_4003;
		case DashLinkEditPart.VISUAL_ID:
			return DashLink_4004;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return add.diagram.providers.AddElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return add.diagram.providers.AddElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return add.diagram.providers.AddElementTypes.getElement(elementTypeAdapter);
		}
	};

}
