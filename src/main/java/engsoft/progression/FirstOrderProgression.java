package engsoft.progression;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class FirstOrderProgression<T> extends Progression<T> {
    protected Function<T, T> function;

    public FirstOrderProgression(Function<T, T> function, T startValue) {
	super(startValue);
	this.function = function;
    }

    protected T getValueByIndex(int index) {
	return function.apply(valueByIndex(index - 1));
    }
}
