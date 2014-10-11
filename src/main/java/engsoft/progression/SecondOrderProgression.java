package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class SecondOrderProgression<T> extends Progression<T> {
    private Function2<T, T, T> function;

    public SecondOrderProgression(Function2<T, T, T> function, T sv0, T sv1) {
	super(sv0);
	this.memoizedValues.put(1, sv1);

	this.function = function;
    }

    protected T getValueByIndex(int index) {
	return function.apply(valueByIndex(index - 1),
			      valueByIndex(index - 2));
    }
}
