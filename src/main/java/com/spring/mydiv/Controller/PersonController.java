package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Service.PersonService;
import com.spring.mydiv.Service.TravelService;

public class PersonController {
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/CreateUser")
	public ModelAndView personCreate(@ModelAttribute("person") Person person) {
		
		personService.CreatePerson(person);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/"); // �������� ���ư���
		mv.addObject("main", "���� ȭ�鸦 ��Ÿ���µ� �ʿ��� ��� ������"); //��� ���� �ʿ�
		return mv;
		
	}
	
}