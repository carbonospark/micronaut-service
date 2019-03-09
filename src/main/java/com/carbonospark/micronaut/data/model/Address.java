package com.carbonospark.micronaut.data.model;

import lombok.Data;

@Data
public class Address {

	public String city;
	public String street;
	public int number;
	public int portal;
	public int zip;

	public Address() {
		super();
	}

	public Address(String city, String street, int number, int portal, int zip) {
		super();
		this.city = city;
		this.street = street;
		this.number = number;
		this.portal = portal;
		this.zip = zip;
	}

}
