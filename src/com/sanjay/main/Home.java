package com.sanjay.main;

import com.sanjay.home.entities.BedRoom;
import com.sanjay.home.entities.DiningHall;
import com.sanjay.home.entities.kitchen;
public class Home {
	private kitchen kitchen;private DiningHall dininghall;
	private BedRoom bedroom;
	public kitchen getKitchen() {
		return kitchen;
	}
	public void setKitchen(kitchen kitchen) {
		this.kitchen = kitchen;
	}
	public DiningHall getDininghall() {
		return dininghall;
	}
	public void setDininghall(DiningHall dininghall) {
		this.dininghall = dininghall;
	}
	public BedRoom getBedroom() {
		return bedroom;
	}
	public void setBedroom(BedRoom bedroom) {
		this.bedroom = bedroom;
	}
	
	void hello()
	{
		System.out.println("are u looking home");
	}
	
}
