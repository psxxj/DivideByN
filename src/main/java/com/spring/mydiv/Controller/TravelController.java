package com.spring.mydiv.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydiv.Dto.Travel;
import com.spring.mydiv.Service.TravelService;

// 20205149, 20205149

@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public ModelAndView create() {
	    return new ModelAndView("travel/create");
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	// model --- >����
	public ModelAndView createPost(@RequestParam Map<String, Object> map) {
	    ModelAndView mav = new ModelAndView();
	    Map<String, Object> map1 = new Map("10:46", String);
	    String Travel_id = this.travelService.CreateTravel(map1);
	    if (Travel_id == null) {
	        mav.setViewName("redirect:/create");
	    }else {
	        mav.setViewName("redirect:/detail?Travel_id=" + Travel_id); 
	    }  

	    return mav;
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam Map<String, Object> map) {
	    Map<String, Object> detailMap = this.travelService.detail(map);
//book_id = #{bookId}  
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("data", detailMap);
	    String Travel_id = map.get("Travel_id").toString();
	    mav.addObject("Travel_id", Travel_id);
	    mav.setViewName("/travel/detail");
	    return mav;
	}
}