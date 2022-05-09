package com.spring.mydiv.Service;

import java.util.List;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

public interface PersonService {
	
	List<Person> CreatePerson(Person person);
	
	Person ShowPerson(Person person);
	public List<Event> ShowWhatEventIn(Person person);
	public void PrintOrder(Person person);

}
