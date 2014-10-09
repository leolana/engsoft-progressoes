package engsoft.progression;

// How I wish I had lambdas and currying ....
public class Fibonacci implements SecondOrderFunction {
    public double apply(double val1, double val2) {
	return val1 + val2;
    }
}
