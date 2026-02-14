/**
 * 
 */
package com.capgemini.Employee_and_Locker_Unidirectional_One_to_One_Mapping;

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
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeID;
	
	private String name;
	private String department;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="locker_id", referencedColumnName = "lockerID")
	private Locker locker;
	
	public Employee() {
		
	}

	/**
	 * @param name
	 * @param department
	 */
	public Employee(String name, String department,Locker locker) {
		super();
		this.name = name;
		this.department = department;
		this.locker=locker;
	}

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
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
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the locker
	 */
	public Locker getLocker() {
		return locker;
	}

	/**
	 * @param locker the locker to set
	 */
	public void setLocker(Locker locker) {
		this.locker = locker;
	}
	
	
	
	
	
	
	
	

}
