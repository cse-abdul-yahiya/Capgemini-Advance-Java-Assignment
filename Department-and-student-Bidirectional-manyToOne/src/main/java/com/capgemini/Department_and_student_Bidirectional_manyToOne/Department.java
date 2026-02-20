/**
 * 
 */
package com.capgemini.Department_and_student_Bidirectional_manyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




/**
 * 
 */
@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="deptName")
	private String deptName;
	
	@OneToMany(mappedBy="department")
	private List<Student> student;

	/**
	 * 
	 */
	public Department() {
		super();
	}

	/**
	 * @param id
	 * @param deptName
	 * @param student
	 */
	public Department( String deptName) {
		super();
		this.deptName = deptName;
	
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
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the student
	 */
	public List<Student> getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	
	
	

}
