package com.bac.awd.model;

import java.io.Serializable;

public class Company  implements Serializable{

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	private String companyName;
	private String status;
	private String bio;
	private String email;
	private String password;
	
	
	
	public Company(String companyName, String status, String bio, String email, String password) {
		super();
		this.companyName = companyName;
		this.status = status;
		this.bio = bio;
		this.email = email;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Company(String companyName, String status, String bio, String email) {
		super();
		this.companyName = companyName;
		this.status = status;
		this.bio = bio;
		this.email = email;
	}
	
	
	

}
