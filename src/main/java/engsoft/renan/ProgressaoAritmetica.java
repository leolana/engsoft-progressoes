package engsoft.renan;

import engsoft.progression.*;

public class ProgressaoAritmetica extends Progressao<Integer> {
    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression<Integer>(x -> x + 1, 0);
    }

    public ProgressaoAritmetica(int base) {
	this.progression = new FirstOrderProgression<Integer>(x -> x + base, 0);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<Integer>(progression).print(to, "%d");
    }
}
