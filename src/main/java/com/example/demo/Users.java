package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;

	public Users() {
	}

}
