package com.practice.ticket.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "ticket_book")
public class Tickets implements Serializable {

	@Id
	@Column(name = "t_id")
	@GenericGenerator(name = "relations_auto", strategy = "increment")
	@GeneratedValue(generator = "relations_auto")
	private int ticketNo;

	@Column(name = "ticket_date")
	private Date date;

	@Column(name = "ticket_from")
	private String from;

	@Column(name = "ticket_to")
	private String to;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "person_id")
//	private Person person;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "persons_id")
	private List<Person> persons;

//	@ManyToMany(mappedBy = "tickets")
//	private Set<Person>persons;

	public Tickets() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Tickets(int ticketNo, Date date, String from, String to) {
//		super();
//		this.ticketNo = ticketNo;
//		this.date = date;
//		this.from = from;
//		this.to = to;
//	}

	// OneToOne
//	public Tickets(int ticketNo, Date date, String from, String to, Person person) {
//		super();
//		this.ticketNo = ticketNo;
//		this.date = date;
//		this.from = from;
//		this.to = to;
//		this.person = person;
//	}

	//OneToMany
	public Tickets(int ticketNo, Date date, String from, String to, List<Person> persons) {
		super();
		this.ticketNo = ticketNo;
		this.date = date;
		this.from = from;
		this.to = to;
		this.persons = persons;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

//	public Set<Person> getPersons() {
//		return persons;
//	}
//	
//	public void setPersons(Set<Person> persons) {
//		this.persons = persons;
//	}

	//OnetoOne
//	public Person getPerson() {
//		return person;
//	}
//
//	public void setPerson(Person person) {
//		this.person = person;
//	}

//	//OneToMany
	public List<Person> getPersons() {
		return persons;
	}
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	// OneToOne
//	@Override
//	public String toString() {
//		return "Tickets [ticketNo=" + ticketNo + ", date=" + date + ", from=" + from + ", to=" + to + ", person="
//				+ person + "]";
//	}

//	@Override
	public String toString() {
		return "Tickets [ticketNo=" + ticketNo + ", date=" + date + ", from=" + from + ", to=" + to + ", persons="
				+ persons + "]";
	}

}
