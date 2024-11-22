package com.pdp.service;

import java.util.ArrayList;
import java.util.List;

import com.pdp.dao.Dao;
import com.pdp.entity.Person;

public class Service {

	Dao d;

//	Insert method for inserting the data
	public String insert(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		d = new Dao();
		String res = d.insert(adhar, name, vid, cons, houseNo, city, pin);
		return res;
	}

//	viewAllPerson method for viewing all person info
	public List<Person> viewAllPerson() {
		d = new Dao();
		List<Person> lop = d.viewAllPerson();
		return lop;

	}

//	sort the person by pincode wise
	public List<Person> viewByPin(int pin) {
		List<Person> lop = viewAllPerson();
		List<Person> lopbp = new ArrayList<Person>();
		for (Person person : lop) {
			if (person.getAddress().getPinCode() == pin) {
				lopbp.add(person);
			}
		}
		return lopbp;
	}

//	sort all person by constituency wise
	public List<Person> viewBycon(String cons) {
		List<Person> lop = viewAllPerson();
		List<Person> lopbc = new ArrayList<Person>();
		for (Person person : lop) {
			if (person.getVoating().getConstituency().equalsIgnoreCase(cons)) {
				lopbc.add(person);
			}

		}

		return lopbc;
	}

//	sort All person by city wise
	public List<Person> viewByCity(String city) {
		List<Person> lopbcity = new ArrayList<Person>();
		List<Person> lop = viewAllPerson();
		for (Person person : lop) {
			if (person.getAddress().getcity().equalsIgnoreCase(city)) {
				lopbcity.add(person);
			}
		}
		return lopbcity;
	}

//	check the person is exist or not for updating opration
	public boolean checkExist(int adhar) {
		List<Person> lop = viewAllPerson();
		boolean res = false;
		for (Person person : lop) {
			if (person.getAdharId() == adhar) {
				res = true;
			}
		}
		return res;
	}

//	updatePerson method for updating a person info
	public String updatePerson(int adhar, String name, String cons, String city, int pin) {
		d = new Dao();
		String res = null;
		List<Person> lop = d.viewAllPerson();
		for (Person person : lop) {
			if (person.getAdharId() == adhar) {
				res = d.updatePerson(adhar, name, person.getVoating().getVoaterid(), cons,
						person.getAddress().getHouseNo(), city, pin);

			}
		}
		return res;
	}

//	deletePerson method check the person is exist or not
	public String deletePerson(int adhar) {
		d = new Dao();
		int count = 0;
		String res = null;
		List<Person> lop = viewAllPerson();
		for (Person person : lop) {
			if (person.getAdharId() == adhar) {
				count++;
				res = d.deletePerson(adhar);
			}
		}

		if (count == 0) {
			res = "Id is not found in tabel...";
		}
		return res;
	}

}
