package com.pdp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	private int adharId;
	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "voating_id", unique = true, nullable = true, referencedColumnName = "voaterid")
	private VoatingCard voating;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", unique = true, nullable = true, referencedColumnName = "houseNo")
	private Address address;

	public Person() {
		super();
	}

	public Person(int adharId, String name) {
		super();
		this.adharId = adharId;
		this.name = name;
	}

	public Person(int adharId, String name, VoatingCard voating, Address address) {
		super();
		this.adharId = adharId;
		this.name = name;
		this.voating = voating;
		this.address = address;
	}

	public int getAdharId() {
		return adharId;
	}

	public void setAdharId(int adharId) {
		this.adharId = adharId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoatingCard getVoating() {
		return voating;
	}

	public void setVoating(VoatingCard voating) {
		this.voating = voating;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [adharId=" + adharId + ", name=" + name + ", voating=" + voating + ", address=" + address + "]";
	}

//	
//	
//	@Id
//	private int adharId;
//	private String name;
//
//	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = " voating_id", referencedColumnName = "voaterid")
//	private VoatingCard voating;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = " address_id", referencedColumnName = "houseNo")
//	private Address address;
//
//	public Person() {
//		super();
//	}
//
//	public Person(int adharId, String name) {
//		super();
//		this.adharId = adharId;
//		this.name = name;
//	}
//
//	public Person(int adharId, String name, VoatingCard voating, Address address) {
//		super();
//		this.adharId = adharId;
//		this.name = name;
//		this.voating = voating;
//		this.address = address;
//	}
//
//	public int getAdharId() {
//		return adharId;
//	}
//
//	public void setAdharId(int adharId) {
//		this.adharId = adharId;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public VoatingCard getVoating() {
//		return voating;
//	}
//
//	public void setVoating(VoatingCard voating) {
//		this.voating = voating;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}
//
//	@Override
//	public String toString() {
//		return "Person [adharId=" + adharId + ", name=" + name + ", voating=" + voating + ", address=" + address + "]";
//	}
//
}
