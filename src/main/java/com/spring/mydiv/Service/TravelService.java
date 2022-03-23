package com.spring.mydiv.Service;

import java.util.Map;

import com.spring.mydiv.Dto.Travel;

public interface TravelService {

	String CreateTravel(Map<String, Object> map);

	Map<String, Object> detail(Map<String, Object> map);

}
