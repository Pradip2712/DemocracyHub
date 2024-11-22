package com.pdp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	private int houseNo;
	private String city;
	private int pinCode;

	public Address() {
		super();
	}

	public Address(int houseNo, String city, int pinCode) {
		super();
		this.houseNo = houseNo;
		this.city = city;
		this.pinCode = pinCode;
	}

	public int getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return " houseNo=" + houseNo + ", city=" + city + ", pinCode=" + pinCode;
	}

}
