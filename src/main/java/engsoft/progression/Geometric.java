package engsoft.progression;

// How I wish I had lambdas and currying ....
public class Geometric implements Function1<Integer, Integer> {
    private Integer base;

    public Geometric(Integer base) {
	this.base = base;
    }

    public Integer apply(Integer previousValue) {
	return previousValue * base;
    }
}
