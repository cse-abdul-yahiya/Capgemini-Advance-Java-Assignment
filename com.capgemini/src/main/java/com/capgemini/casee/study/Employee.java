/**
 * 
 */
package com.capgemini.casee.study;

/**
 * 
 */
public class Employee {
	private String name;
	private int empId;
	private String department;
	private String designation;
	private double salary;
	private double yearOfExp;
	/**
	 * @param name
	 * @param empId
	 * @param department
	 * @param designation
	 * @param salary
	 * @param yearOfExp
	 */
	public Employee(int empId,String name,  String department, String designation, double salary, double yearOfExp) {
		super();
		this.empId = empId;
		this.name = name;
		
		this.department = department;
		this.designation = designation;
		this.salary = salary;
		this.yearOfExp = yearOfExp;
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
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
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
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the yearOfExp
	 */
	public double getYearOfExp() {
		return yearOfExp;
	}
	/**
	 * @param yearOfExp the yearOfExp to set
	 */
	public void setYearOfExp(double yearOfExp) {
		this.yearOfExp = yearOfExp;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", department=" + department + ", designation="
				+ designation + ", salary=" + salary + ", yearOfExp=" + yearOfExp + "]";
	}
	
	
	

}
