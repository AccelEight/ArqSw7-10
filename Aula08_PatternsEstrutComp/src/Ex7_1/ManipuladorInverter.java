package Ex7_1;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class ManipuladorInverter extends ManipuladorAbstrato {
	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
