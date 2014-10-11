package engsoft.progression;

// How I wish I had lambdas and currying ....
public class Arithmetic implements Function1<Double, Double> {
    private double base;

    public Arithmetic(Double base) {
	this.base = base;
    }

    public Double apply(Double previousValue) {
	return previousValue + base;
    }
}
