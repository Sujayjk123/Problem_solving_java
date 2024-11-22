package com.xworkz.EnterpriseCRUD2;

import com.xworkz.EnterpriseCRUD2.entity.Vehicle;
import com.xworkz.EnterpriseCRUD2.service.VehicleServiceImpl;

public class VehicleRunner {
	public static void main(String[] args) {
		Vehicle []veh = new Vehicle[10];
		Vehicle vehicle = new Vehicle("1234 Main St", 5, "SUV", 2.5, "white", "Rohan Sharma", 20000.00, 2020);
		VehicleServiceImpl serv =  new VehicleServiceImpl();
		serv.validate(vehicle);
		veh = serv.readAll();	
		for(int i=0;i<veh.length;i++) {
			if(veh[i]!=null)
				veh[i].displayDetails();
		}
	}
	
	
	
}
