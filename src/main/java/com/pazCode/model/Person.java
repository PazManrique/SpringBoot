package com.pazCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person {
	//atributos
	
	@Id
	private int code;
	@Column (name = "PER_NAME", length = 50)
	private String name;
	
	
	//accesors
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	//Constructors
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}



	
}
