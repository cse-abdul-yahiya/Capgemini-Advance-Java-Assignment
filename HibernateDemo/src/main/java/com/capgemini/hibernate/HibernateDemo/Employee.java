/**
 * 
 */
package com.capgemini.hibernate.HibernateDemo;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Employee {
	
	@Id
	private int id;
	private String name;
	
	@Embedded
	private Address address;

	// REQUIRED by JPA
	public Employee() {}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Address getAddress() { return address; }
	public void setAddress(Address address) { this.address = address; }
}



