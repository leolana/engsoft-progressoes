package engsoft.renan;

import engsoft.progression.*;
import java.math.BigDecimal;

public class ProgressaoFibonacci extends Progressao<BigDecimal> {
    public ProgressaoFibonacci() {
	BigDecimal zero = new BigDecimal("0");
	BigDecimal one = new BigDecimal("1");
	this.progression = new SecondOrderProgression<BigDecimal>((x,y) -> x.add(y), zero, one);
    }

    public String imprimeProgressao(int to) {
	return new ProgressionPresenter<BigDecimal>(progression).print(to);
    }
}
