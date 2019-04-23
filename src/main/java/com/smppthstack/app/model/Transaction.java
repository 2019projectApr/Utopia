package com.smppthstack.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tranId;
	
	@Column
	private String status;
	
	@Column
	private String paymentInfo;
	
	@ManyToOne
	private Reservation reservation;
	
}
