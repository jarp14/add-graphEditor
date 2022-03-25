package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class GustoFigura extends ImageFigure {
	public GustoFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/018-tongue.png").createImage(), 0);
	}

}
