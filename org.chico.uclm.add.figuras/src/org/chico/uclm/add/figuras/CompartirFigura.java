package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class CompartirFigura extends ImageFigure {
	public CompartirFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/021-share.png").createImage(), 0);
	}

}
