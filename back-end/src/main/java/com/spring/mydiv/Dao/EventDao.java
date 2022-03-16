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
	
	//----------create----------//
	public int insert(Event event) {
		return this.sqlSessionTemplate.insert("event.insert", event);
	}

	public long getTravelPeriod(String TravelName) {
		Date format1 = this.sqlSessionTemplate.selectOne("event.getLatest", TravelName);
		Date format2 = this.sqlSessionTemplate.selectOne("event.getOldest", TravelName);
		long diffSec = (format1.getTime() - format2.getTime()) / 1000; //�� ����
        long diffDays = diffSec / (24*60*60); //���ڼ� ����
        return diffDays;
	}
	
	public List<Event> getEventBriefly(String TravelName){
		List<Event> list = this.sqlSessionTemplate.selectList("event.getEventBriefly", TravelName);
		return list;
	}
	
	public int getEventNum(String TravelName) {
		return this.sqlSessionTemplate.selectOne("event.getEventNum", TravelName);
	}
	
	//----------detail----------//
	public Event getEventDetail(Event event) {
		return this.sqlSessionTemplate.selectOne("event.getEventDetail", event);
	}

}
