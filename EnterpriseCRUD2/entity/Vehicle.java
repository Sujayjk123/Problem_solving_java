package com.xworkz.EnterpriseCRUD2.entity;

public class Vehicle {
	private String registrationAddress; 
	private int numberOfSeats;          
	private String vehicleType;          
	private double engineCapacity;       
	private String vehicleColor;         
	private String ownerName;            
	private double vehicleMarketValue;   
	private int manufacturingYear;  
	
	public Vehicle(String registrationAddress, int numberOfSeats, String vehicleType, double engineCapacity,
			String vehicleColor, String ownerName, double vehicleMarketValue, int manufacturingYear) {
		super();
		this.registrationAddress = registrationAddress;
		this.numberOfSeats = numberOfSeats;
		this.vehicleType = vehicleType;
		this.engineCapacity = engineCapacity;
		this.vehicleColor = vehicleColor;
		this.ownerName = ownerName;
		this.vehicleMarketValue = vehicleMarketValue;
		this.manufacturingYear = manufacturingYear;
	}
	public String getRegistrationAddress() {
		return registrationAddress;
	}
	public void setRegistrationAddress(String registrationAddress) {
		this.registrationAddress = registrationAddress;
	}
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	public String getVehicleColor() {
		return vehicleColor;
	}
	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getVehicleMarketValue() {
		return vehicleMarketValue;
	}
	public void setVehicleMarketValue(double vehicleMarketValue) {
		this.vehicleMarketValue = vehicleMarketValue;
	}
	public int getManufacturingYear() {
		return manufacturingYear;
	}
	public void setManufacturingYear(int manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
	}
	
	public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Registration Address: " + registrationAddress);
        System.out.println("Number of Seats: " + numberOfSeats);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Engine Capacity: " + engineCapacity + " liters");
        System.out.println("Vehicle Color: " + vehicleColor);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Market Value: $" + vehicleMarketValue);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
	    

}
