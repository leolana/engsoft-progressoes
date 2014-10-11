package engsoft;

import engsoft.progression.*;

public class ProgressaoGeometrica extends Progressao<Integer> {
    public ProgressaoGeometrica() {
	this.progression = new FirstOrderProgression<Integer>(new Geometric(2), 1);
    }

    public ProgressaoGeometrica(int base) {
	this.progression = new FirstOrderProgression<Integer>(new Geometric(base), 1);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<Integer>(progression).print(to, "%d");
    }
}
