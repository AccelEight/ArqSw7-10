package Ex7_1;

/**
 * 
 * @author Accel Gustavo Ara�jo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

	public class ManipuladorMinusculo extends ManipuladorAbstrato {
		protected String transformarString(String string) {
			return string.toLowerCase();
		}
	}