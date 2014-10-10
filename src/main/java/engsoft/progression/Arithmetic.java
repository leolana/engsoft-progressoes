package engsoft.progression;

// How I wish I had lambdas and currying ....
public class Arithmetic implements Function {
    private double base;

    public Arithmetic(double base) {
	this.base = base;
    }

    public double apply(double previousValue) {
	return previousValue + base;
    }
}
