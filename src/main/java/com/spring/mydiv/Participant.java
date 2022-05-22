package com.spring.mydiv.Entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PARTICIPANT")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Participant {
	
	// fk�� ���Ͽ� �� ���̺� ��� ������̼� �ʿ��ϴ�. (���� ���)
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "participant_id", length = 20)
	private Long Id;
	
	@Column(name = "person_id", length = 20)
	private Long Person_Id;
	
	@Column(name = "event_id", length = 20)
	private Long Event_Id;
	
	@Column(name = "participant_eventRole", length = 1)
	private int EventRole;
	
	@Builder
	public Participant(Long Person_Id, Long Event_Id, int EventRole) {
		this.Person_Id = Person_Id;
		this.Event_Id = Event_Id;
		this.EventRole = EventRole;
	}
}