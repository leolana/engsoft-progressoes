package engsoft;

import engsoft.progression.Arithmetic;
import engsoft.progression.FirstOrderProgression;

public class ProgressaoAritmetica extends Progressao<Double> {
    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression<Double>(new Arithmetic(1.0), 0.0);
    }

    public ProgressaoAritmetica(int base) {
	this.progression = new FirstOrderProgression<Double>(new Arithmetic((double) base), 0.0);
    }
}
