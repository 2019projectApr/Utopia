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
public class Plane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planeId;
	
	@Column
	private int planeNumber;
	
	@Column
	private boolean planeStatus;
	
	@ManyToOne
	@JoinColumn (name = "typeId")
	private PlaneType planeType;
	
	@OneToMany(mappedBy = "plane")
	private List<Flight> flights;
	

	
}
