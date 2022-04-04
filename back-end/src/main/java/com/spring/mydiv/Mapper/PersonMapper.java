package com.spring.mydiv.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mydiv.Dto.Person;

@Mapper
public interface PersonMapper {

	//----------create----------//
	public int insertPersonInfo(Person person);
	
	public List<Person> getPersonBriefly(String TravelName);
	
	
	//----------detail----------//
	public Person getPersonDetail(Person person);
	
	//----------at eventService-//
	public int updatePersonMoney(Person person);
	
	public List<Person> getWhoInTravelAll(String TravelName);
	
	public int updatePersonRole(Person person);

}
