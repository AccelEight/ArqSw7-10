package Ex7_2;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

import java.util.Comparator;

public class ComparatorDouble implements Comparator<Double> {
	public int compare(Double d1, Double d2) {
		Double d1z = d1 - Math.floor(d1);
		Double d2z = d2 - Math.floor(d2);
		return d1z.compareTo(d2z);
	}
}
