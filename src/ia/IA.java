package ia;

import java.awt.Point;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

import javax.sound.midi.ControllerEventListener;

import ia.infrastructure.Airport;
import ia.infrastructure.Generator;
import ia.infrastructure.InfraStructure;
import ia.infrastructure.Land;
import ia.infrastructure.Station;
import ia.vehicle.Plane;
import ia.vehicle.Vehicle;
import repository.Repository;

public class IA {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Repository repo = Repository.getInstance();
		Point origin = new Point(0, 0);
		
		double length = 12;
		double height = 10;
		
		Land myLand = new Land(origin, length, height);
		Generator<Airport> airportGenerator = new Generator<Airport>();
		myLand.addAirports(
			airportGenerator.generate(
				new Airport(), 
				myLand.getXMin(),
				myLand.getYMin(),
				myLand.getXMax(),
				myLand.getYMax(),
				2)
			);

	}
	

}
