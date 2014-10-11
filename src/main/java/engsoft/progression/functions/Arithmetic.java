package engsoft.progression.functions;

// How I wish I had lambdas and currying ....
public class Arithmetic implements Function1<Integer, Integer> {
    private Integer base;

    public Arithmetic(Integer base) {
	this.base = base;
    }

    public Integer apply(Integer previousValue) {
	return previousValue + base;
    }
}
