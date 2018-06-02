package Ex4_2;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Cliente {
	/** Somador. */
	private SomadorEsperado somador;

	/** Construtor. */
	public Cliente(SomadorEsperado somador) {
		this.somador = somador;
	}

	/** Efetua a soma de um vetor. */
	public void executar() {
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int soma = somador.somaVetor(vetor);
		System.out.println("Resultado: " + soma);
	}
}
