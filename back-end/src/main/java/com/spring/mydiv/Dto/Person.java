package com.spring.mydiv.Dto;

import java.util.ArrayList;

public class Person {
	
	private String PersonName; //in personDB
	private String Account; //in personDB
	private String TravelName; //in personDB
	private double sumSend;
	private double sumGet;
	private double Difference;	
	
	
	private ArrayList<Person> getterALL = new ArrayList<>();
	private ArrayList<Event> willSend = new ArrayList<>();
	private ArrayList<Event> willGet = new ArrayList<>();
	private String Role;


	//----------------//
	
	
	public Person(String personName, String account, String travelName){
		this.setPersonName(personName);
		this.setAccount(account);
		this.setTravelName(travelName);
	}

	public String getPersonName() {
		return PersonName;
	}

	public void setPersonName(String personName) {
		this.PersonName = personName;
	}

	public String getAccount() {
		return Account;
	}

	public void setAccount(String account) {
		this.Account = account;
	}

	public String getTravelName() {
		return TravelName;
	}

	public void setTravelName(String travelName) {
		this.TravelName = travelName;
	}
	
	public double getSumSend() {
		return sumSend;
	}

	public void setSumSend(double sumSend) {
		this.sumSend = sumSend;
	}

	public double getSumGet() {
		return sumGet;
	}

	public void setSumGet(double sumGet) {
		this.sumGet = sumGet;
	}

	public double getDifference() {
		return Difference;
	}

	public void setDifference(double difference) {
		this.Difference = difference;
	}
	
	
	
	
	
	
	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public ArrayList<Person> getGetterALL() {
		return getterALL;
	}

	public void setGetterALL(ArrayList<Person> getterALL) {
		this.getterALL = getterALL;
	}

	public ArrayList<Event> getWillSend() {
		return willSend;
	}

	public void setWillSend(ArrayList<Event> willSend) {
		this.willSend = willSend;
	}

	public ArrayList<Event> getWillGet() {
		return willGet;
	}

	public void setWillGet(ArrayList<Event> willGet) {
		this.willGet = willGet;
	}



}
	