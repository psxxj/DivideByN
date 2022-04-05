package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Mapper.PersonMapper;
@SpringBootTest
class ESCreateEventTest {
	@Autowired
	EventServiceImpl eventService;
	@Autowired
	PersonMapper personMapper;
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    @Commit
    @DisplayName("CreateEvent") // 얘 수정할 차례
	void testCreateEvent() {
		//Person p1 = new Person("p", "18:15", "divide");
		//Person p2 = new Person("k", "18:16", "divide");
		//Person p3 = new Person("h", "18:17", "divide");
		//Person p4 = new Person("l", "18:18", "divide");
		
		List<Person> personALL = this.personMapper.getWhoInTravelAll("divide");
		ArrayList<Person> plist = new ArrayList<Person>(personALL);
		Date date = new Date();
		int price = 50000;
		Event event = new Event("lunch", plist, plist.get(1), "divide", price, date);
		List<Event> list = eventService.CreateEvent(event);
		System.out.println("Create success");
		for(Event e :list) {
	        System.out.println("EventName = " + e.getEventName());
	        System.out.println("payer = " + e.getPayerName());
	        System.out.println("participant = " + e.getParticipant2String());
	        System.out.println("Price = " + e.getPrice());
	        System.out.println("Date = " + e.getEventDate());
	        //System.out.println("travelname = " + e.getTravelName());			
		}
		//fail("Not yet implemented"); // TODO
	}

}
