/**
 * 
 */
package com.springcore.payment;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component

public class Cash implements Payment {
	
	public Cash() {
		System.out.println("Cash payment method been created by spring");
	}
	
	public void paymentMethod(double amount) {
		System.out.println(amount +" has been paid by using Cash");
	}

}
