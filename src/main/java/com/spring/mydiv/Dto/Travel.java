package com.spring.mydiv.Dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@RequiredArgsConstructor
public class Travel {
	
	@NonNull
	private String TravelName;
	
	private int Travel_id;
}
