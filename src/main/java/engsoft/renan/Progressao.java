package engsoft.renan;

import engsoft.progression.*;

public abstract class Progressao<P extends Number> {
    // Progressao é um adapter abstrato para a sua interface de progressoes a
    // partir da minha (engsoft.progression) que tem a interface que eu acho que
    // um componente de progressões devia ter.

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
