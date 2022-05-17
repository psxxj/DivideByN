package com.spring.mydiv.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mydiv.Dto.Event;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/api")
public class PersonController {
	
	@PostMapping("/{userid}/{travelid}/invitePerson")
	public void createPerson2Travel(String email){
		//email: 초대할 사람 이메일 -> 아이디로 바꿔도 됨
		//return service. user DB에서 이메일 일치하는 사람 있으면 -> person DB에 추가
	}
	
	@PostMapping("/{userid}/{travelid}/{personid}")
	public User getPersonInfoByPersonId(@PathVariable int personid){
		//@PathVariable = 초대된 사람 아이디
		//return service. person DB에서 personid랑 일치하는 사용자의 userid 찾기 -> userdb에서 userid일치하는 사용자 정보 리턴
	}
	
	@PostMapping("/{userid}/{travelid}/{personid}")
	public List<Event> getJoinEventListByPersonId(@PathVariable int personid){
		//@PathVariable = 초대된 사람 아이디
		//return service. participant DB에서 personid랑 일치하는 사용자가 참여한 이벤트 리스트 리턴
	}
	
	@PostMapping("/{userid}/{travelid}/{personid}")
	public String getPersonOrderByPersonId(@PathVariable int personid){
		//@PathVariable = 초대된 사람 아이디
		//return service. person DB에서 personid를 통해 role 얻고, 관련된 업무(돈 주고받기) 리턴
	}

}
