package com.spring.mydiv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Mapper.EventMapper;
import com.spring.mydiv.Mapper.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper personMapper;
	@Autowired
	EventMapper eventMapper;
	
	//----------create----------//
	@Override
	public List<Person> CreatePerson(Person person) {
		int affectRowCount = this.personMapper.insertPersonInfo(person);
	    if (affectRowCount ==  1) { // 1 = success
	    	String travelName = person.getTravelName();
	    	return this.personMapper.getPersonBriefly(travelName);
	    }
	    return null;
	}
	
	//----------detail----------//
	@Override
	public Person ShowPerson(Person person) {
		return this.personMapper.getPersonDetail(person);
	}

	@Override
	public List<Event> ShowWhatEventIn(Person person) {
		return this.eventMapper.getWhatEventIn(person);
	}
	
	@Override
	public void PrintOrder(Person person) {
		if (person.getRole().contains("LEADER")) {
			List<Person> getter = this.personMapper.getGETTER(person);
			for (Person p : getter) {
				String message = "Send " + Double.toString(p.getDifference()) + " won to " + p.getPersonName();
				System.out.println(message);
			}
		} else if (person.getRole().contains("SENDER")) {
			String leaderName = this.personMapper.getLEADER(person);
			String message = "Send " + Double.toString(person.getDifference()*(-1)) + "won to the LEADER = " + leaderName;
			System.out.println(message);
		} else {
			String leaderName = this.personMapper.getLEADER(person);
			String message = "Get " + Double.toString(person.getDifference()) + " won from the LEADER = " + leaderName;
			System.out.println(message);
		}
	}
	
}
