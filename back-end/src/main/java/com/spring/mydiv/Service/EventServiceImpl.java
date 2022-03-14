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
	
	String travelName;
	
	public List<Event> CreateEvent(Event event) {
		int affectRowCount = this.eventDao.insert(event);
	    if (affectRowCount ==  1) { // 1 = success
	    	
	    	for(Person parti : event.getParticipant()) {
	    		personService.get_difference(parti);
	    	}
	    	travelService.setRole(event.getParticipant()); //DB 업데이트 완료

	    	
	    	
	    	this.travelName = event.getTravelName();
	    	return this.eventDao.getEventBriefly(travelName);
	    }
	    return null; //??
	}
	
	@Override //<-
	public long getTravelPeriod() {
		return this.eventDao.getTravelPeriod(travelName);
	}
	
	@Override //<-
	public long getEventNum() {
		return this.eventDao.getTravelPeriod(travelName);
	}
	
	public Event ShowEvent(Event event) {
		return this.eventDao.getEventDetail(event);
	}
	
	
	
	
	
	
	
	@Override //<-
	public void setPersonRole() {
		
		
		return this.eventDao.getTravelPeriod(travelName);
	}
	
	
	
	@Override
	public String CreateEvednt(Event event){
		int affectRowCount = this.eventDao.insert(event);
	    if (affectRowCount ==  1) { // 1 = success

	    	// 이렇게 하면 sum값이 저장되어있을 때만 가능 ...
	    	for(Person parti : event.getParticipant()) {
	    		
	    	}
	    	// 저장 안된다 치면 일일이 event 리스트를 돌아야 한다
	    	// 아니면 사람 이름에 따른 데이터베이스를 여러개 만들던가 . . . . .. 
	    	
	    	
	    	// personDB에서 travelName 겹치는 애들 리스트 불러오기
	    	// 리스트 돌면서 difference 계산 - parti event / payer event 구분하기
	    	// 리스트 돌면서 difference 보면서 role 정하기
	    }
	    
	    
		 {
			personService.get_difference(parti);
		}
		
		
		personService.get_difference(event.getPayer());
		
		return "Service --> DAO : Success";
	}
	

	
}
