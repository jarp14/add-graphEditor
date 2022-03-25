package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class EntornoFigura extends ImageFigure {
	public EntornoFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/022-sensor.png").createImage(), 0);
	}

}
