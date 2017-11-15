package ia.infrastructure;

import java.awt.Point;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;

import java.util.List;

public class Land {
	private Point origin;
	private Double length;
	private Double height;
	// Liste des gares
	private Set<Station> listStation = new HashSet<Station>();
	// Liste des stations services
	private Set<GasStation> listGasStation = new HashSet<GasStation>();
	// Liste des aéroports
	private Set<Airport> listAirport = new HashSet<Airport>();
	
	public Land() {
	}
	
	public Land(Point origin, Double length, Double height) {
		this.origin = origin;
		this.length = length;
		this.height = height;
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
	}
	
	public Double getHeight() {
		return height;
	}
	
	public void setHeight(Double height) {
		this.height = height;
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
	
	
	
}
