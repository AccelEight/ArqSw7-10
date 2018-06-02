package Ex9_1;

import Ex9_1.Slot;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Slot100 implements Slot {
	private Slot slot;

	public Slot100() {
	}

	@Override
	public double recebeMoeda(int m) {
		if (m == 100) {
			System.out.println("-- Recebeu R$1,00");
			return 1;
		}else {
			return 0;
		}

	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}
