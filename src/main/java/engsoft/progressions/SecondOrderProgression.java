package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class SecondOrderProgression extends Progression {
    private SecondOrderFunction function;

    public SecondOrderProgression(SecondOrderFunction function, double sv1, double sv2) {
	this.function = function;
	this.startValue = startValue;

	this.memoizedValues = new HashMap<Integer, Double>();
	this.memoizedValues.put(0, sv1);
	this.memoizedValues.put(1, sv2);

	this.currentIndex = 0;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = function.apply(valueByIndex(index - 1),
						     valueByIndex(index - 2));
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	} else {
	    return (double) result;
	}
    }
}
