package com.spring.mydiv.Entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSON")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Person {
	
	// fk�� ���Ͽ� �� ���̺� ��� ������̼� �ʿ��ϴ�. (���� ���)
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id", length = 20)
	private Long Id;
	
	@Column(name = "person_sumSend", nullable = false)
	private Double Sumsend;
	
	@Column(name = "person_sumGet", nullable = false)
	private Double Sumget;
	
	@Column(name = "person_difference", nullable = false)
	private Double Difference;
	
	@Column(name = "person_travelRole", length = 50)
	private String Role;
	
	@Builder
	public Person(Double Sumsend, Double Sumget, Double Difference, String Role) {
		this.Sumsend = Sumsend;
		this.Sumget = Sumget;
		this.Difference = Difference;
		this.Role = Role;
	}
}