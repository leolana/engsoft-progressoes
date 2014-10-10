package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public abstract class Progression {
    protected int currentIndex;
    protected double startValue;
    protected Map<Integer, Double> memoizedValues;

    protected abstract double getValueByIndex(int index);

    public Progression(double startValue) {
	this.startValue = startValue;

	this.memoizedValues = new HashMap<Integer, Double>();
	this.memoizedValues.put(0, startValue);

	this.currentIndex = 0;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = getValueByIndex(index);
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	}

	return result;
    }

    public double next() {
	currentIndex++;
	return valueByIndex(currentIndex);
    }

    public void reset() {
	this.currentIndex = 0;
    }

    public String print(int to, String mask) {
	String result = "";
	for(int i = 0; i <= to; i++) {
	    result += String.format(mask, valueByIndex(i)) + " ";
	}
	result = result.substring(0, result.length()-1);
	result += "\n";

	return result;
    }
}
