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
	
	public Collection<E> generate(E e, double xmin, double ymin, double xmax, double ymax, int number) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Collection<E> apCollection = new HashSet<E>();
		Map<Point, E> map = new HashMap<Point, E>();
		
		Point position;
	
		Class<? extends InfraStructure> clazz = e.getClass();
		Constructor<? extends InfraStructure> constructor = clazz.getConstructor();
	
		do {
			position = getRandomPosition(xmin, ymin, xmax, ymax);
			E e1 = (E) constructor.newInstance();
			e1.setPosition(position);
			map.put(position, e1);
		} while (map.size() < number);
		
		return apCollection;
	}
}
