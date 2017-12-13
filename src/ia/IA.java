package ia;

import java.awt.Point;
import java.lang.reflect.InvocationTargetException;

import ia.infrastructure.Airport;
import ia.infrastructure.GasStation;
import ia.infrastructure.Generator;
import ia.infrastructure.Land;
import ia.infrastructure.Station;
import repository.Repository;

public class IA {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Repository repo = Repository.getInstance();
		Point origin = new Point(0, 0);
		
		double length = 12;
		double height = 10;
		
		Land myLand = new Land(origin, length, height);
		Generator<Airport> airportGenerator = new Generator<Airport>();
		myLand.addAirports(airportGenerator.generate(new Airport(), myLand, 2));
		
		Generator<Station> stationGenerator = new Generator<Station>();
		myLand.addStations(stationGenerator.generate(new Station(), myLand, 3));
		
		Generator<GasStation> gasStationGenerator = new Generator<GasStation>();
		myLand.addGasStations(gasStationGenerator.generate(new GasStation(), myLand, 3));

	}
	

}
