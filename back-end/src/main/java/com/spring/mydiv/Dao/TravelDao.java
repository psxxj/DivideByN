package com.spring.mydiv.Dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mydiv.Dto.Travel;

@Repository
public class TravelDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	//----------create----------//
	public int insertName(Travel travel) {
		return this.sqlSessionTemplate.insert("travel.insertName", travel);
	}
	
	//----------detail----------//
	
	
	
	
	
	// [from user] update name
	public int update(Travel travel) {  
		return this.sqlSessionTemplate.update("travel.update", travel);  
	}

	public Travel select(Travel travel) {
		return this.sqlSessionTemplate.selectOne("travel.select", travel);
	}
	
	
	
}
