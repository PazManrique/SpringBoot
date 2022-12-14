package com.pazCode.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
	
	
		//atributos
		
		@Id
		private int code;
		@Column (name = "pasword", length = 50)
		private String password;
		@Column (name = "name", length = 50)
		private String name;
		
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}


		public User(int code, String password, String name) {
			super();
			this.code = code;
			this.password = password;
			this.name = name;
		}


		public int getCode() {
			return code;
		}


		public void setCode(int code) {
			this.code = code;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}
		
		
		
}




