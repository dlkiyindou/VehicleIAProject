package com.scholanova.groupe2.vehicleia.app.vehicle;

import java.awt.Point;

public abstract class Vehicle {
	
	private int x;
	private int y;
	private Point positionVehicle;
	
	public void move(Point destination) {
		
		
		
		
		
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Point getPositionVehicle() {
		return positionVehicle;
	}

	public void setPositionVehicle(Point positionVehicle) {
		this.positionVehicle = positionVehicle;
	}

}
