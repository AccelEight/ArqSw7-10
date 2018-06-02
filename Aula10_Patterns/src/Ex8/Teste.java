package Ex8;

import Ex8.Consumidor;
import Ex8.NoticiarioAssina;

/**
 * 
 * @author Accel Gustavo Ara�jo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Pedro Gallon", noticiario);
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Tópicos interessantes!");
	new Consumidor("Jão", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Tópico ruim");
	
	
	}
}
