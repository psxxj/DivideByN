package com.spring.mydiv.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;

//PersonRepository
@Mapper
public interface PersonMapper {

	//----------create----------//
	public int insertPersonInfo(Person person);
	
	public List<Person> getPersonBriefly(String TravelName);
	
	
	//----------detail----------//
	public Person getPersonDetail(Person person);
	
	public List<Person> getGETTER(Person person);
	
	public List<Person> getSENDER(Person person);
	
	public String getLEADER(Person person);
	
	
	//----------at eventService-//
	public int updatePersonMoney(Person person);
	
	public int updatePersonRole(Person person);
	
	public List<String> getWhoInTravelName(String TravelName);

	//----------at travelService//
	public List<Person> getWhoInTravelAll(String TravelName);


}
