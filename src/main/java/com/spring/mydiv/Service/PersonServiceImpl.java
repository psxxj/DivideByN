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
	//@Override
	public List<Person> CreatePerson(Person person) { //fin
		int affectRowCount = this.personMapper.insertPersonInfo(person);
	    if (affectRowCount ==  1) { // 1 = success
	    	String travelName = person.getTravelName();
	    	return this.personMapper.getPersonBriefly(travelName);
	    }
	    return null;
	}
	
	//----------detail----------//
	public Person ShowPerson(Person person) {
		return this.personMapper.getPersonDetail(person);
	}

	public List<Event> ShowWhatEventIn(Person person) {
		return this.eventMapper.getWhatEventIn(person);
	}
	
	public void PrintOrder(Person person) {
		if (person.getRole() == "LEADER") {
			List<Person> getter = this.personMapper.getGETTER(person);
			for (Person p : getter) {
				String message = String.join("Send ", Double.toString(p.getDifference()),"won to ", p.getPersonName());
				System.out.print(message);
			}
		} else if (person.getRole() == "SENDER") {
			String leaderName = this.personMapper.getLEADER(person);
			String message = String.join("Send ", Double.toString(person.getDifference()),"won to the LEADER, ", leaderName);
			System.out.print(message);
		} else {
			String leaderName = this.personMapper.getLEADER(person);
			String message = String.join("Get ", Double.toString(person.getDifference()),"won from the LEADER, ", leaderName);
			System.out.print(message);
		}
	}
	
}
