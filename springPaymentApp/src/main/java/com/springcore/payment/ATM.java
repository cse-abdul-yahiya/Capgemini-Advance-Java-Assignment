
/**
 * 
 */
package com.springcore.payment;

import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
public class ATM implements Payment {
	
	public ATM() {
		System.out.println("ATM card payment method been created by spring");
	}
	
	public void paymentMethod(double amount) {
		System.out.println(amount +" has been paid by using ATM card");
	}
}
