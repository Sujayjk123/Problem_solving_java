package com.xworkz.EnterpriseCRUD1.service;

import com.xworkz.EnterpriseCRUD1.entity.House;

public class HouseServiceImplements implements HouseService{

	@Override
	public boolean save(House house) {
		if(house != null) {
			if(house.getNumberOfRooms()>3) {
				if(house.getSize()>=1500) {
					if(house.getMarketValue() < 3000000) {
						if(house.getConstructionYear() > 2000) {
							if(house.getColor().equals("black") ||house.getColor().equals("grey")||house.getColor().equals("white")) {
								System.out.println("House is valid ");
								return true;
							}
							System.err.println("The colour does not matching.");
							return false;
						}
						System.err.println("The house is too old.");
						return false;
					}
					System.err.println("the market value is too high.");
					return false;
				}
				System.err.println("The size of the area is too small.");
				return false;
			}
			System.err.println("Number of rooms are less.");
			return false;
		}
		System.out.println("house is null");
		return false;
	}
	
}
