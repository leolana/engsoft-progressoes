package engsoft;

import engsoft.progression.*;

public abstract class Progressao {
    protected Progression progression;

    public int proxTermo() {
	return (int) progression.next();
    }

    public int iesimoTermo(int index) {
	return (int) progression.valueByIndex(index);
    }

    public int inicia() {
	progression.reset();
	return (int) progression.valueByIndex(0);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter(progression).print(to, "%.0f");
    }
}
