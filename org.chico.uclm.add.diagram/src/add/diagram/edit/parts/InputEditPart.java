/*
 * 
 */
package add.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

import add.diagram.edit.policies.InputItemSemanticEditPolicy;
import add.diagram.edit.policies.OpenDiagramEditPolicy;
import add.diagram.part.AddVisualIDRegistry;
import add.diagram.providers.AddElementTypes;

/**
 * @generated
 */
public class InputEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2007;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public InputEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicyWithCustomReparent(AddVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InputItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new InputFigure();
	}

	/**
	* @generated
	*/
	public InputFigure getPrimaryShape() {
		return (InputFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InputNameEditPart) {
			((InputNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureInputLabelFigure());
			return true;
		}
		if (childEditPart instanceof InputInputInteractionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputInteractionCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InputInputInteractionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputInputTemporalityCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputTemporalityCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InputInputTemporalityCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputInputEventCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputEventCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InputInputEventCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InputNameEditPart) {
			return true;
		}
		if (childEditPart instanceof InputInputInteractionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputInteractionCompartmentFigure();
			pane.remove(((InputInputInteractionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputInputTemporalityCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputTemporalityCompartmentFigure();
			pane.remove(((InputInputTemporalityCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputInputEventCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getInputEventCompartmentFigure();
			pane.remove(((InputInputEventCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InputInputInteractionCompartmentEditPart) {
			return getPrimaryShape().getInputInteractionCompartmentFigure();
		}
		if (editPart instanceof InputInputTemporalityCompartmentEditPart) {
			return getPrimaryShape().getInputTemporalityCompartmentFigure();
		}
		if (editPart instanceof InputInputEventCompartmentEditPart) {
			return getPrimaryShape().getInputEventCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(AddVisualIDRegistry.getType(InputNameEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == AddElementTypes.Interaction_3001) {
				return getChildBySemanticHint(
						AddVisualIDRegistry.getType(InputInputInteractionCompartmentEditPart.VISUAL_ID));
			}
			if (type == AddElementTypes.Time_3002) {
				return getChildBySemanticHint(
						AddVisualIDRegistry.getType(InputInputTemporalityCompartmentEditPart.VISUAL_ID));
			}
			if (type == AddElementTypes.Event_3003) {
				return getChildBySemanticHint(
						AddVisualIDRegistry.getType(InputInputEventCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class InputFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureInputLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fInputInteractionCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fInputTemporalityCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fInputEventCompartmentFigure;

		/**
		 * @generated
		 */
		public InputFigure() {
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureInputLabelFigure = new WrappingLabel();

			fFigureInputLabelFigure.setText("Input");
			fFigureInputLabelFigure.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureInputLabelFigure);

			fInputInteractionCompartmentFigure = new RectangleFigure();

			fInputInteractionCompartmentFigure.setOutline(false);

			this.add(fInputInteractionCompartmentFigure);

			fInputTemporalityCompartmentFigure = new RectangleFigure();

			fInputTemporalityCompartmentFigure.setOutline(false);

			this.add(fInputTemporalityCompartmentFigure);

			fInputEventCompartmentFigure = new RectangleFigure();

			fInputEventCompartmentFigure.setOutline(false);

			this.add(fInputEventCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureInputLabelFigure() {
			return fFigureInputLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getInputInteractionCompartmentFigure() {
			return fInputInteractionCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getInputTemporalityCompartmentFigure() {
			return fInputTemporalityCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getInputEventCompartmentFigure() {
			return fInputEventCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}
