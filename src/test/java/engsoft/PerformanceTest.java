package engsoft;

import junit.framework.TestCase;

import engsoft.renan.*;
import java.lang.System;

/*

  Comentários gerais a respeito da implementação.

  Minha solução pro problema de progressões é bem mais generica: A classe
  Progression é capaz de lidar com progressões de vários tipos (por exemplo,
  progressões que retornam tipos não inteiros, listas e afins) pois usa
  type-parameters. Por uma limitação de Java, não posso ter um HashMap de um tipo
  primitivo (e isso me surpreendeu, já que em c# isso funcionaria sem problemas).

  Para atingir a flexibilidade dos type parameters, é necessário usar os
  primitivos 'boxed', Integer, Double e afins. Isso por si só já causa um efeito
  de performance. O uso de um primitivo boxed por si só já causa degradação de
  performance. Desta forma, se forem rodados os exemplos abaixo uma unica vez, a
  versão 'original' sem memoização será mais rápida, não pela eficiencia de
  algoritmo mas pela questão do box-unbox que minha solução implica.

  Outros comentários pertinentes são mostrados abaixo.

*/

public class PerformanceTest extends TestCase {

    private long startTime;

    private void tick() {
	// Inicia um contador. Totalmente thread-unsafe
	startTime = System.nanoTime();
    }

    private long tock() {
	// Retorna o tempo decorrido desde o ultimo tick.
	return System.nanoTime() - startTime;
    }

    // Esse benchmark é bem caseiro, e não é lá muito confiável.
    private long benchmark(int until, Progressao progressao) {
	tick();

	// Aqui eu calculo todos os termos de `PROGRESSAO' de 1 a `UNTIL' 10 vezes.
	for(int j = 0; j < 10; j++) {
	    for(int i = 1; i <= until; i++) {
		progressao.iesimoTermo(i);
	    }
	}

	return tock();
    }

    private long benchmark(int until, engsoft.renan.Progressao progressao) {
	tick();

	for(int j = 0; j < 10; j++) {
	    for(int i = 1; i <= until; i++) {
		progressao.iesimoTermo(i);
	    }
	}
	return tock();
    }

    public void testPerformanceAritmetica() {
	Progressao p_original = new ProgressaoAritmetica(10);
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoAritmetica(10);

	long original_time = benchmark(50000, p_original);
	long improved_time = benchmark(50000, p_renan);

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0);
    }

    public void testProgressaoGeometrica() {
	Progressao p_original = new ProgressaoGeometrica(2);
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoGeometrica(2);

	long original_time = benchmark(50, p_original);
	long improved_time = benchmark(50, p_renan);

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0);
    }

    public void testProgressaoFibonacci() {
	/*
	  Um detalhe importante sobre as mudanças em fibonacci é que eu uso
	  BigDecimal para o resultado. Isso não seria possível se não fosse o
	  uso de type parameters para as progressões. Fibonacci a partir de 40
	  não cabe mais em um int. A impossibilidade de mudar o tipo de dado
	  retornado na solução original impossibilita um 'fibonacci de verdade'
	*/

	Progressao p_original = new ProgressaoFibonacci();
	engsoft.renan.Progressao p_renan = new engsoft.renan.ProgressaoFibonacci();

	long original_time = benchmark(35, p_original);
	long improved_time = benchmark(50, p_renan); // <<< Repare que eu estou calculando *mais* elementos!

	System.out.println("Original time:" + original_time);
	System.out.println("Improved time:" + improved_time);

	assertTrue(original_time - improved_time > 0); // << E mesmo assim sou mais rapido.
    }
}
