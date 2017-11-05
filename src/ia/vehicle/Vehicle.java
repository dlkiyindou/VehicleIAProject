package ia.vehicle;

public abstract class Vehicle {
	private double x;
	private double y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void move(double x, double y) {
		this.x = x; 
		this.y = y;
	}
	
	/**
	 * 
	 * @param distance
	 * @param angle
	 */
	public void move(double distance, long angle) {
		double angRad = angle * Math.PI/180;
		this.x = distance * Math.round(Math.cos(angRad));
		this.y = distance * Math.round(Math.sin(angRad));
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
