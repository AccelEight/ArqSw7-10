package Ex1_2AbstractFactory;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA: 81616654- Turma:SIN3AN-MCA
 * 			
 *
 */

public class FabricaPizzaria implements FabircaAbstrataPizzaria{
	String m;
	
	@Override
	public String funcionarioP() {
		
		return  m = "Pizzas -- Ingredientes do dia:\n * Queijo\n * Calabresa\n * Tomate\n**********************************\nCalzones -- Ingredientes do dia:\n * Queijo\n * Calabresa\n * Tomate\n";
	}
	
	@Override
	public String funcionarioS() {
		
		return  m = "Pizzas -- Ingredientes do dia:\n * Queijo\n * Presunto\n * Tomate\n**********************************\nCalzones -- Ingredientes do dia:\n * Queijo\n * Presunto\n * Tomate\n";
	}

}
