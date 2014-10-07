package engsoft;

import engsoft.progression.*;

public class ProgressaoGeometrica extends Progressao {
    public ProgressaoGeometrica() {
	this.progression = new FirstOrderProgression(new Geometric(2), 1);
    }

    public ProgressaoGeometrica(double base) {
	this.progression = new FirstOrderProgression(new Geometric(base), 1);
    }
}
