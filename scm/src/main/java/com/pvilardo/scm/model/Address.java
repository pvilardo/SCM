package com.pvilardo.scm.model;

public class Address {

	private String streetAddress;
	private String floor;
	private String apartementNumber;
	
	public Address (String streetAddress, String floor, String apartementNumber){
		this.streetAddress=streetAddress;
		this.floor=floor;
		this.apartementNumber=apartementNumber;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	public String getFloor() {
		return floor;
	}
	public String getApartementNumber() {
		return apartementNumber;
	}
	public City getCity() {
		return city;
	}
	public ZipCode getZipCode() {
		return zipCode;
	}
	private City city;
	private ZipCode zipCode;
	
}
