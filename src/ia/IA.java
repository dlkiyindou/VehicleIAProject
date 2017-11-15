package ia;

import java.awt.Point;
import java.util.Collection;

import ia.infrastructure.Airport;
import ia.infrastructure.Land;
import ia.infrastructure.Station;
import ia.vehicle.Plane;
import ia.vehicle.Vehicle;
import repository.Repository;

public class IA {

	public static void main(String[] args) {
		Repository repo = Repository.getInstance();
		Point origin = new Point(0, 0);
		
		double length = 12;
		double height = 10;
		
		Land myLand = new Land(origin, length, height);
		
		Station s = new Station();
		Station s1 = new Station();
		myLand.addStations(s, s1);
		
//		for (int i = 0; i < 15; i ++) {
//			Vehicle v = repo.generate();
//			if (v != null) {
//				System.out.println(v.getClass());
//			} else {
//				System.out.println("Vehicle NULL");
//			}
//		}
		

	}
	
	
	private static Collection<Airport> generateAirports(Land land) {
		
		return null;
	}

}
