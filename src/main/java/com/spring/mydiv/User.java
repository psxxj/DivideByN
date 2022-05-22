package com.spring.mydiv.Entity;

import javax.persistence.*;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "USER")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id", length = 20)
	private Long Id;
	
	@Column(name = "user_name", length = 50, nullable = false)
	private String Name;
	
	@Column(name = "user_email", length = 100, nullable = false, unique = true)
	private String Email;
	
	@Column(name = "user_password", length = 200, nullable = false)
	private String Password;
	
	@Column(name = "user_account", length = 20, nullable = false)
	private String Account;
	
	@Builder
	public User(String Name, String Email, String Password, String Account) {
		this.Name = Name;
		this.Email = Email;
		this.Password = Password;
		this.Account = Account;
	}
}