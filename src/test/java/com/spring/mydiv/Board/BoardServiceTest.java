package com.spring.mydiv.Board;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.spring.mydiv.Dto.Person;


@SpringBootTest
class BoardServiceTest {

	@Autowired
	BoardService boardService;

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@Commit
    @DisplayName("findALl")
	void testGetAllBoard() {
		List<Board> tmp = boardService.getAllBoard();
		for(Board b:tmp) {
	        System.out.println("id = " + b.getTravel_id() + ", name = " + b.getTravelName());			
		}
	}
	

}
