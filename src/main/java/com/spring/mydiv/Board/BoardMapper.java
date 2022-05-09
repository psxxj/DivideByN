package com.spring.mydiv.Board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

// BoardRepository
@Mapper
public interface BoardMapper {
	public List<Board> findAll();
}
