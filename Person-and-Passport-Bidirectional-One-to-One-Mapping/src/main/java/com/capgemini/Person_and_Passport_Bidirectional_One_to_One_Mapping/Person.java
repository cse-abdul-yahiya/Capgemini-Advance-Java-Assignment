/**
 * 
 */
package com.capgemini.Person_and_Passport_Bidirectional_One_to_One_Mapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * 
 */
@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dob;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="passport_id", referencedColumnName = "passportId")
	private Passport passport;
	/**
	 * 
	 */
	public Person() {
		super();
	}
	/**
	 * @param name
	 * @param dob
	 * @param passport
	 */
	public Person(String name, String dob, Passport passport) {
		super();
		this.name = name;
		this.dob = dob;
		this.passport = passport;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the passport
	 */
	public Passport getPassport() {
		return passport;
	}
	/**
	 * @param passport the passport to set
	 */
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	
	

}
