package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class FirstOrderProgression implements Progression {
    private int currentIndex;
    private double startValue;
    private Function function;

    private Map<Integer, Double> memoizedValues;

    public FirstOrderProgression(Function function, double startValue) {
	this.function = function;
	this.startValue = startValue;

	start();
    }

    public double next() {
	currentIndex++;
	return valueByIndex(currentIndex);
    }

    public void reset() {
	this.currentIndex = 0;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = function.apply(valueByIndex(index - 1));
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	} else {
	    return (double) result;
	}
    }

    public String print(int to, String mask) {
	String result = "";
	for(int i = 0; i <= to; i++) {
	    result += String.format(mask, valueByIndex(i)) + " ";
	}
	result = result.substring(0, result.length()-1);
	result += "\n";

	return result;
    };

    private void start() {
	this.memoizedValues = new HashMap<Integer, Double>();
	this.memoizedValues.put(0, startValue);

	this.currentIndex = 0;
    }
}
