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
import com.spring.mydiv.Mapper.EventMapper;
@SpringBootTest
class ESShowTest {
	@Autowired
	EventServiceImpl eventService;
	@Autowired
	EventMapper eventMapper;
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    @Commit
    @DisplayName("detail page") // 얘 수정할 차례
	void testShowEvent() {
		String travelName = "divide";
		Event event_ = this.eventMapper.getEventBriefly(travelName).get(1);
		// 좀 의미없는 과정인데 controller에서 event 받아오는 과정이 있으면 윗부분 삭제
		Event event = this.eventService.ShowEvent(event_);
        System.out.println("EventName = " + event.getEventName());
        System.out.println("payer = " + event.getPayerName());
        System.out.println("participant = " + event.getParticipant2String());
        System.out.println("Price = " + event.getPrice());
        System.out.println("Date = " + event.getEventDate());
        System.out.println("travelname = " + event.getTravelName());		
        
		//fail("Not yet implemented"); // TODO
	}

	@Test
    @Commit
    @DisplayName("create page") // 얘 수정할 차례
	void testShowWhoInTravel() {
		String travelName = "divide";
		List<String> list = this.eventService.ShowWhoInTravel(travelName);
		for(String name :list) {
	        System.out.println("personName = " + name);	
		}
		//fail("Not yet implemented"); // TODO
	}

}
