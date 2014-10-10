package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class SecondOrderProgression extends Progression {
    private SecondOrderFunction function;

    public SecondOrderProgression(SecondOrderFunction function, double sv0, double sv1) {
	super(sv0);
	this.memoizedValues.put(1, sv1);

	this.function = function;
    }

    public double valueByIndex(int index) {
	Double result = memoizedValues.get(index);

	if(result == null) {
	    double calculatedResult = function.apply(valueByIndex(index - 1),
						     valueByIndex(index - 2));
	    memoizedValues.put(index, calculatedResult);

	    return calculatedResult;
	}

	return result;
    }
}
