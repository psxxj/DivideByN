package com.spring.mydiv.Service;

import java.util.List;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

public interface PersonService {
	List<Person> CreatePerson(Person person);
	boolean get_difference(Event event, Person person);
	boolean UpdateRole(Person person);
	Person ShowPerson(Person person);
	List<Event> ShowWhatEventIn(Person person);
	void PrintOrder(Person person);
	void get_sumSend(Person person);
	void get_sumGet(Person person);

}
