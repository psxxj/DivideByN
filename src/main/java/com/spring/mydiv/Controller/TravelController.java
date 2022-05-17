package com.spring.mydiv.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.debug.Event;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api")
public class TravelController {
	
	@GetMapping("/{userid}/{travelid}")
	public List<Person> getPersonBrieflyByTravelId(@PathVariable int travelid){
		//@PathVariable = 여행 아이디
		//return service. person DB에서 travelid랑 일치하는 사용자 리스트 "이름만" 리턴
	}
	
	@GetMapping("/{userid}/{travelid}")
	public List<Event> getEventBrieflyNameByTravelId(@PathVariable int travelid){
		//@PathVariable = 여행 아이디
		//return service. event DB에서 travelid랑 일치하는 이벤트 리스트 리턴
	}
	
	@GetMapping("/{userid}/{travelid}")
	public int getEventNumByTravelId(@PathVariable int travelid){
		//@PathVariable = 여행 아이디
		//return service. event DB에서 travelid랑 일치하는 이벤트 개수 세서 리턴
	}
	
	@GetMapping("/{userid}/{travelid}")
	public String getPersonNameByTravelId(@PathVariable int travelid){
		//@PathVariable = 여행 아이디
		//return service. event DB에서 travelid랑 일치하는 이벤트 기간 계산해서 리턴
	}

}
