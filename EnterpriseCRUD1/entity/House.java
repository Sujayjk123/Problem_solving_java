package com.xworkz.EnterpriseCRUD1.entity;

public class House {
	private String address;
	private int numberOfRooms;
	private String type;
	private double size; 
	private String color;
	private String ownerName;
	private double marketValue; 
	private int constructionYear;
	
	public House(String address, int numberOfRooms, String type, double size, String color, String ownerName,
			double marketValue, int constructionYear) {
		super();
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.type = type;
		this.size = size;
		this.color = color;
		this.ownerName = ownerName;
		this.marketValue = marketValue;
		this.constructionYear = constructionYear;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public int getConstructionYear() {
		return constructionYear;
	}
	public void setConstructionYear(int constructionYear) {
		this.constructionYear = constructionYear;
	}
}
