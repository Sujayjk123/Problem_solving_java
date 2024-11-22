package com.xworkz.EnterpriseCRUD2.repo;

import com.xworkz.EnterpriseCRUD2.entity.Vehicle;

public class VehicleRepoImpl implements VehicleRepo{
	protected Vehicle []vehicles = new Vehicle[10];
	@Override
	public boolean save(Vehicle vehicle) {
		
		for(int i=0;i<vehicles.length;i++) {
			if(vehicles[i]==null) {
				vehicles[i] = vehicle;
				System.out.println("Vehicle Saved Successfully");
				return true;
			}
		}
		System.err.println("The array of Vehicles is full");
		return false;
	}
	@Override
	public Vehicle[] readall() {
		// TODO Auto-generated method stub
		return vehicles;
	}
	

}
