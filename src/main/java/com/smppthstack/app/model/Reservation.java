package com.smppthstack.app.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer resId;
	
	@Column
	private String name;
	
	@Column
	private String email;
	
	@Column
	private String phone;
	
	@Column
	private Date orderDate;
	
	@Column
	private String confirmationNum;
	
	//If null, ordered by traveler himself
	@ManyToOne
	private Employee employee;
	
	@OneToMany(mappedBy = "reservation")
	private List<Transaction> transection;

	
	
}
