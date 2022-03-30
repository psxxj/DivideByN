package com.spring.mydiv.Dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TravelDao {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int insertName(Map<String, Object> map) {
		return this.sqlSessionTemplate.insert("travel.insertName", map);
	}
	
	public Map<String, Object> select(Map<String, Object> map) {
	    return this.sqlSessionTemplate.selectOne("travel.select", map);
	}

}