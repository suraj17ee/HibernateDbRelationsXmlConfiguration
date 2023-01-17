package com.practice.ticket.entity;

import java.io.Serializable;
import java.util.List;
//import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "person_details")
public class Person implements Serializable {

	@Id
	@Column(name = "p_id")
	@GenericGenerator(name = "relations_auto", strategy = "increment")
	@GeneratedValue(generator = "relations_auto")
	private int pid;
	
	@Column(name = "p_name")
	private String name;
	
	@Column(name = "p_age")
	private String age;
	
	@Column(name = "p_gender")
	private String gender;
	
	@Column(name = "p_bearth")
	private String bearth;
	
//	@ManyToMany(cascade=CascadeType.ALL)
//	@JoinTable(name="person_ticket",
//	joinColumns = {@JoinColumn(referencedColumnName = "p_id")},
//	inverseJoinColumns = {@JoinColumn(referencedColumnName = "t_id")})
//	private Set<Tickets> tickets;
	
//	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Tickets.class)
//	@JoinColumn(name = "ticket_id")
//	private List<Tickets> tickets;


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBearth() {
		return bearth;
	}

	public void setBearth(String bearth) {
		this.bearth = bearth;
	}

//	public List<Tickets> getTickets() {
//		return tickets;
//	}
//	
//	public void setTickets(List<Tickets> tickets) {
//		this.tickets = tickets;
//	}
	
//	public Set<Tickets> getTickets() {
//		return tickets;
//	}
//
//	public void setTickets(Set<Tickets> tickets) {
//		this.tickets = tickets;
//	}

}
