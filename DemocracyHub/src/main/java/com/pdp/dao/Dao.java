package com.pdp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pdp.entity.Address;
import com.pdp.entity.Person;
import com.pdp.entity.VoatingCard;
import com.pdp.utility.Utility;

public class Dao {

//	in this method we are inserting the person information
	public String insert(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {
		Session session = Utility.session();
		Transaction tx = session.beginTransaction();

		Person p = new Person(adhar, name);
		VoatingCard v = new VoatingCard(vid, cons);
		Address a = new Address(houseNo, city, pin);
		p.setVoating(v);
		p.setAddress(a);

		session.save(p);
		tx.commit();
		String res = "data inserted successfully...";
		session.close();
		return res;
	}

//	In this method we are get all persons information 
	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Person> viewAllPerson() {

		Session session = Utility.session();
		Criteria criteria = session.createCriteria(Person.class);
		List<Person> lop = criteria.list();

		return lop;
	}

//	in this method we update the person information
	public String updatePerson(int adhar, String name, String vid, String cons, int houseNo, String city, int pin) {

		Session session = Utility.session();
		Transaction tx = session.beginTransaction();

		Person p = new Person(adhar, name, new VoatingCard(vid, cons), new Address(houseNo, city, pin));

		session.update(p);
		tx.commit();
		session.close();
		String res = "Person Data Updated Successfully...";

		return res;
	}

//	in this method we delete the person information
	public String deletePerson(int adhar) {
		Session session = Utility.session();
		int count = 0;
		String res = null;
		Transaction tx = session.beginTransaction();
		List<Person> lop = viewAllPerson();
		for (Person person : lop) {
			if (person.getAdharId() == adhar) {
				session.delete(person);
				tx.commit();
				session.close();
				count++;
				res = "Person data deleted successfully...";
			}
		}
		if (count == 0) {
			res = "something went worng...";
		}

		return res;
	}

}
