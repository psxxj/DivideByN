package com.spring.mydiv.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dao.EventDao;
import com.spring.mydiv.Dao.PersonDao;
import com.spring.mydiv.Dao.TravelDao;
import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;

@Service
public class TravelServiceImpl implements TravelService {
	
	@Autowired
	private TravelDao travelDao;
	@Autowired
	private PersonDao personDao;
	@Autowired
	private PersonService personService;
	
	//----------create----------//
	@Override
	public String CreateTravel(Travel travel) {
		int affectRowCount = this.travelDao.insertName(travel);
	    if (affectRowCount ==  1) { // 1 = success
	    	return travel.getTravelName();
	    }
	    return null;
	}
	
	// at EventService_CreateEvent
	@Override
	public void SetRole(String travelName) {
		double max_difference = 0;
		Person Leader = null;
		
		List<Person> personALL = this.personDao.getWhoInTravelAll(travelName);
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
			this.personService.UpdateRole(person);
		}
	}

	//----------detail----------//

	
	

	
}
