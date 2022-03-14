package com.spring.mydiv.Dao;

import java.util.Date;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Travel;

public class EventDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insert(Event event) {
		return this.sqlSessionTemplate.insert("event.insert", event);
	}

	public List<Event> getEventBriefly(String travelName){
		List<Event> list = this.sqlSessionTemplate.selectList("event.getEventBriefly", travelName);
		return list;
	}
	
	public long getTravelPeriod(String travelName) {
		Date format1 = this.sqlSessionTemplate.selectOne("event.getLatest", travelName);
		Date format2 = this.sqlSessionTemplate.selectOne("event.getOldest", travelName);
		long diffSec = (format1.getTime() - format2.getTime()) / 1000; //초 차이
        long diffDays = diffSec / (24*60*60); //일자수 차이
        return diffDays;
	}
	
	// [to event_detail] all
	public Event getEventDetail(Event event) {
		return this.sqlSessionTemplate.selectOne("event.getEventDetail", event);
	}
	// [to main_event] count (how many events)
	public int getEventNum(String travelName) {
		return this.sqlSessionTemplate.selectOne("event.getEventNum", travelName);
	}
	

	
	
}
