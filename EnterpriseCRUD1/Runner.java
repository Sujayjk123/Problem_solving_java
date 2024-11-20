package com.xworkz.EnterpriseCRUD;

import com.xworkz.EnterpriseCRUD1.entity.House;
import com.xworkz.EnterpriseCRUD1.service.HouseServiceImplements;

public class Runner {
	public static void main(String[]args) {
		House house = new House("123 MG Road, Bengaluru", 4, "Villa", 1500, "white", 
                "Ravi Kumar", 2500000, 2015);
		HouseServiceImplements h1 = new HouseServiceImplements();
		h1.save(house);
	}
}
