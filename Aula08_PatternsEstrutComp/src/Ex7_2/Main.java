package Ex7_2;

import java.util.Arrays;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Main {
	
	private static final int NUM = 5;

	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	public static void main(String[] args) throws Exception {
		Double[] v = construirVetor();

		Arrays.sort(v, new ComparatorDouble());

		System.out.println(Arrays.toString(v));
	}
}
