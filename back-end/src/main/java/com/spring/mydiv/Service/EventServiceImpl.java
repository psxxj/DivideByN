package com.spring.mydiv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mydiv.Dao.EventDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;

public class EventServiceImpl implements EventService {
	@Autowired
	private EventDao eventDao;
	
	@Autowired
	private PersonService personService;
	@Autowired
	private TravelService travelService;
	
	//----------create----------//
	public List<Event> CreateEvent(Event event) {
		int affectRowCount = this.eventDao.insert(event);
	    if (affectRowCount ==  1) { // 1 = success
	    	for(Person parti : event.getParticipant()) {
	    		personService.get_difference(event, parti);
	    	}
	    	String travelName = event.getTravelName();
	    	travelService.SetRole(travelName);
	    	return this.eventDao.getEventBriefly(travelName);
	    }
	    return null;
	}
	
	@Override
	public long getTravelPeriod(Event event) {
		String travelName = event.getTravelName();
		return this.eventDao.getTravelPeriod(travelName);
	}
	
	@Override
	public long getEventNum(Event event) {
		String travelName = event.getTravelName();
		return this.eventDao.getEventNum(travelName);
	}
	
	//----------detail----------//
	public Event ShowEvent(Event event) {
		return this.eventDao.getEventDetail(event);
	}
}
