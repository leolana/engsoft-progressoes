package engsoft;

import junit.framework.TestCase;

public class ProgressaoFibonacciTest extends TestCase {
    public void testFibonacciInicia() {
	Progressao p = new ProgressaoFibonacci();
        assertEquals(1, p.inicia());
    }

    public void testFibonacciProxTermo() {
	Progressao p = new ProgressaoFibonacci();
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
        assertEquals(3, p.proxTermo());
        assertEquals(5, p.proxTermo());
    }

    public void testFibonacciIesimoTermo() {
	Progressao p = new ProgressaoFibonacci();
	assertEquals(5, p.iesimoTermo(4));
        assertEquals(13, p.iesimoTermo(6));

	// now, just for the funz. Should change result to bigint...
	assertEquals(165580141, p.iesimoTermo(40));
    }

    public void testFibonacciImprime() {
        Progressao p = new ProgressaoFibonacci();

	assertEquals("1 1 2 3 5 8 13 21 34 55 89\n",
                     p.imprimeProgressao(10));
    }

    public void testFibonacciFull() {
        Progressao p = new ProgressaoFibonacci();
        assertEquals(1, p.inicia());
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
	assertEquals(5, p.iesimoTermo(4));
        assertEquals(13, p.iesimoTermo(6));
        assertEquals("1 1 2 3 5 8 13 21 34 55 89\n",
                     p.imprimeProgressao(10));
    }
}
