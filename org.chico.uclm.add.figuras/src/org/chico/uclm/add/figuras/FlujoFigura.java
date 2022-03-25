package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class FlujoFigura extends ImageFigure {
	public FlujoFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/007-flow.png").createImage(), 0);
	}

}
