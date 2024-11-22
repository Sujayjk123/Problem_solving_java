package com.xworkz.EnterpriseCRUD2.service;

import com.xworkz.EnterpriseCRUD2.entity.Vehicle;
import com.xworkz.EnterpriseCRUD2.repo.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {
	VehicleRepoImpl repo = new VehicleRepoImpl();
	@Override
	public boolean validate(Vehicle vehicle) {
		
		if(vehicle != null) {
			if(vehicle.getNumberOfSeats()>=2) {
				if(vehicle.getManufacturingYear()>=2000) {
					if(vehicle.getVehicleMarketValue() < 3000000) {
						if(vehicle.getEngineCapacity() > 2) {
							if(vehicle.getVehicleColor().equals("black") ||vehicle.getVehicleColor().equals("grey")||vehicle.getVehicleColor().equals("white")) {
								System.out.println("Vehicle is valid ");
								repo.save(vehicle);
								
								return true;
							}
							System.err.println("The colour does not matching.");
							return false;
						}
						System.err.println("The Vehicle engine capacity is too low.");
						return false;
					}
					System.err.println("the market value is too high.");
					return false;
				}
				System.err.println("The vehicle is too old.");
				return false;
			}
			System.err.println("Number of seats are less.");
			return false;
		}
		System.out.println("vehicle is null");
		return false;
	}
	@Override
	public Vehicle[] readAll() {
		
		return repo.readall();
	}

}
