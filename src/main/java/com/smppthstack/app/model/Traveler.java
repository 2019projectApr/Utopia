package com.smppthstack.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Traveler {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer travelerId;
	
	@Column
	private String passportNum;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private Date DateOfBirth;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String phone;
	
	private String email;
	

	public Integer getTravelerId() {
		return travelerId;
	}

	public void setTravelerId(Integer travelerId) {
		this.travelerId = travelerId;
	}

	public String getPassportNum() {
		return passportNum;
	}

	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
