package Ex2_1FactoryMethod;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA: 81616654- Turma:SIN3AN-MCA
 * 			
 *
 */

public class ExecutarNome {

	public static void main(String[] args) {
		FabricaNome fn = new FabricaNome();
		
		String nome = "Jessica";
		String sobrenome = "Alexandre";
		
		fn.getNome(nome, sobrenome);

	}

}