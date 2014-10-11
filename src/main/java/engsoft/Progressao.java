package engsoft;

import engsoft.progression.*;

public abstract class Progressao {
    protected Progression<Double> progression;

    public int proxTermo() {
	return (int) (double) progression.next();
    }

    public int iesimoTermo(int index) {
	return (int) (double) progression.valueByIndex(index);
    }

    public int inicia() {
	progression.reset();
	return (int) (double) progression.valueByIndex(0);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter(progression).print(to, "%.0f");
    }
}
