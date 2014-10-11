package engsoft.renan;

import junit.framework.TestCase;

public class ProgressaoAritmeticaTest extends TestCase {

    // Alterei esses testes pra melhorar a suite. Um teste deve quebrar por um
    // único motivo. Estes testes tem assertions demais no mesmo exemplo.

    public void testAritmeticaProxTermo() {
        Progressao p = new ProgressaoAritmetica();

	assertEquals(0, p.inicia());
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
    }

    public void testAritmeticaInicia() {
	Progressao p = new ProgressaoAritmetica();

	assertEquals(0, p.inicia());
    }

    public void testAritmeticaIesimoTermo() {
	Progressao p = new ProgressaoAritmetica();

        assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));
    }

    public void testAritmeticaProxTermoNaoQuebraIesimoTermo() {
        Progressao p = new ProgressaoAritmetica();

	assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));

	assertEquals(1, p.proxTermo());

	assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));
    }

    public void testAritmeticaImprime() {
        Progressao p = new ProgressaoAritmetica();

	assertEquals("0 1 2 3 4 5 6 7 8 9 10\n", p.imprimeProgressao(10));
    }

    public void testProgressaoAritmetica() {
        Progressao p = new ProgressaoAritmetica();

	assertEquals(0, p.inicia());
        assertEquals(1, p.proxTermo());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.iesimoTermo(4));
        assertEquals(6, p.iesimoTermo(6));
	assertEquals("0 1 2 3 4 5 6 7 8 9 10\n",
                     p.imprimeProgressao(10));

        p = new ProgressaoAritmetica(5);
        assertEquals(0, p.inicia());
        assertEquals(5, p.proxTermo());
        assertEquals(10, p.proxTermo());
        assertEquals(20, p.iesimoTermo(4));
        assertEquals(30, p.iesimoTermo(6));
        assertEquals("0 5 10 15 20 25 30 35 40 45 50\n",
                     p.imprimeProgressao(10));
    }
}
