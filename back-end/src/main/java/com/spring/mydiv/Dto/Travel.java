package com.spring.mydiv.Dto;

import java.util.ArrayList;

public class Travel {
	
	private int Travel_id;
	private String TravelName; //in travelDB
	
	
	public Travel(String travelName) {
		this.setTravelName(travelName);
	}

	public String getTravelName() {
		return TravelName;
	}
	public int getTravel_id() {
		return Travel_id;
	}

	public void setTravelName(String travelName) {
		this.TravelName = travelName;
	}

	
}