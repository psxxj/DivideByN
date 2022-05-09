package com.spring.mydiv.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mydiv.Dto.Travel;

//TravelRepository
@Mapper
public interface TravelMapper {
	
	public int insertTravelName(Travel travel);

}
