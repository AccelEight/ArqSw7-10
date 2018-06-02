package Ex1_1AbstractFactory;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA: 81616654- Turma:SIN3AN-MCA
 * 			
 *
 */ 

public class ImpressaoTela implements Impressao {
	
	public void imprimir(String string) {
		System.out.println(string);
	}

}