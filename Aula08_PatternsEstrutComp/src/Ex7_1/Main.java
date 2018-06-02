package Ex7_1;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Main {

	public static void main(String[] args) throws Exception {
		
		ManipuladorAbstrato manipulador;

		System.out.println("-------------------------------");
		System.out.println("    Transforma em maiúsculo    ");
		System.out.println("-------------------------------");
		manipulador = new ManipuladorMaiusculo();
		manipulador.manipularString();

		System.out.println("-------------------------------");
		System.out.println("    Transforma em minúsculo    ");
		System.out.println("-------------------------------");
		manipulador = new ManipuladorMinusculo();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Duplica    ");
		System.out.println("---------------");
		manipulador = new ManipuladorDuplicar();
		manipulador.manipularString();

		System.out.println("---------------");
		System.out.println("    Inverte    ");
		System.out.println("---------------");
		manipulador = new ManipuladorInverter();
		manipulador.manipularString();
	}
}
