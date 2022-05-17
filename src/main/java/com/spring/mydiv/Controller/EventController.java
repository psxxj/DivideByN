package com.spring.mydiv.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mydiv.Dto.Event;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api")
public class EventController {
	
	@PostMapping("/{userid}/{travelid}/createEvent")
	public List<String> getPersonNameByTravelId(@PathVariable int travelid){
		//@PathVariable = 여행 아이디
		//return service. person DB에서 travelid랑 일치하는 사용자 리스트 "이름만" 리턴
	}
	
	@PostMapping("/{userid}/{travelid}/createEvent")
	public void createEvent(@RequestBody Event newevent){
		//RequestBody = 생성할 이벤트 정보
		//return service.
		//	event Db에 event 정보 등록 & participant DB에도 등록
		//	participant DB에서 role & difference 수정
	}
	
	@PostMapping("/{userid}/{travelid}/{eventid}")
	public Event getEventInfoByEventId(@PathVariable int eventid){
		//@PathVariable = 생성한 이벤트 아이디
		//return service. event DB & participant DB에서 정보 리턴
	}

}
