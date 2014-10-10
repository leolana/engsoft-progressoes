package engsoft.progression;

public class ProgressionPresenter {
    private Progression progression;

    public ProgressionPresenter(Progression progression) {
	this.progression = progression;
    }

    public String print(int to, String mask) {
	String result = "";

	for(double val : progression.getRange(to)) {
	    result += String.format(mask, val) + " ";
	}

	result = result.substring(0, result.length()-1);
	result += "\n";

	return result;
    }
}
