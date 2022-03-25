/*
 * 
 */
package add.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import add.diagram.providers.AddElementTypes;
import add.diagram.providers.AddModelingAssistantProvider;

/**
 * @generated
 */
public class AddModelingAssistantProviderOfADDDiagramEditPart extends AddModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(15);
		types.add(AddElementTypes.Sight_2001);
		types.add(AddElementTypes.Touch_2002);
		types.add(AddElementTypes.Taste_2003);
		types.add(AddElementTypes.Hear_2004);
		types.add(AddElementTypes.Smell_2005);
		types.add(AddElementTypes.Environment_2006);
		types.add(AddElementTypes.Input_2007);
		types.add(AddElementTypes.Output_2008);
		types.add(AddElementTypes.Data_2009);
		types.add(AddElementTypes.Awareness_2010);
		types.add(AddElementTypes.Widget_2011);
		types.add(AddElementTypes.Device_2012);
		types.add(AddElementTypes.Controller_2013);
		types.add(AddElementTypes.Share_2014);
		types.add(AddElementTypes.Flow_2015);
		return types;
	}

}
