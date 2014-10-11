package engsoft;

import engsoft.progression.*;

public abstract class Progressao<P extends Number> {
    protected Progression<P> progression;

    public int proxTermo() {
	return progression.next().intValue();
    }

    public int iesimoTermo(int index) {
	return progression.valueByIndex(index).intValue();
    }

    public int inicia() {
	progression.reset();
	return progression.valueByIndex(0).intValue();
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<P>(progression).print(to, "%.0f");
    }
}
