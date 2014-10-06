package engsoft;

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
	double result = valueByIndex(currentIndex);
	currentIndex++;

	return result;
    }

    public void reset() {
	this.currentIndex = 0;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = function.apply(valueByIndex(index));
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	} else {
	    return (double) result;
	}
    }

    public String print(int to) {
	String result = "";
	for(int i = 0; i < to; i++) {
	    result += valueByIndex(i);
	}
	result += "\n";

	return result;
    };

    private void start() {
	this.memoizedValues = new HashMap<Integer, Double>();
	this.memoizedValues.put(0, startValue);

	this.currentIndex = 0;
    }
}
