package com.spring.mydiv.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Mapper.EventMapper;
import com.spring.mydiv.Mapper.TravelMapper;

@Service
public class TravelServiceImpl implements TravelService{
	@Autowired
	TravelMapper travelMapper;
	@Autowired
	EventMapper eventMapper;
	
	//@Override
	public String CreateTravel(Travel travel) {
		int affectRowCount = this.travelMapper.insertTravelName(travel);
	    if (affectRowCount ==  1) { // 1 = success
	    	return travel.getTravelName();
	    }
	    return null;
	}
	
	//@Override
	public String getTravelPeriod(Event event) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		String travelName = event.getTravelName();
		Date format1 = this.eventMapper.getLatest(travelName);
		Date format2 = this.eventMapper.getOldest(travelName);
		long diffSec = (format1.getTime() - format2.getTime()) / 1000;
        long diffDays = diffSec / (24*60*60);
        String periodFormat = dateFormat.format(format2) + " ~ " + dateFormat.format(format1)
        						+ ", " + diffDays + " days";
        return periodFormat;
	}
	
	
	
}
