package com.casestudy.flight_booking.entity;

import javax.persistence.Entity;

@Entity
public class Airline extends BaseEntity {
	
	private String airlineName;
	
	private Boolean isBlocked;
}