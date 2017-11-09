package ia.vehicle;

import ia.energy.Fuel;

public interface Fuelable {
	public void charge(Fuel fuel, int quantity);
}
