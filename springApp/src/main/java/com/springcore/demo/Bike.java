/**
 * 
 */
package com.springcore.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 
 */
@Component
//@Primary
public class Bike implements Vehicle {
	public Bike() {
		System.out.println("Bike bean is created by spring");
	}
	@Override
	 public void run() {
  	  System.out.println("Bike is running");
    }

}
