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

    public int iesimoTermo(int index) {
	Integer result = memoizedValues.get(index);

	if(result == null) {
	    int calculatedResult = getValueByIndex(index);
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	}
	return result;
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

    public String imprimeProgressao(int n) {
	return progression.imprimeProgressao(n);
    }
}
