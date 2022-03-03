package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Service.TravelService;

@Controller
public class TravelController {
	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/")
	public ModelAndView personCreate(@ModelAttribute("travel") Travel travel) {
		
		travelService.CreateTravel(travel);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/"); // �������� ���ư���
		mv.addObject("main", "���� ȭ�鸦 ��Ÿ���µ� �ʿ��� ��� ������"); 
		return mv;
		
	}
}
