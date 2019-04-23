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


@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int airportId;
	
	@Column
	private int airportCode;
	
	@Column
	private String airportName;
	
	@ManyToOne
	@JoinColumn(name = "cityId" )
	private City city;
	
	@OneToMany(mappedBy = "depAirport")
	private List<Flight> depFlights;
	
	@OneToMany(mappedBy = "arrAirport")
	private List<Flight> arrFlights;
	

}
