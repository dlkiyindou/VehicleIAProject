package ia.infrastructure;

import java.awt.Point;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Land {
	private Point origin;
	private Double length;
	private Double height;
	private Point p1, p2, p3;
	
	// Liste des gares
	private Set<Station> listStation = new HashSet<Station>();
	// Liste des stations services
	private Set<GasStation> listGasStation = new HashSet<GasStation>();
	// Liste des a�roports
	private Set<Airport> listAirport = new HashSet<Airport>();
	
	public Land() {}
	
	public Land(Point origin, Double length, Double height) {
		this.origin = origin;
		this.length = length;
		this.height = height;
		
		generatePoint();
	}
	
	
	public Point getOrigin() {
		return origin;
	}
	
	public void setOrigin(Point origin) {
		this.origin = origin;
	}
	
	public Double getLength() {
		return length;
	}
	
	public void setLength(Double length) {
		this.length = length;
		generatePoint();
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
		generatePoint();
	}

	public Set<Station> getListStation() {
		return listStation;
	}

	public void setListStation(Set<Station> listStation) {
		this.listStation = listStation;
	}

	public Set<GasStation> getListGasStation() {
		return listGasStation;
	}

	public void setListGasStation(Set<GasStation> listGasStation) {
		this.listGasStation = listGasStation;
	}

	public Set<Airport> getListAirport() {
		return listAirport;
	}

	public void setListAirport(Set<Airport> listAirport) {
		this.listAirport = listAirport;
	}

	public void addStations(Collection<Station> listStation) {
		this.listStation.addAll(listStation);
	}	
	
	public void addStations(Station ... stations) {
		List<Station> myList = Arrays.asList(stations);
		addStations(myList);
	}
	
	public void addGasStations(Collection<GasStation> listStation) {
		this.listGasStation.addAll(listStation);
	}	
	
	public void addGasStations(GasStation ... stations) {
		List<GasStation> myList = Arrays.asList(stations);
		addGasStations(myList);
	}
	
	public void addAirports(Collection<Airport> listAirport) {
		this.listAirport.addAll(listAirport);
	}	
	
	public void addAirports(Airport ... airports) {
		List<Airport> myList = Arrays.asList(airports);
		addAirports(myList);
	}
	
	private void generatePoint() {
		p1 = new Point();
		p1.setLocation(this.origin.getX() + this.length, this.origin.getY());
		
		p2 = new Point();
		p2.setLocation(this.origin.getX() + this.length, this.origin.getY() + this.height);
		
		p3 = new Point();
		p3.setLocation(this.origin.getX(), this.origin.getY() + this.height);
	}
	
	
	public double getXMax() {
		return p2.getX();
	}
	
	
	public double getYMax() {
		return p2.getY();
	}
	
	public double getXMin() {
		return origin.getX();
	}
	
	
	public double getYMin() {
		return origin.getY();
	}
}
