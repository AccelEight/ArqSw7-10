package Ex4_2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class SomadorAdapter implements SomadorEsperado {
	/** Somador existente. */
	private static SomadorExistente somador = new SomadorExistente();

	public int somaVetor(int[] vetor) {
		List<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < vetor.length; i++)
			lista.add(vetor[i]);
		return somador.somaLista(lista);
	}
}