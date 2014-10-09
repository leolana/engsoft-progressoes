package engsoft;

import engsoft.progression.*;

public class ProgressaoFibonacci extends Progressao {
    public ProgressaoFibonacci() {
	this.progression = new SecondOrderProgression(new Fibonacci(), 1, 1);
    }
}
