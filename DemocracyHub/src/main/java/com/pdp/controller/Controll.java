package com.pdp.controller;

import java.util.List;

import com.pdp.entity.Person;
import com.pdp.service.Service;

public class Controll {

	Service s = null;

	
	public String insert(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		s = new Service();
		String res = s.insert(adhar, name, vid, cons, houseNo, city, pin);
		return res;
	}

	public List<Person> viewAllPerson() {
		s = new Service();
		List<Person> lop = s.viewAllPerson();
		return lop;
	}

	public boolean checkexsit(int adhar) {
		s = new Service();
		boolean res = s.checkExist(adhar);
		return res;
	}

	public String updatePerson(int adhar, String name, String cons, String city, int pin) {
		s = new Service();
		String res = s.updatePerson(adhar, name, cons, city, pin);
		return res;
	}

	public String deletePerson(int adhar) {
		s = new Service();
		String res = s.deletePerson(adhar);
		return res;
	}

	public List<Person> viewByPin(int pin) {
		s = new Service();
		List<Person> lop = s.viewByPin(pin);
		return lop;
	}

	public List<Person> viewByCon(String cons) {
		s = new Service();
		List<Person> lop = s.viewBycon(cons);
		return lop;
	}

	public List<Person> viewByCity(String city) {
		s = new Service();
		List<Person> lop = s.viewByCity(city);
		return lop;
	}

}
