package ia.infrastructure;

import java.awt.Point;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Generator<E extends InfraStructure> {
	private Point getRandomPosition(double xmin, double ymin, double xmax, double ymax) {
		Random r = new Random();
		double x = (xmax - xmin) * r.nextDouble() + xmin;
		double y = (ymax - ymin) * r.nextDouble() + ymin;
		Point position = new Point();
		position.setLocation(x, y);
		
		return position;
	}
	

	public Collection<E> generate(E e, Land land, int number) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Collection<E> apCollection = new HashSet<E>();
		Point position;
	
		Class<? extends InfraStructure> clazz = e.getClass();
		Constructor<? extends InfraStructure> constructor = clazz.getConstructor();
	
		do {
			position = getRandomPosition(land.getXMin(), land.getYMin(), land.getXMax(), land.getYMax());
			
			if (land.positionIsAvailable(position)) {
				E e1 = (E) constructor.newInstance();
				e1.setPosition(position);
				apCollection.add(e1);
			}
		} while (apCollection.size() < number);
		
		return apCollection;
	}
}
