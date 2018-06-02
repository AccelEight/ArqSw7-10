package Ex4_2;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Main {
	
	public static void main(String[] args) {
		// Cria o cliente com o adaptador.
		Cliente cliente = new Cliente(new SomadorAdapter());
		cliente.executar();
	}
}
