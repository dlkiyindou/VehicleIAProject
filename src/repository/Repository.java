package repository;

import java.util.Random;

import ia.vehicle.Car;
import ia.vehicle.Plane;
import ia.vehicle.Train;
import ia.vehicle.Vehicle;

public class Repository {
	private static Repository INSTANCE =  new Repository();
	
	private Repository (){}
	
	public static Repository getInstance() {
		return INSTANCE;
	}
	
	
	public Vehicle generate()
	{
		Random rand =  new Random();
		int value = rand.nextInt(5);
		Vehicle vehicle =  null;
		
		switch(value) {
			case 0 :
				vehicle = new Plane();
				break;
			case 1 :
				vehicle = new Car();
				break;
			case 3 :
				vehicle = new Train();
				break;
			default:
				
				break;
					
		}
		
		return vehicle;
	}
}
