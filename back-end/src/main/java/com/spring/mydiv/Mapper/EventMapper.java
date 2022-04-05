package com.spring.mydiv.Mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

@Mapper
public interface EventMapper {
	
	public int insertEventInfo(Event event);
	
	public List<Event> getEventBriefly(String TravelName);
	
	public Date getLatest(String TravelName);
	public Date getOldest(String TravelName);
	
	public int getEventNum(String TravelName);
	
	//----------detail----------//
	public Event getEventDetail(Event event);
	
	//--------for personservice-//
	public List<Event> getWhatEventIn(Person person);
}
