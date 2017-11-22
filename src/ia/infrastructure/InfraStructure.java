package ia.infrastructure;

import java.awt.Point;

import ia.Localizable;

public abstract class InfraStructure implements Localizable {
	private Point position;
	
	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}
}
