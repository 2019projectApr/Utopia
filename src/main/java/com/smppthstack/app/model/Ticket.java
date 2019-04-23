package com.smppthstack.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity( name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer ticketId;
	
	@ManyToOne
	@JoinColumn(name = "seatId" )
	private Seat seat;
	
	@ManyToOne
	@JoinColumn(name = "flightId" )
	private Flight flight;
	
	@Column
	private Integer price;
	
	@OneToMany(mappedBy = "ticket")
	private List<OrderTravelerTicket> orderTravelerTickets;
	

}
