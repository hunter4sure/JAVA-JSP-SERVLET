package com.bac.awd.model;

import java.io.Serializable;


public class Graduate implements Serializable {

	
	private String email;
	private String firstName;
	private String gender;
	private String dob;
	private String password;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public Graduate() {
		
	}

	public Graduate(String email, String firstName, String gender, String dob, String password) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.gender = gender;
		this.dob = dob;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
