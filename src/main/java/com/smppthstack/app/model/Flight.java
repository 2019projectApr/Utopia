package com.smppthstack.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="flight_id")
	private Long flightId;
	
	@Column(name = "dep_dateTime")
	private Date depDateTime;
	
	@Column(name = "arr_dateTime")
	private Date arrDateTime;
	
	@ManyToOne
	private Airport depAirport;
	
	@ManyToOne
	private Airport arrAirport;
	
	@Column
	private Integer capacity;

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Date getDepDateTime() {
		return depDateTime;
	}

	public void setDepDateTime(Date depDateTime) {
		this.depDateTime = depDateTime;
	}

	public Date getArrDateTime() {
		return arrDateTime;
	}

	public void setArrDateTime(Date arrDateTime) {
		this.arrDateTime = arrDateTime;
	}

	public Airport getDepAirport() {
		return depAirport;
	}

	public void setDepAirport(Airport depAirport) {
		this.depAirport = depAirport;
	}

	public Airport getArrAirport() {
		return arrAirport;
	}

	public void setArrAirport(Airport arrAirport) {
		this.arrAirport = arrAirport;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
	
}
