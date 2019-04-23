package com.smppthstack.app.model;

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
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatId;
	
	@ManyToOne
	@JoinColumn
	private PlaneType planeType;
	
	@Column
	@Enumerated(EnumType.STRING)
	private SeatClass seatClass;
	
	@Column
	private String info;

	@OneToMany(mappedBy = "seat")
	private List<Ticket> tickets;
}
