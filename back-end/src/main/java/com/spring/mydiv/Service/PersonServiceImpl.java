package com.spring.mydiv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Mapper.PersonMapper;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	PersonMapper personMapper;
	
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
	public Person ShowPerson(Person person) { //ing
		return this.personMapper.getPersonDetail(person);
	}
	
	//public List<Event> ShowWhatEventIn(Person person)
	
	//public void PrintOrder(Person person)
	
}
