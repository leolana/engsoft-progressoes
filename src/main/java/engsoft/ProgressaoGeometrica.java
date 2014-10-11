package engsoft;

import engsoft.progression.Geometric;
import engsoft.progression.FirstOrderProgression;

public class ProgressaoGeometrica extends Progressao {
    public ProgressaoGeometrica() {
	this.progression = new FirstOrderProgression<Double>(new Geometric(2.0), 1.0);
    }

    public ProgressaoGeometrica(int base) {
	this.progression = new FirstOrderProgression<Double>(new Geometric((double) base), 1.0);
    }
}
