package com.smppthstack.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(OrderTravelerTicketId.class)
public class OrderTravelerTicket {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "resId" )
	private Reservation reservation;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "ticketId" )
	private Ticket ticket;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "travelerId" )
	private Traveler traveler;
	
	@Column
	private Boolean checkInStatus;

}
