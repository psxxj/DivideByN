package com.spring.mydiv.Dto;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Event {

	@NonNull
	private String EventName; //in eventDB
	@NonNull
	private ArrayList<Person> Participant;
	@NonNull
	private Person Payer; //in eventDB
	@NonNull
	private String TravelName;
	@NonNull
	private int Price; //in eventDB
	@NonNull
	private Date EventDate; //in eventDB
	
	private int Event_id;
	private String Participant2String; //in eventDB
	private String PayerName;
	private double DividePrice;
	private double GetPrice;
	
	public Event(String EventName, ArrayList<Person> Participant,
			Person Payer, String TravelName, int Price, Date EventDate) {
		this.setEventName(EventName);
		this.setParticipant(Participant);
		this.setPayer(Payer);
		this.setTravelName(TravelName);
		this.setPrice(Price);
		this.setEventDate(EventDate);
		
		this.setPayerName(Payer.getPersonName());
		this.setDividePrice((double)Price / Participant.size());
		this.setGetPrice(this.DividePrice * (Participant.size()-1));
		for(Person parti : Participant) {
			this.Participant2String += parti.getPersonName() + " " ;
		}
	}

}
