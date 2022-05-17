package com.spring.mydiv.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mydiv.Dto.Travel;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
//@RequestMapping("/")
public class UserController {
	
	@PostMapping("/enroll")
	public void createUser(@RequestBody User newuser){
		//@RequestBody = 회원가입 정보
		//service. user DB에 사용자 등록
		//JPA save 함수는 리턴값이 없는듯
	}
	
	/* 로그인은 나중에 ...!
	@PostMapping("/login")
	public void login(@RequestBody User newuser){
		//로그인 정보 받아 → 로그인 됐는지 확인 → 로그인 여부 리턴
	}
	*/
	
	@PostMapping("/{no}")
	public User getUserInfoByNo(@PathVariable int no){
		//@PathVariable = 로그인한 유저 아이디
		//return service. user DB에서 개인정보 리턴(계좌 등)
	}
	@PostMapping("/{no}")
	public List<Travel> getTravelUserJoinedByNo(@PathVariable int no){
		//@PathVariable = 로그인한 유저 아이디
		//return userservice. person DB에서 user id 있는 모든 여행리스트 리턴
	}
	
	@PostMapping("/{no}/enjoytravel")
	public void createTravel(@PathVariable int no, @RequestBody Travel travel){
		//@PathVariable = 로그인한 유저 아이디
		//@RequestBody = 생성할 여행 정보
		//return userservice. travel DB에 여행 생성 & person DB에 (user-travel)추가
		//JPA save 함수는 리턴값이 없는듯
	}

}

