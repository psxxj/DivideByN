package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Mapper.EventMapper;
@SpringBootTest
class ESgetEventNumTest {
	@Autowired
	EventServiceImpl eventService;
	@Autowired
	EventMapper eventMapper;
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    @Commit
    @DisplayName("getEventNum") // 얘 수정할 차례
	void testGetEventNum() {
		String travelName = "divide";
		Event event = this.eventMapper.getEventBriefly(travelName).get(1);
		long eventnum = eventService.getEventNum(event);
		System.out.println(travelName+" #(event) = " + eventnum);
		//fail("Not yet implemented"); // TODO
	}

}
