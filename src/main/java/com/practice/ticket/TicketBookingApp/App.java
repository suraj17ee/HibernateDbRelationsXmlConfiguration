package com.practice.ticket.TicketBookingApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.practice.ticket.dao.TicketDao;
import com.practice.ticket.entity.Person;
import com.practice.ticket.entity.Tickets;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// OneToOne
//		Person p1 = new Person();
//		p1.setName("mithilesh");
//		p1.setAge("25");
//		p1.setGender("male");
//		p1.setBearth("lower");
//
//		Tickets t1 = new Tickets();
//		t1.setFrom("pune");
//		t1.setTo("bbsr");
//		t1.setDate(new Date());
//		t1.setPerson(p1);
//		
//		TicketDao td = new TicketDao();
//		td.bookTicket(t1);
//==================================================================
		// OneToMany
		Person p1 = new Person();
		p1.setName("raghuram");
		p1.setAge("25");
		p1.setGender("male");
		p1.setBearth("lower");

		Person p2 = new Person();
		p2.setName("rajashree");
		p2.setAge("24");
		p2.setGender("female");
		p2.setBearth("lower");

		List<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(p2);

		Tickets t1 = new Tickets();
		t1.setFrom("blr");
		t1.setTo("burla");
		t1.setDate(new Date());
		t1.setPersons(al);
		
		TicketDao td = new TicketDao();
		td.bookTicket(t1);
//================================================================		

		// ManyToMany
//		Tickets t1 = new Tickets();
//		t1.setFrom("bbsr");
//		t1.setTo("burla");
//		t1.setDate(new Date());
//		
//		Tickets t2 = new Tickets();
//		t2.setFrom("bbsr");
//		t2.setTo("burla");
//		t2.setDate(new Date());
//		
//		Set<Tickets> setT = new HashSet<Tickets>();
//		setT.add(t1);
//		setT.add(t2);
////		
//		Person p1 = new Person();
//		p1.setName("suraj");
//		p1.setAge("27");
//		p1.setGender("male");
//		p1.setBearth("cc");
//		p1.setTickets(setT);
//		
//		Person p2 = new Person();
//		p2.setName("ronali");
//		p2.setAge("26");
//		p2.setGender("female");
//		p2.setBearth("cc");
//		p2.setTickets(setT);
//		
//		Set<Person> setP = new HashSet<Person>();
//		setP.add(p1);
//		setP.add(p2);
//		
//		p1.setTickets(setT);
//		p2.setTickets(setT);
//		
//		TicketDao td = new TicketDao();
//		td.bookPersonsTicket(p1);
//		td.bookPersonsTicket(p2);

//==============================================================================

//		ManyToOne
//		Tickets t1 = new Tickets();
//		t1.setFrom("mumbai");
//		t1.setTo("chennai");
//		t1.setDate(new Date());
//		
//		Tickets t2 = new Tickets();
//		t2.setFrom("bihar");
//		t2.setTo("kota");
//		t2.setDate(new Date());
//		
//		List<Tickets> al = new ArrayList<Tickets>();
//		al.add(t1);
//		al.add(t2);
//		
//		Person p1 = new Person();
//		p1.setName("suman");
//		p1.setAge("29");
//		p1.setGender("female");
//		p1.setBearth("cc");
//		p1.setTickets(al);
//		
//		TicketDao td = new TicketDao();
//		td.bookPersonsTicket(p1);

	}
}
