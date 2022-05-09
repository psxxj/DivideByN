package com.spring.mydiv.Dto;

import java.lang.String;
import java.util.ArrayList;
import java.util.Date;

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
@Table(name = "event")
public class Event {

	@NonNull
	@Column(name = "EventName")
	private String EventName; //in eventDB
	@NonNull
	@Column(name = "Participant")
	private ArrayList<Person> Participant;
	@NonNull
	@Column(name = "Payer")
	private Person Payer; //in eventDB
	@NonNull
	@Column(name = "TravelName")
	private String TravelName;
	@NonNull
	@Column(name = "Price")
	private int Price; //in eventDB
	@NonNull
	@Column(name = "EventDate")
	private Date EventDate; //in eventDB
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Event_id;
	@Column(name = "Participant2String")
	private String Participant2String; //in eventDB
	@Column(name = "PayerName")
	private String PayerName;
	@Column(name = "DividePrice")
	private double DividePrice;
	@Column(name = "GetPrice")
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
