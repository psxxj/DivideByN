package com.spring.mydiv.Entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TRAVEL")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Travel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "travel_id", length = 20)
	private Long Id;
	
	@Column(name = "travel_name", length = 200, nullable = false)
	private String Name;
	
	@Column(name = "travel_image")
	private String Image;
	
	@Builder
	public Travel(String Name, String Image) {
		this.Name = Name;
		this.Image = Image;
	}
}
