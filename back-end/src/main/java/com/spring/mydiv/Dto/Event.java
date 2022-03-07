package com.spring.mydiv.Dto;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Event {
	
	@Getter @Setter
	private String EventName; //in eventDB
	private ArrayList<Person> Participant = new ArrayList<>(); //in eventDB
	private String Participant2String;
	private Person Payer; //in eventDB
	private Date EventDate = new Date(); //in eventDB
	private int Price; //in eventDB
	private double DividePrice;
	
	public Event(String eventname, ArrayList<Person> participant, Person payer, Date eventdate, int price){ // »ý¼ºÀÚ
		this.EventName = eventname;
		this.Participant = participant;
		this.Payer = payer;
		this.EventDate = eventdate;
		this.Price = price;
		this.setDividePrice((double)this.Price / this.Participant.size());
	}

	public Person getPayer() {
		return Payer;
	}
	
	public ArrayList<Person> getParticipant() {
		return Participant;
	}
	
	public int getPrice() {
		return Price;
	}
	public double getDividePrice() {
		return DividePrice;
	}

	public void setDividePrice(double dividePrice) {
		DividePrice = dividePrice;
	}
	
	public void setParticipant2String() {
		Participant2String = String.join(", ", Participant.getPersonName());
	}
}
