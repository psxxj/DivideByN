package com.spring.mydiv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Service.TravelService;

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@GetMapping(value = "/create")
	public ModelAndView create() {
	    return new ModelAndView("travel/create");
	}

}