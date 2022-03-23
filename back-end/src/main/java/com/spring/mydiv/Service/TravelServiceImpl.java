package com.spring.mydiv.Service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mydiv.Dao.TravelDao;
import com.spring.mydiv.Dto.Travel;

@Service
public class TravelServiceImpl implements TravelService {

	@Autowired
	private TravelDao travelDao;
	
	//----------create----------//
	@Override
	public String CreateTravel(Map<String, Object> map) {
		int affectRowCount = this.travelDao.insertName(map);
	    if (affectRowCount ==  1) { // 1 = success
	    	return map.get("Travel_id").toString();
	    }
	    return null;
	}
	
	@Override
	public Map<String, Object> detail(Map<String, Object> map){
	    return this.travelDao.select(map);
	}
}