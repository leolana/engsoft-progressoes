package engsoft.progression;

import java.util.Map;
import java.util.HashMap;

public class FirstOrderProgression extends Progression {
    public FirstOrderProgression(Function function, double startValue) {
	super(startValue);
	this.function = function;
    }

    protected double getValueByIndex(int index) {
	return function.apply(valueByIndex(index - 1));
    }
}
