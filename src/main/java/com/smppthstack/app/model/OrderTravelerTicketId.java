package com.smppthstack.app.model;

import java.io.Serializable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
public class OrderTravelerTicketId implements Serializable {

		@ManyToOne
		@JoinColumn(name = "resId" )
		private Reservation reservation;
		
		@ManyToOne
		@JoinColumn(name = "ticketId" )
		private Ticket ticket;
		
		@ManyToOne
		@JoinColumn(name = "travelerId" )
		private Traveler traveler;

		public Reservation getReservation() {
			return reservation;
		}

		public void setReservation(Reservation reservation) {
			this.reservation = reservation;
		}

		public Ticket getTicket() {
			return ticket;
		}

		public void setTicket(Ticket ticket) {
			this.ticket = ticket;
		}

		public Traveler getTraveler() {
			return traveler;
		}

		public void setTraveler(Traveler traveler) {
			this.traveler = traveler;
		}

}
