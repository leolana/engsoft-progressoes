package engsoft;


// How I wish I had lambdas and currying ....
public class Geometric implements Function {
    private double base;

    public Geometric(double base) {
	this.base = base;
    }

    public double apply(double previousValue) {
	return previousValue * base;
    }
}
