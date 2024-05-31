package br.com.fipeconsulter.model;

public class Vehicle {
	
	private String name;
	private int year;
	private String cost;
	private String fuel;
	
	public Vehicle(VehicleData vehicleData) {
		this.name = vehicleData.name();
		this.year = vehicleData.year();
		this.cost = vehicleData.cost();
		this.fuel = vehicleData.fuel();
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public String getCost() {
		return cost;
	}

	public String getFuel() {
		return fuel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "[Nome=" + name + ", Ano=" + year + ", Custo=" + cost + ", Combutivel=" + fuel + "]";
	}
}
