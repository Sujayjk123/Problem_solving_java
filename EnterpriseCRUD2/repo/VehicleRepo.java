package com.xworkz.EnterpriseCRUD2.repo;

import com.xworkz.EnterpriseCRUD2.entity.Vehicle;

public interface VehicleRepo {
	public boolean save(Vehicle vehicle);
	public Vehicle[] readall();
}
