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
	
	//----------create----------//
	@Override
	public List<Person> CreatePerson(Person person) {
		int affectRowCount = this.personDao.insert(person);
	    if (affectRowCount ==  1) { // 1 = success
	    	String travelName = person.getTravelName();
	    	return this.personDao.getPersonBriefly(travelName);
	    }
	    return null;
	}
	
	// at EventService_CreateEvent
	@Override
	public boolean get_difference(Event event, Person person) {
		if (person.getPersonName() == event.getPayer().getPersonName()){
			person.setSumGet(person.getSumGet() + event.getGetPrice());			
		} else {
			person.setSumSend(person.getSumSend() + event.getDividePrice());
		}
		person.setDifference(person.getSumGet() - person.getSumSend());
		int affectRowCount = this.personDao.updateMoney(person);
		return affectRowCount == 1;
	}
	
	// at TravelService_SetRole
	@Override
	public boolean UpdateRole(Person person) {
		int affectRowCount = this.personDao.updateRole(person);
		return affectRowCount == 1;
	}
	
	//----------for detail page----------//
	@Override
	public Person ShowPerson(Person person) {
		return this.personDao.getPersonDetail(person);
	}
	
	@Override
	public List<Event> ShowWhatEventIn(Person person) {
		return this.personDao.getWhatEventIn(person);
	}
	
	@Override
	public void PrintOrder(Person person) {
		if (person.getRole() == "LEADER") {
			List<Person> getter = this.personDao.getGETTER(person);
			for (Person p : getter) {
				String message = String.join("Send ", Double.toString(p.getDifference()),"won to ", p.getPersonName());
				System.out.print(message);
			}
		} else if (person.getRole() == "SENDER") {
			String leaderName = this.personDao.getLEADER(person);
			String message = String.join("Send ", Double.toString(person.getDifference()),"won to the LEADER, ", leaderName);
			System.out.print(message);
		} else {
			String leaderName = this.personDao.getLEADER(person);
			String message = String.join("Get ", Double.toString(person.getDifference()),"won from the LEADER, ", leaderName);
			System.out.print(message);
		}
	}
	
	@Override
	public void get_sumSend(Person person) {
		person.setSumSend(0);
		for(Event event : person.getWillSend()) {
			person.setSumSend( person.getSumSend() + event.getDividePrice() );
		}
		UpdateRole(person);
	}
	
	@Override
	public void get_sumGet(Person person) {
		person.setSumGet(0);
		for(Event event : person.getWillGet()) {
			person.setSumGet(person.getSumGet() + event.getPrice());
		}
		UpdateRole(person);
	}
}