package com.spring.mydiv.Service;

import java.util.List;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

public interface PersonService {

	List<Person> CreatePerson(Person person);

	boolean get_difference(Event event, Person person);

	boolean UpdateRole(Person person);

}
