package org.chico.uclm.add.figuras;

import org.eclipse.draw2d.ImageFigure;

public class OidoFigura extends ImageFigure {
	public OidoFigura() {
		super(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID,
			"images/019-ear.png").createImage(), 0);
	}

}
