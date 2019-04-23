package com.smppthstack.app.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;

	@ManyToOne
	@JoinColumn
	private Plane plane;
	
	@Column
	private Date depDateTime;
	
	@Column
	private Date arrDateTime;
	
	@ManyToOne
	@JoinColumn
	private Airport depAirport;
	
	@ManyToOne
	@JoinColumn
	private Airport arrAirport;
	
	@Column
	private String flightNum;
	
	@Column
	@Enumerated(EnumType.STRING)
	private FlightStatus flightStatus;
	
	@OneToMany(mappedBy = "flight")
	private List<Ticket> tickets;
	
	@OneToMany(mappedBy = "ticket")
	private List<OrderTravelerTicket> orderTravelerTickets;
	
	
}
