package com.smppthstack.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="airport_id")
	private int airportId;
	
	@Column
	private int airportCode;
	
	@Column
	private String airportName;
	
	@ManyToOne
	private City city;

	public int getAirportId() {
		return airportId;
	}

	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}

	public int getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(int airportCode) {
		this.airportCode = airportCode;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	

}
