package com.spring.mydiv.Service;

import java.util.List;

import com.spring.mydiv.Dto.Event;

public interface EventService {

	long getTravelPeriod(Event event);
	long getEventNum(Event event);
	List<Event> CreateEvent(Event event);
	Event ShowEvent(Event event);
	List<String> ShowWhoInTravel(Event event);

}
