package engsoft;

import engsoft.progression.*;
import engsoft.progression.functions.*;

public class ProgressaoAritmetica extends Progressao<Integer> {
    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression<Integer>(new Arithmetic(1), 0);
    }

    public ProgressaoAritmetica(int base) {
	this.progression = new FirstOrderProgression<Integer>(new Arithmetic(base), 0);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<Integer>(progression).print(to, "%d");
    }
}
