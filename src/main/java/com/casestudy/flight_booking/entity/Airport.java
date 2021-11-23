package com.casestudy.flight_booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Airport extends BaseEntity {
	@Column(nullable=false, unique=true)
	private String airportCode;
	
	@Column(nullable=false)
	private String airportName;
	
	private String city;
	
	private String state;
	
	private String country;
}
