/**
 * 
 */
package com.calculator.test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.capgemini.Calculator.testing.Calculator;

/**
 * 
 */
public class CalculatorTest {
	Calculator calculator = new Calculator();
	
	@Test
	public void  testTwoAndTwoGivesFour() {
		assertEquals(4, calculator.add(2,2)) ;
	}
	@Test
	public void testFiveAndFourGivesNine() {
		assertEquals(9, calculator.add(5,4)) ;
	}
	
	

}
