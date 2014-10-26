package engsoft.progression;

import java.util.HashMap;
import java.util.Collection;
import java.util.LinkedList;

public abstract class Progression<T> {
    /*
      Progression é uma abstração para avaliar e memoizar equações de
      diferenças finitas. Essa é a abstração principal do projeto.

      Um classe de equações de difereças deve fornecer apenas uma implementação
      para #getValueByIndex.

      Repare no TypeParameter T que permite que eu tenha equações de diferenças
      de muitos tipos.
    */

    protected int currentIndex;
    protected T startValue;

    /*
      Outro ponto bem importante nessa implementação é a invalidação de cache.
      Sem invalidar cache o consumo de memória das progressões é ilimitado. Não é uma boa idéia.
      Cada progressão poderia implementar uma estratégia de invalidação.

      Em um mundo funcional, esse tipo de problema é deixado para o runtime da
      linguagem. Memoização em funções puras ocorre automaticamente e pode ser
      'tunada' em compilation time por exemplo.

      Por brevidade, simplicidade, e preguiça, não vou invalidar nada ;).
    */
    protected HashMap<Integer, T> memoizedValues;

    protected abstract T getValueByIndex(int index);

    public Progression(T startValue) {
	this.startValue = startValue;

	this.memoizedValues = new HashMap<Integer, T>();
	this.memoizedValues.put(0, startValue);

	this.currentIndex = 0;
    }

    public T valueByIndex(int index) {
	// #valueByIndex toma conta do boilerplate de fazer a memoização, e
	// #delega o calculo propriamente dito para #getValueByIndex

	T result = memoizedValues.get(index);

	if(result == null) {
	    T calculatedResult = getValueByIndex(index);
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	}

	return result;
    }

    public T next() {
	currentIndex++;
	return valueByIndex(currentIndex);
    }

    public void reset() {
	this.currentIndex = 0;
    }

    public Collection<T> getRange(int to) {
	Collection<T> result = new LinkedList<T>();

	for (int i = 0; i <= to; i++) {
	    result.add(valueByIndex(i));
	}

	return result;
    }
}
