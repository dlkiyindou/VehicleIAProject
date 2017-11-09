package ia.vehicle;

import ia.energy.Electricity;

public interface Electricable {
	public void charge(Electricity electricity, int quantity);
}
