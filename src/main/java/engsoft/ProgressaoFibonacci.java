package engsoft;

import engsoft.progression.SecondOrderProgression;
import engsoft.progression.Fibonacci;
import java.math.BigDecimal;

public class ProgressaoFibonacci extends Progressao<BigDecimal> {
    public ProgressaoFibonacci() {
	BigDecimal one = new BigDecimal(1);
	this.progression = new SecondOrderProgression<BigDecimal>(new Fibonacci(), one, one);
    }
}
