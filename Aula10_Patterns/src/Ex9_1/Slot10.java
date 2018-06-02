package Ex9_1;

import Ex9_1.Slot;

/**
 * 
 * @author Accel Gustavo Araújo Rocha RA:81616654 - SIN3AN-MCA
 *
 */

public class Slot10 implements Slot {
	private Slot slot;

	public Slot10() {
	};

	@Override
	public double recebeMoeda(int m) {
		if (m == 10) {
			System.out.println("-- Recebeu R$0,10");
			return 0.1;
		} else {
			return this.slot.recebeMoeda(m);
		}
	}

	@Override
	public void setSlot(Slot s) {
		this.slot = s;
	}

}