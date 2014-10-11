package engsoft;

import junit.framework.TestCase;

import engsoft.renan.*;
import java.lang.System;

public class PerformanceTest extends TestCase {

    private long startTime;
    private void tick() {
	startTime = System.nanoTime();
    }
    private long tock() {
	return System.nanoTime() - startTime;
    }

    private long benchmark(int until, Progressao progressao) {
	tick();

	for(int j = 0; j < 100; j++) {
	    for(int i = 1; i <= until; i++) {
		progressao.iesimoTermo(i);
	    }
	}

	return tock();
    }

    private long benchmark(int until, engsoft.renan.Progressao progressao) {
	tick();

	for(int j = 0; j < 100; j++) {
	    for(int i = 1; i <= until; i++) {
		progressao.iesimoTermo(i);
	    }
	}
	return tock();
    }

    public void testPerformanceAritmetica() {
	Progressao p_original = new ProgressaoAritmetica(10);
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoAritmetica(10);

	long original_time = benchmark(5000, p_original);
	long improved_time = benchmark(5000, p_renan);

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0);
    }

    public void testProgressaoGeometrica() {
	Progressao p_original = new ProgressaoGeometrica(2);
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoGeometrica(2);

	long original_time = benchmark(100, p_original);
	long improved_time = benchmark(100, p_renan);

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0);
    }

    public void testProgressaoFibonacci() {
	Progressao p_original = new ProgressaoFibonacci();
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoFibonacci();

	long original_time = benchmark(35, p_original);
	long improved_time = benchmark(50, p_renan); // <<< Repare que eu estou calculando *mais* elementos!

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0);
    }
}
