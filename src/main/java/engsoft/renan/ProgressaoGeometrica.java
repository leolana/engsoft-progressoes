package engsoft.renan;

import engsoft.progression.*;

public class ProgressaoGeometrica extends Progressao<Integer> {
    public ProgressaoGeometrica() {
	this.progression = new FirstOrderProgression<Integer>(x -> x * 2, 1);
    }

    public ProgressaoGeometrica(int base) {
	this.progression = new FirstOrderProgression<Integer>(x -> x * base, 1);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<Integer>(progression).print(to, "%d");
    }
}
