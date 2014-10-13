package engsoft.progression.functions;

// Em Clojure bastaria: #(+ base %)
public class Arithmetic implements Function1<Integer, Integer> {
    private Integer base;

    public Arithmetic(Integer base) {
	this.base = base;
    }

    public Integer apply(Integer previousValue) {
	return previousValue + base;
    }
}
