package engsoft.progression;

import engsoft.progression.functions.*;

public class ProgressionPresenter<T> {
    private Progression<T> progression;

    public ProgressionPresenter(Progression<T> progression) {
	this.progression = progression;
    }

    public String print(int to, String mask) {
	String result = "";

	for(T val : progression.getRange(to)) {
	    result += String.format(mask, val) + " ";
	}

	result = result.substring(0, result.length()-1);
	result += "\n";

	return result;
    }

    public String print(int to) {
	String result = "";

	for(T val : progression.getRange(to)) {
	    result += val.toString() + " ";
	}

	result = result.substring(0, result.length()-1);
	result += "\n";

	return result;
    }
}
