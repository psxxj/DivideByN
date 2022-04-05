package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Mapper.EventMapper;
import com.spring.mydiv.Mapper.PersonMapper;
@SpringBootTest
class ESdetailTest {
	@Autowired
	PersonServiceImpl personService;
	@Autowired
	PersonMapper personMapper;
	
	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
    @Commit
    @DisplayName("ShowPerson") // 얘 수정할 차례
	void testShowPerson() {
		System.out.println("=======testShowPerson=======");
		
		String travelName = "divide";
		Person person_ = this.personMapper.getPersonBriefly(travelName).get(1);
		// controller에서 person 정보 받아오는 부분 대체
		
		Person person = this.personService.ShowPerson(person_);
        System.out.println("PersonName = " + person.getPersonName());
        System.out.println("Account = " + person.getAccount());
        System.out.println("Difference = " + person.getDifference());
        System.out.println("Role = " + person.getRole());
        System.out.println("travelname = " + person.getTravelName());
        
		//fail("Not yet implemented"); // TODO
	}

	@Test
    @Commit
    @DisplayName("ShowWhatEventIn") // 얘 수정할 차례
	void testShowWhatEventIn() {
		System.out.println("=======testShowWhatEventIn=======");
		
		String travelName = "divide";
		Person person = this.personMapper.getPersonBriefly(travelName).get(1);
		// controller에서 person 정보 받아오는 부분 대체
		
		List<Event> list = this.personService.ShowWhatEventIn(person);
		for(Event e :list) {
	        System.out.print("EventName = " + e.getEventName());
	        System.out.print(", payer = " + e.getPayerName());
	        System.out.print(", participant = " + e.getParticipant2String());
	        System.out.print(", Price = " + e.getPrice());
	        System.out.print(", Date = " + e.getEventDate());
	        System.out.println();
	        //System.out.println("travelname = " + e.getTravelName());			
		}
		//fail("Not yet implemented"); // TODO
	}
*/
	@Test
    @Commit
    @DisplayName("PrintOrder") // 얘 수정할 차례
	void testPrintOrder() {
		System.out.println("=======PrintOrder=======");
		
		String travelName = "divide";
		Person person_ = this.personMapper.getPersonBriefly(travelName).get(2);
		// controller에서 person 정보 받아오는 부분 대체
		// System.out.println(person_.getRole());
		this.personService.PrintOrder(person_);
		//fail("Not yet implemented"); // TODO
	}

}
