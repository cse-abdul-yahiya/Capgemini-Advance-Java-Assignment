/**
 * 
 */
package com.capgemini.Person_and_Passport_Bidirectional_One_to_One_Mapping;

import javax.annotation.Generated;
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
public class Passport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passportId;
	private String passportNumber;
	private String issueDate;
	private String expiryDate;
	
	@OneToOne(cascade=CascadeType.ALL)

	private Person person;

	/**
	 * 
	 */
	public Passport() {
		super();
	}

	/**
	 * @param passportId
	 * @param passportNumber
	 * @param issueDate
	 * @param expiryDate
	 * @param person
	 */
	public Passport( String passportNumber, String issueDate, String expiryDate) {
		super();
	
		this.passportNumber = passportNumber;
		this.issueDate = issueDate;
		this.expiryDate = expiryDate;
		
	}

	/**
	 * @return the passportId
	 */
	public int getPassportId() {
		return passportId;
	}

	/**
	 * @param passportId the passportId to set
	 */
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}

	/**
	 * @return the passportNumber
	 */
	public String getPassportNumber() {
		return passportNumber;
	}

	/**
	 * @param passportNumber the passportNumber to set
	 */
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	

}
