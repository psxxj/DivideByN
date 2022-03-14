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
	    	travelService.setRole(event.getParticipant()); //DB ������Ʈ �Ϸ�

	    	
	    	
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

	    	// �̷��� �ϸ� sum���� ����Ǿ����� ���� ���� ...
	    	for(Person parti : event.getParticipant()) {
	    		
	    	}
	    	// ���� �ȵȴ� ġ�� ������ event ����Ʈ�� ���ƾ� �Ѵ�
	    	// �ƴϸ� ��� �̸��� ���� �����ͺ��̽��� ������ ������� . . . . .. 
	    	
	    	
	    	// personDB���� travelName ��ġ�� �ֵ� ����Ʈ �ҷ�����
	    	// ����Ʈ ���鼭 difference ��� - parti event / payer event �����ϱ�
	    	// ����Ʈ ���鼭 difference ���鼭 role ���ϱ�
	    }
	    
	    
		 {
			personService.get_difference(parti);
		}
		
		
		personService.get_difference(event.getPayer());
		
		return "Service --> DAO : Success";
	}
	

	
}
