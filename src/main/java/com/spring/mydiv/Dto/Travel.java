package com.spring.mydiv.Dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Travel {
	// 생성자만 만들기 -> required어쩌구 삭제
	private int Travel_id;
	@Setter @NonNull
	private String TravelName; //in travelDB

}