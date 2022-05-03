package com.spring.mydiv.Board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired
	BoardMapper boardMapper;
	
	
	public List<Board> getAllBoard() {
		return this.boardMapper.findAll();
	}

}
