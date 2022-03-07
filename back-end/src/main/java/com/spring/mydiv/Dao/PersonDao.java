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
	
	// [from user] insert name, account
	public int insert(Person person) {
		return this.sqlSessionTemplate.insert("person.insert", person);
	}
	// [from user] update name, account
	public int update(Person person) {
		return this.sqlSessionTemplate.update("person.update", person);
	}
	
	// [to event_creating] name (who participated in travel)
	public List<String> getWhoInTravel(Travel travel){
		List<String> list =  this.sqlSessionTemplate.selectList("person.getWhoInTravel", travel);
		return list;
	}
	// [to main_person] name, role, difference
	public List<Person> getPersonBriefly(Travel travel){
		List<Person> list = this.sqlSessionTemplate.selectList("person.getPersonBriefly", travel);
		return list;
	}
	// [to person_detail] all
	public Person getPersonDetail(Person person) {
		return this.sqlSessionTemplate.selectOne("person.getPersonDetail", person);
	}

	// [to person] <event_SQL> all (that the person participated in)
	public List<Event> getWhatEventIn(Person person) {
		List<Event> list = this.sqlSessionTemplate.selectList("event.getWhatEventIn", person);
		return list;
	}
	
	
}
