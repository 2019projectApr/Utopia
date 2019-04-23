package com.smppthstack.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PlaneType {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int typeId;
	
	@Column
	private String typeName;
	
	@Column
	private Integer rowBusNum;
	
	@Column
	private Integer colBusNum;
	
	@Column
	private Integer rowEconNum;
	
	@Column
	private Integer colEconNum;
	
	@OneToMany(mappedBy = "planeType")
	private List<Plane> planes;

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Integer getRowBusNum() {
		return rowBusNum;
	}

	public void setRowBusNum(Integer rowBusNum) {
		this.rowBusNum = rowBusNum;
	}

	public Integer getColBusNum() {
		return colBusNum;
	}

	public void setColBusNum(Integer colBusNum) {
		this.colBusNum = colBusNum;
	}

	public Integer getRowEconNum() {
		return rowEconNum;
	}

	public void setRowEconNum(Integer rowEconNum) {
		this.rowEconNum = rowEconNum;
	}

	public Integer getColEconNum() {
		return colEconNum;
	}

	public void setColEconNum(Integer colEconNum) {
		this.colEconNum = colEconNum;
	}

	public List<Plane> getPlanes() {
		return planes;
	}

	public void setPlanes(List<Plane> planes) {
		this.planes = planes;
	}

	
	
	
}
