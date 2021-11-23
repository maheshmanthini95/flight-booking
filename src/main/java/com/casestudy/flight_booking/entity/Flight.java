package com.casestudy.flight_booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class Flight extends BaseEntity {
	
	@Column(nullable=false, unique=true)
	private String flightNumber;
	
//	@ManyToOne
//	@JoinColumn(nullable=false)
//	private Airline airlineId;
//	
//	@ManyToOne
//	@JoinColumn(nullable=false)
//	private Airport fromAirportId;
//	
//	@ManyToOne
//	@JoinColumn(nullable=false)
//	private Airport toAirportId;
	
	private String instrument;
	
	private Integer startTime;
	
	private Integer endTime;
	
	private String mealType;
}