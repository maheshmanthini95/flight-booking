package com.casestudy.flight_booking.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity {
		
	@Column(length=50, nullable=false, unique=true)
	private String email;
	
	private String name;
	
	private String pwdHash;
	
	private boolean isAdmin = false;
}
