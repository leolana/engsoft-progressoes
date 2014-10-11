package engsoft;

import engsoft.progression.Arithmetic;
import engsoft.progression.FirstOrderProgression;

public class ProgressaoAritmetica extends Progressao {
    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression<Double>(new Arithmetic(1.0), 0.0);
    }

    public ProgressaoAritmetica(double base) {
	this.progression = new FirstOrderProgression<Double>(new Arithmetic(base), 0.0);
    }
}
