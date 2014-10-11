package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class FirstOrderProgression<T> extends Progression<T> {
    protected Function1<T, T> function;

    public FirstOrderProgression(Function1<T, T> function, T startValue) {
	super(startValue);
	this.function = function;
    }

    protected T getValueByIndex(int index) {
	return function.apply(valueByIndex(index - 1));
    }
}
