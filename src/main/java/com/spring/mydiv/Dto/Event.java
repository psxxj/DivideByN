package com.spring.mydiv.Dto;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class Event {
	
	@NonNull
	private String EventName; //in eventDB
	@NonNull
	private ArrayList<Person> Participant;
	@NonNull
	private Person Payer; //in eventDB
	@NonNull
	private Date EventDate; //in eventDB
	@NonNull
	private int Price; //in eventDB
	@NonNull
	private String TravelName;
	
	private String Participant2String; //in eventDB
	@Setter
	private double DividePrice;
	@Setter
	private double GetPrice;
	
	public void SetInfo() {
		this.setDividePrice((double)this.Price / this.Participant.size());
		this.setGetPrice(this.DividePrice * (this.Participant.size()-1));
		for(Person parti : Participant) {
			Participant2String = String.join(Participant2String, " ", parti.getPersonName());
		}
	}

}