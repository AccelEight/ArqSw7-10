package Ex1_1AbstractFactory;

/**
 * 
 * @author Accel Gustavo Ara�jo Rocha RA: 81616654- Turma:SIN3AN-MCA
 * 			
 *
 */

public class HelloWorld {
	
	//Fabrica abstrata de impress�es
	private FabricaAbstract fabrica;

	//Construtor
	public HelloWorld() {
		// Gera um n�mero aleatorio entre 0 e 1.
		double rand = Math.random();

		// Se o n�mero for menor que 0,3, usa o console. Caso contrario usa o arquivo.
		if (rand <= 0.3)
			fabrica = new FabricaTela();
		else fabrica = new FabricaFile();
	}

	//Cria uma impress�o e envia o "Hello, World!"
	public void enviarHelloWorld() {
		Impressao impressao = fabrica.criarImpressao();
		System.out.println("Utilizando " + impressao.getClass().getSimpleName());
		impressao.imprimir("Hello, World!");
	}
	
}
