package com.practice.ticket.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practice.ticket.entity.Person;
import com.practice.ticket.entity.Tickets;

public class TicketDao {
	public void bookTicket(Tickets ticket) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tn = session.beginTransaction();
		session.save(ticket);
		tn.commit();
	}
//	public void bookPersonsTicket(Person person) {
//		Configuration cfg = new Configuration();
//		cfg.configure();
//		SessionFactory sf = cfg.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tn = session.beginTransaction();
//		session.save(person);
//		tn.commit();
//	}
}
