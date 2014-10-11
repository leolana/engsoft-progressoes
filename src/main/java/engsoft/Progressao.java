package engsoft;

import engsoft.progression.*;

public abstract class Progressao<P extends Number> {
    protected Progression<P> progression;
    protected abstract String imprimeProgressao(int to);

    public P proxTermo() {
	return progression.next();
    }

    public P iesimoTermo(int index) {
	return progression.valueByIndex(index);
    }

    public P inicia() {
	progression.reset();
	return progression.valueByIndex(0);
    }
}
