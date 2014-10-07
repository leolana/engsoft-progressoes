package engsoft;

import engsoft.progression.*;

public class ProgressaoAritmetica extends Progressao {
    public ProgressaoAritmetica() {
	this.progression = new FirstOrderProgression(new Arithmetic(1), 0);
    }

    public ProgressaoAritmetica(double base) {
	this.progression = new FirstOrderProgression(new Arithmetic(base), 0);
    }
}
