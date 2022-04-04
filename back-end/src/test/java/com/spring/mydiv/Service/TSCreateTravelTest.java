package com.spring.mydiv.Service;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Travel;

@SpringBootTest
class TSCreateTravelTest {

	@Autowired
	TravelServiceImpl travelService;
	
	@Test
    @Commit
    @DisplayName("CreateTravel")
	void testCreateTravel() {
		Travel travel = new Travel("eecs");
		String insertName = travelService.CreateTravel(travel);
        System.out.print("name = " + insertName);
		//fail("Not yet implemented");
	}

}
