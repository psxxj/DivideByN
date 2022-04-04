package com.spring.mydiv.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Mapper.EventMapper;
import com.spring.mydiv.Mapper.PersonMapper;
@Service
public class EventServiceImpl implements EventService{
	@Autowired
	EventMapper eventMapper;
	@Autowired
	PersonMapper personMapper;
	
	public List<Event> CreateEvent(Event event) {
		// event.SetInfo();
		//System.out.println("setinfo success");
		int affectRowCount = this.eventMapper.insertEventInfo(event);
		//System.out.println("insert event success");
		if (affectRowCount ==  1) { // 1 = success
	    	for(Person parti : event.getParticipant()) {
	    		get_difference(event, parti);
	    		//System.out.println("get diff success");
	    	}
	    	String TravelName = event.getTravelName();
	    	SetRole(TravelName);
	    	//System.out.println("setrole success");
	    	return this.eventMapper.getEventBriefly(TravelName);
	    }
	    return null;
	}
	
	public boolean get_difference(Event event, Person person) {
		if (person.getPersonName() == event.getPayer().getPersonName()){
			//System.out.println(person.getPersonName());
			person.setSumGet(person.getSumGet()+event.getGetPrice());			
		} else {
			person.setSumSend(person.getSumSend()+event.getDividePrice());
		}
		person.setDifference(person.getSumGet() - person.getSumSend());
		//System.out.println(person.getDifference());
		//System.out.println(person.getPerson_id());
		int affectRowCount = this.personMapper.updatePersonMoney(person);
		return affectRowCount == 1;
	}
	
	public void SetRole(String travelName) {
		double max_difference = 0;
		Person Leader = null;
		
		List<Person> personALL = this.personMapper.getWhoInTravelAll(travelName);
		for(Person person : personALL) {
			if(person.getDifference() < 0) {
				person.setRole("SENDER");
			}
			else {
				person.setRole("GETTER");
				if (max_difference < person.getDifference()) {
					Leader = person;
					max_difference = person.getDifference();
				}
			}
		}
		Leader.setRole("LEADER");
		
		for(Person person : personALL) {
			if (!UpdateRole(person)) {
				System.out.println("Fail!");
			}
		}	
	}

	public boolean UpdateRole(Person person) {
		int affectRowCount = this.personMapper.updatePersonRole(person);
		return affectRowCount == 1;
	}
	
	
	//public long getEventNum(Event event)
	
	//public List<String> ShowWhoInTravel(Event event)	
	
}
