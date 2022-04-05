package com.spring.mydiv.Dto;

import java.util.ArrayList;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Person {
	@NonNull
	private String PersonName; //in personDB
	@NonNull
	private String Account; //in personDB
	@NonNull
	private String TravelName; //in personDB
	
	private int Person_id;
	private double sumSend;
	private double sumGet;
	private double Difference;	
	private ArrayList<Person> getterALL = new ArrayList<>();
	private ArrayList<Event> willSend = new ArrayList<>();
	private ArrayList<Event> willGet = new ArrayList<>();
	private String Role;
}
