package com.smppthstack.app.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	
	@Column
	private String empName;
	
	@Column
	private String empUserName;
	
	@Column
	private String empPassword;
	
	@Column
	private String empPhone;
	
	@Column
	private String empEmail;
	
	@ManyToOne
	private EmployeePosition position;
	
	@OneToMany(mappedBy = "employee")
	private List<Reservation> reservation;
	
	
	
}
