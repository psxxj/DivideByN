package com.spring.mydiv.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Mapper.TravelMapper;

@Service
public class TravelServiceImpl implements TravelService{
	@Autowired
	TravelMapper travelMapper;
	
	//@Override
	public String CreateTravel(Travel travel) {
		int affectRowCount = this.travelMapper.insertTravelName(travel);
	    if (affectRowCount ==  1) { // 1 = success
	    	return travel.getTravelName();
	    }
	    return null;
	}
	
	//public long setTravelPeriod(Event event)
	
}
