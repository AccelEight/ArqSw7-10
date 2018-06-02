package Ex1_1AbstractFactory;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA: 81616654- Turma:SIN3AN-MCA
 * 			
 *
 */

public class FabricaFile implements FabricaAbstract {
	
	private static final Impressao impressao = new ImpressaoArquivo("output.txt");

	@Override
	public Impressao criarImpressao() {
		return impressao;
	}

}
