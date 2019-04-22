package com.smppthstack.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity( name = "order_ticket")
public class OrderTicket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	@ManyToOne
	@JoinColumn(name = "planeId" )
	private Ticket ticket;
	
	@Column
	private String passFirstName;
	
	@Column
	private String passLastName;
	
	@Column
	private Date passDateOfBirth;
	
	@Column
	private String passGenger;
	
	@Column
	private String passPhone;
	
	@Column
	private String passEmail;
	
	@Column
	private String passPassportNum;
	
	@Column
	private Boolean checkInStatus;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getPassFirstName() {
		return passFirstName;
	}

	public void setPassFirstName(String passFirstName) {
		this.passFirstName = passFirstName;
	}

	public String getPassLastName() {
		return passLastName;
	}

	public void setPassLastName(String passLastName) {
		this.passLastName = passLastName;
	}

	public Date getPassDateOfBirth() {
		return passDateOfBirth;
	}

	public void setPassDateOfBirth(Date passDateOfBirth) {
		this.passDateOfBirth = passDateOfBirth;
	}

	public String getPassGenger() {
		return passGenger;
	}

	public void setPassGenger(String passGenger) {
		this.passGenger = passGenger;
	}

	public String getPassPhone() {
		return passPhone;
	}

	public void setPassPhone(String passPhone) {
		this.passPhone = passPhone;
	}

	public String getPassEmail() {
		return passEmail;
	}

	public void setPassEmail(String passEmail) {
		this.passEmail = passEmail;
	}

	public String getPassPassportNum() {
		return passPassportNum;
	}

	public void setPassPassportNum(String passPassportNum) {
		this.passPassportNum = passPassportNum;
	}

	public Boolean getCheckInStatus() {
		return checkInStatus;
	}

	public void setCheckInStatus(Boolean checkInStatus) {
		this.checkInStatus = checkInStatus;
	}

}
