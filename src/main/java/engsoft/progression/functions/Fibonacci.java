package engsoft.progression;

import engsoft.progression.functions.*;

import java.math.BigDecimal;

// How I wish I had lambdas and currying ....
public class Fibonacci implements Function2<BigDecimal, BigDecimal, BigDecimal> {
    public BigDecimal apply(BigDecimal val1, BigDecimal val2) {
	return val1.add(val2);
    }
}
