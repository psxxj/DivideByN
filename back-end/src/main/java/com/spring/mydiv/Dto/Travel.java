package com.spring.mydiv.Dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Travel {
	private int Travel_id;
	@Setter @NonNull
	private String TravelName;
}
