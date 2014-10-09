package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class FirstOrderProgression extends Progression {
    private Function function;

    public FirstOrderProgression(Function function, double startValue) {
	this.function = function;
	this.startValue = startValue;

	this.memoizedValues = new HashMap<Integer, Double>();
	this.memoizedValues.put(0, startValue);

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
}