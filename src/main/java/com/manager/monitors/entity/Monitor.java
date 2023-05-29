package com.manager.monitors.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "monitor")
public class Monitor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name = "monitor_name", nullable = false, length = 50)
	private String name;
	
	@Column(name = "monitor_surname", nullable = false, length = 50)
	private String surname;
	
	@Column(name = "monitor_email", nullable = false, length = 50, unique = true)
	private String email;
	
	
	public Monitor() {
		
	}


	public Monitor(Integer id, String name, String surname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Monitor [id=" + id + ", name=" + name + ", surname=" + surname + ", email=" + email + "]";
	}
	
	
	
	
	
}
