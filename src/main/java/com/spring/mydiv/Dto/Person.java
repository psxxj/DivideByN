package com.spring.mydiv.Dto;

import java.util.ArrayList;

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
@Table(name = "person")
public class Person {
	@NonNull
	@Column(name = "PersonName")
	private String PersonName; //in personDB
	@NonNull
	@Column(name = "Account")
	private String Account; //in personDB
	@NonNull
	@Column(name = "TravelName")
	private String TravelName; //in personDB
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Person_id;
	@Column(name = "sumSend")
	private double sumSend;
	@Column(name = "sumGet")
	private double sumGet;
	@Column(name = "Difference")
	private double Difference;	
	@Column(name = "getterALL")
	private ArrayList<Person> getterALL = new ArrayList<>();
	@Column(name = "willSend")
	private ArrayList<Event> willSend = new ArrayList<>();
	@Column(name = "willGet")
	private ArrayList<Event> willGet = new ArrayList<>();
	@Column(name = "Role")
	private String Role;
}
