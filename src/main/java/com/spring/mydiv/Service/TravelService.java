package com.spring.mydiv.Service;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Travel;

public interface TravelService {
	
	String CreateTravel(Travel travel);
	public String getTravelPeriod(Event event);

}