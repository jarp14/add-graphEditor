package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class TactoFigura extends ImageFigure {
	public TactoFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/017-hold.png").createImage(), 0);
	}

}
