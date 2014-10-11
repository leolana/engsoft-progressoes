package engsoft.renan;

import junit.framework.TestCase;
import java.math.BigDecimal;

public class ProgressaoFibonacciTest extends TestCase {
    public void testFibonacciInicia() {
	Progressao p = new ProgressaoFibonacci();
        assertEquals(new BigDecimal("0"), p.inicia());
    }

    public void testFibonacciProxTermo() {
	Progressao p = new ProgressaoFibonacci();
        assertEquals(new BigDecimal(1), p.proxTermo());
        assertEquals(new BigDecimal(1), p.proxTermo());
        assertEquals(new BigDecimal(2), p.proxTermo());
        assertEquals(new BigDecimal(3), p.proxTermo());
	assertEquals(new BigDecimal(5), p.proxTermo());
	assertEquals(new BigDecimal(8), p.proxTermo());
    }

    public void testFibonacciIesimoTermo() {
	Progressao p = new ProgressaoFibonacci();
	assertEquals(new BigDecimal(3), p.iesimoTermo(4));
        assertEquals(new BigDecimal(13), p.iesimoTermo(7));

	// now, just for the funz. Should change result to bigint...
	assertEquals(new BigDecimal(165580141), p.iesimoTermo(41));

	// now things get serious
	assertEquals(new BigDecimal("222232244629420445529739893461909967206666939096499764990979600"), p.iesimoTermo(300));
    }

    public void testFibonacciImprime() {
        Progressao p = new ProgressaoFibonacci();

	assertEquals("0 1 1 2 3 5 8 13 21 34 55\n",
                     p.imprimeProgressao(10));
    }

    public void testFibonacciFull() {
        Progressao p = new ProgressaoFibonacci();
        assertEquals(new BigDecimal(0), p.inicia());
        assertEquals(new BigDecimal(1), p.proxTermo());
        assertEquals(new BigDecimal(1), p.proxTermo());
	assertEquals(new BigDecimal(3), p.iesimoTermo(4));
        assertEquals(new BigDecimal(13), p.iesimoTermo(7));
        assertEquals("0 1 1 2 3 5 8 13 21 34 55\n",
                     p.imprimeProgressao(10));
    }
}
