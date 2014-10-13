package engsoft.progression.functions;

import java.math.BigDecimal;

// A solução de TODO o problema da progressão de fibonacci em Clojure seria:
// (def fib (lazy-cat [1 1] (map + (rest fib) fib)))

public class Fibonacci implements Function2<BigDecimal, BigDecimal, BigDecimal> {
    public BigDecimal apply(BigDecimal val1, BigDecimal val2) {
	return val1.add(val2);
    }
}
