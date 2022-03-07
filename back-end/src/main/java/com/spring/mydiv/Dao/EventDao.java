package com.spring.mydiv.Dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;

public class EventDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	// [from user] insert name, date, payer, parti, price
	public int insert(Event event) {
		return this.sqlSessionTemplate.insert("event.insert", event);
	}
	// [to main] name, payer, price, date
	public List<Event> getEventBriefly(Travel travel){
		List<Event> list = this.sqlSessionTemplate.selectList("person.getEventBriefly", travel);
		return list;
	}
	// [to event] all
	public Event getEventDetail(Event event) {
		return this.sqlSessionTemplate.selectOne("person.getEventDetail", event);
	}
	//
	public int getEventNum(Travel travel) {
		return this.sqlSessionTemplate.selectOne("person.getEventDetail", travel);
	}
}
