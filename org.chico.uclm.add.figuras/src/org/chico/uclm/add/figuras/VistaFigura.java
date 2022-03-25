package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class VistaFigura extends ImageFigure {
	public VistaFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/008-eye.png").createImage(), 0);
	}

}
