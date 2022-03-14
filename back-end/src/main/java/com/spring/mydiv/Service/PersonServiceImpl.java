package com.spring.mydiv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dao.PersonDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	@Override
	public List<Person> CreatePerson(Person person) {
		int affectRowCount = this.personDao.insert(person);
	    if (affectRowCount ==  1) { // 1 = success
	    	String travelName = person.getTravelName();
	    	return this.personDao.getPersonBriefly(travelName);
	    }
	    return null; // ??
	}
	
	
	@Override
	public void UpdatePerson(Person person) {
		personDao.update(person);
	}
	
	@Override
	public void get_difference(Person person) {
		get_sumSend(person); //
		get_sumGet(person); //
		person.setDifference(person.getSumGet() - person.getSumSend());
		if (person.getDifference() >= 0) {person.setRole("GETTER");}
		else {person.setRole("SENDER");};
		UpdatePerson(person);
	}

	public void get_sumSend(Person person) {
		person.setSumSend(0);
		for(Event event : person.getWillSend()) {
			person.setSumSend( person.getSumSend() + event.getDividePrice() );
		}
		UpdatePerson(person);
	}
	
	public void get_sumGet(Person person) {
		person.setSumGet(0);
		for(Event event : person.getWillGet()) {
			person.setSumGet(person.getSumGet() + event.getPrice());
		}
		UpdatePerson(person);
	}
	
	public Person ShowPerson(Person person) {
		String personName = person.getPersonName();
		return this.personDao.getPersonDetail(person);
	}
	
	public List<Event> ShowWhatEventIn(Person person) {
		return this.personDao.getWhatEventIn(person);
	}
	
	public Person ShowPerson(Person person) {
		return this.personDao.getWhatEventIn(person);
	}
	
	public String PrintOrder(Person person) {
		
	}

}
