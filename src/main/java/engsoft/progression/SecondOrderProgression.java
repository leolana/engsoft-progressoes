package engsoft.progression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class SecondOrderProgression<T> extends Progression<T> {
    private BiFunction<T, T, T> function;

    public SecondOrderProgression(BiFunction<T, T, T> function, T sv0, T sv1) {
	super(sv0);
	this.memoizedValues.put(1, sv1);

	this.function = function;
    }

    protected T getValueByIndex(int index) {
	// Essa implementação ~parece~ aquele exemplo clássico de como não fazer
	// recursão, pois seria O(n²) Porém, repare que eu memoizo. Memoizando o
	// resultado O(n) mesmo fazendo recursão 2 vezes.

	// Maaaaas, se a progressão não tiver nada no cache e for solicitado um
	// indice muito grande, pode ocorrer um stack overflow pois a JVM não
	// faz TCO (tail call optimization) Clojure resolve isso forçando
	// explicitamente o TCO usando 'recur' ou 'trampoline'.

	return function.apply(valueByIndex(index - 1),
			      valueByIndex(index - 2));
    }
}
