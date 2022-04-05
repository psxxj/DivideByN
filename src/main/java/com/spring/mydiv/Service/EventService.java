package com.spring.mydiv.Service;

import java.util.List;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

public interface EventService {
	
	List<Event> CreateEvent(Event event);
	boolean get_difference(Event event, Person person);
	void SetRole(String travelName);
	boolean UpdateRole(Person person);
	public long getEventNum(Event event);
	
	public Event ShowEvent(Event event);
	
	public List<String> ShowWhoInTravel(String TravelName);
	
}
