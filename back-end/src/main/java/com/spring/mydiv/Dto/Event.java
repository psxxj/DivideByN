package com.spring.mydiv.Dto;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Event {
	
	@Getter @Setter
	private String EventName; //in eventDB
	private ArrayList<Person> Participant = new ArrayList<>();
	private String Participant2String; //in eventDB
	private Person Payer; //in eventDB
	private Date EventDate = new Date(); //in eventDB
	private int Price; //in eventDB
	private double DividePrice;
	private String TravelName;
	
	public Event(String eventname, ArrayList<Person> participant, Person payer, Date eventdate, int price, String travelName){ // »ý¼ºÀÚ
		this.EventName = eventname;
		this.Participant = participant;
		this.setParticipant2String();
		this.Payer = payer;
		this.EventDate = eventdate;
		this.Price = price;
		this.setDividePrice((double)this.Price / this.Participant.size());
		this.TravelName = travelName;
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
	
	public String getTravelName() {
		return TravelName;
	}

	public void setDividePrice(double dividePrice) {
		DividePrice = dividePrice;
	}
	
	public void setParticipant2String() {
		for(Person parti : Participant) {
			Participant2String = String.join(Participant2String, " ", parti.getPersonName());
		}
	}
	
}
