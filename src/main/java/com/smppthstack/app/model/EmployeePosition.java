package com.smppthstack.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity( name = "Employee_Position")
public class EmployeePosition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer positionId;
	
	@Column
	private String positionName;
	
	@OneToMany(mappedBy = "position")
	private List<Employee> employees;
	
}
