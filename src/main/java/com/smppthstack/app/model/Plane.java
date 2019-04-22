package com.smppthstack.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plane {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int planeId;
	
	
	@Column
	private int planeNumber;
	
	@Column
	private boolean planeStatus;

	public int getPlaneId() {
		return planeId;
	}

	public void setPlaneId(int planeId) {
		this.planeId = planeId;
	}

	public int getPlaneNumber() {
		return planeNumber;
	}

	public void setPlaneNumber(int planeNumber) {
		this.planeNumber = planeNumber;
	}

	public boolean isPlaneStatus() {
		return planeStatus;
	}

	public void setPlaneStatus(boolean planeStatus) {
		this.planeStatus = planeStatus;
	}
	
	
	
}
