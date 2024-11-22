package com.xworkz.EnterpriseCRUD2.service;

import com.xworkz.EnterpriseCRUD2.entity.Vehicle;

public interface VehicleService {
	public boolean validate(Vehicle vehicle);
	public Vehicle[] readAll();
}
