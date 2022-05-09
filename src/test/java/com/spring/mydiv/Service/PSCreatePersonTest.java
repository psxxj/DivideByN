package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;
@SpringBootTest
class PSCreatePersonTest {

	@Autowired
	PersonServiceImpl personService;
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    @Commit
    @DisplayName("person생성")
	void testCreatePerson() {
		Person person = new Person("l", "18:18", "divide");
		List<Person> list = personService.CreatePerson(person);
		for(Person p:list) {
	        System.out.println("name = " + p.getPersonName() + ", account = " + p.getAccount() + ", travelname = " + p.getTravelName());			
		}
		//fail("Not yet implemented"); // TODO
	}

}
