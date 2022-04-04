package com.spring.mydiv.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mydiv.Dto.Event;

@Mapper
public interface EventMapper {
	
	public int insertEventInfo(Event event);
	
	public List<Event> getEventBriefly(String TravelName);
}
