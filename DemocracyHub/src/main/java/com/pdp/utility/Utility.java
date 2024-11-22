package com.pdp.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.pdp.entity.Address;
import com.pdp.entity.Person;
import com.pdp.entity.VoatingCard;

public class Utility {

	public static Session session() {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(VoatingCard.class);

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		return session;
	}
}
