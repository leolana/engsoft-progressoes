package engsoft.progression;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.LinkedList;

public abstract class Progression<T> {
    protected int currentIndex;
    protected T startValue;
    protected Map<Integer, T> memoizedValues;

    protected abstract T getValueByIndex(int index);

    public Progression(T startValue) {
	this.startValue = startValue;

	this.memoizedValues = new HashMap<Integer, T>();
	this.memoizedValues.put(0, startValue);

	this.currentIndex = 0;
    }

    public T valueByIndex(int index) {
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
