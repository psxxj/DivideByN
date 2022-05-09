package com.spring.mydiv.Dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mydiv.Dto.Travel;

@Repository
public class TravelDao {
	
	public Travel select(int num) {
		Travel Traveltest = new Travel("�ҷ�����");
		return Traveltest;
	}
	
	// insert �� ������Ʈ���� db�̸� �ʿ� ���� ??
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	// [from user] insert name
	public int insert(Travel travel) {
		return this.sqlSessionTemplate.insert("travel.insert", travel);
	} 
	// [from user] update name
	public int update(Travel travel) {  
		return this.sqlSessionTemplate.update("travel.update", travel);  
	}
	
	
	
	public Travel select(Travel travel) {
		return this.sqlSessionTemplate.selectOne("travel.select", travel);
	}
	
	
	
}