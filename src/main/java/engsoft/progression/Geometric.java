package engsoft.progression;

// How I wish I had lambdas and currying ....
public class Geometric implements Function1<Double, Double> {
    private Double base;

    public Geometric(Double base) {
	this.base = base;
    }

    public Double apply(Double previousValue) {
	return previousValue * base;
    }
}
