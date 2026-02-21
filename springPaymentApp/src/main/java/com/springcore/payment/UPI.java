/**
 * 
 */
package com.springcore.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
@Primary
public class UPI implements Payment {
	
	public UPI() {
		System.out.println("UPI payment method been created by spring");
	}
	
	public void paymentMethod(double amount) {
		System.out.println(amount +" has been paid by using UPI");
	}

}
