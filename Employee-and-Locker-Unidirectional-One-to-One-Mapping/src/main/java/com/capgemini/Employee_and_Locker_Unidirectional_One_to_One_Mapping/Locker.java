/**
 * 
 */
package com.capgemini.Employee_and_Locker_Unidirectional_One_to_One_Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 */
@Entity
public class Locker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int lockerId;
	
	private int lockerNumber;
	private int floor;
	
	public Locker() {
		
	}

	/**
	 * @param lockerNumber
	 * @param floor
	 */
	public Locker(int lockerNumber, int floor) {
		super();
		this.lockerNumber = lockerNumber;
		this.floor = floor;
	}

	/**
	 * @return the lockerId
	 */
	public int getLockerId() {
		return lockerId;
	}

	/**
	 * @param lockerId the lockerId to set
	 */
	public void setLockerId(int lockerId) {
		this.lockerId = lockerId;
	}

	/**
	 * @return the lockerNumber
	 */
	public int getLockerNumber() {
		return lockerNumber;
	}

	/**
	 * @param lockerNumber the lockerNumber to set
	 */
	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	
	
	

}
