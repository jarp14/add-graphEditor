package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class NarizFigura extends ImageFigure {
	public NarizFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/020-nose.png").createImage(), 0);
	}

}
