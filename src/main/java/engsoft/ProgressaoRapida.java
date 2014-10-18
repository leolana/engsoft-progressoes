package engsoft;

// Bom, como minha implementacao nao vai ser mais rapida pra numeros pequenos
// por que nao uso os tipos primitivos zuados (pra poder ter polimorfismo com os
// type parameters, vide comentarios em `Progression.java').

// vou fazer aqui a solução básica para passar os testes e boa.

import java.util.HashMap;

public class ProgressaoRapida extends Progressao {
    private Progressao progression;
    private HashMap<Integer, Integer> memoizedValues;

    public ProgressaoRapida(Progressao progression) {
	this.progression = progression;
	this.memoizedValues = new HashMap<Integer, Integer>();
    }

    // Outro ponto zuado dessa implementação é que se você pedir
    // iesimoTermo(10), essa classe só tem visibilidade de p(10), e por isso só
    // cacheia esse resutado.
    // Na minha implementação isso não acontece, o por isso, o cache hit-rate da
    // minha implementação seria maior que o dessa (se você fizer um teste
    // aleatório lógico. Se fizer um `map p [1..100]` vai dar na mesma).

    public int iesimoTermo(int index) {
	Integer result = memoizedValues.get(index);

	if (result != null) return result;

	int calculatedResult = getValueByIndex(index);
	memoizedValues.put(index, calculatedResult);
	return calculatedResult;
    }
    private int getValueByIndex(int index) {
	return progression.iesimoTermo(index);
    }

    public int inicia() {
	return progression.inicia();
    }

    public int proxTermo() {
	return progression.proxTermo();
    }
}
