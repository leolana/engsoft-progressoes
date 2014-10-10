package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class FirstOrderProgression extends Progression {
    private Function function;

    public FirstOrderProgression(Function function, double startValue) {
	super(startValue);
	this.function = function;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = function.apply(valueByIndex(index - 1));
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	}

	return result;
    }
}
