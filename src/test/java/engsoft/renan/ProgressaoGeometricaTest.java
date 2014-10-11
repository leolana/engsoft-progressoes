package engsoft.renan;

import junit.framework.TestCase;

public class ProgressaoGeometricaTest extends TestCase {

    // Alterei esses testes pra melhorar a suite. Um teste deve quebrar por um
    // único motivo. Estes testes tem assertions demais no mesmo exemplo.
    public void testGeometricaFull() {
        Progressao p = new ProgressaoGeometrica();

        assertEquals(1, p.inicia());
        assertEquals(2, p.proxTermo());
        assertEquals(4, p.proxTermo());
        assertEquals(16, p.iesimoTermo(4));
        assertEquals(64, p.iesimoTermo(6));
        assertEquals("1 2 4 8 16 32 64 128 256 512 1024\n",
                     p.imprimeProgressao(10));

        p = new ProgressaoGeometrica(5);
        assertEquals(1, p.inicia());
        assertEquals(5, p.proxTermo());
        assertEquals(25, p.proxTermo());
        assertEquals(625, p.iesimoTermo(4));
        assertEquals(15625, p.iesimoTermo(6));
        assertEquals("1 5 25 125 625 3125 15625 78125 390625 1953125 9765625\n",
                     p.imprimeProgressao(10));
    }
}
