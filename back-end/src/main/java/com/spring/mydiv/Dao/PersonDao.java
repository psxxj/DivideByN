package com.spring.mydiv.Dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mydiv.Dto.Event;
import com.spring.mydiv.Dto.Person;
import com.spring.mydiv.Dto.Travel;

@Repository
public class PersonDao {
		
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//----------create----------//
	public int insert(Person person) {
		return this.sqlSessionTemplate.insert("person.insert", person);
	}
	
	public List<Person> getPersonBriefly(String TravelName){
		List<Person> list = this.sqlSessionTemplate.selectList("person.getPersonBriefly", TravelName);
		return list;
	}
	
	public int updateMoney(Person person) {
		return this.sqlSessionTemplate.update("person.updateSumGet", person);
	}	
	
	public List<Person> getWhoInTravelAll(String TravelName){
		List<Person> list =  this.sqlSessionTemplate.selectList("person.getWhoInTravelAll", TravelName);
		return list;
	}
	
	public int updateRole(Person person) {
		return this.sqlSessionTemplate.update("person.updateRole", person);
	}
	
	//----------detail----------//
	public Person getPersonDetail(Person person) {
		return this.sqlSessionTemplate.selectOne("person.getPersonDetail", person);
	}
	
	public List<Event> getWhatEventIn(Person person) {
		List<Event> list = this.sqlSessionTemplate.selectList("event.getWhatEventIn", person);
		return list;
	}
	
	public List<Person> getGETTER(Person person){
		return this.sqlSessionTemplate.selectList("person.getGETTER", person);
	}
	
	public List<Person> getSENDER(Person person){
		return this.sqlSessionTemplate.selectList("person.getSENDER", person);
	}
	
	public String getLEADER(Person person){
		return this.sqlSessionTemplate.selectOne("person.getLEADER", person);
	}	
	
	
	
	
	
	
	
	public List<String> getWhoInTravelName(String TravelName){
		List<String> list =  this.sqlSessionTemplate.selectList("person.getWhoInTravelName", TravelName);
		return list;
	}
	


	
	
	
	
	

	
	// [from user] update name, account
	public int update(Person person) {
		return this.sqlSessionTemplate.update("person.update", person);
	}
	

	
	
	
	
	

	
}
