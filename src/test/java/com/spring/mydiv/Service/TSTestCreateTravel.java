package com.spring.mydiv.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Travel;

@SpringBootTest
class TSTestCreateTravel {

	@Autowired
	TravelServiceImpl travelService;
	
	@Test
    @Commit
    @DisplayName("travel생성")
	void testCreateTravel() {
		Travel travel = new Travel("18:21");
		String insertName = travelService.CreateTravel(travel);
        System.out.print("name = " + insertName);
		//fail("Not yet implemented");
	}

}
