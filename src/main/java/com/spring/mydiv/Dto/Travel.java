package com.spring.mydiv.Dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "travel")
public class Travel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Travel_id;
	
	@NonNull
	@Column(name = "TravelName")
	private String TravelName;
}
