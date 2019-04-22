package com.smppthstack.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="flight")
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long flightId;
	
	@ManyToOne
	@JoinColumn(name = "planeId" )
	private Plane plane;
	
	@Column(name = "depDateTime")
	private Date depDateTime;
	
	@Column(name = "arrDateTime")
	private Date arrDateTime;
	
	@ManyToOne
	private Airport depAirport;
	
	@ManyToOne
	private Airport arrAirport;
	
	@Column(name = "flightNumb")
	private String flightNum;
	
	// We need to define Enum
	@Column(name = "flightStatus")
	private String flightStatus;
	
	

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
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

	public String getFlightNum() {
		return flightNum;
	}

	public void setFlightNum(String flightNum) {
		this.flightNum = flightNum;
	}

	public String getFlightStatus() {
		return flightStatus;
	}

	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	
	
}
