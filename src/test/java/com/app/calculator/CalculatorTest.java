package com.app.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testadd_001() {
		
	Calculator c=new Calculator();
	Integer actualResult=c.add(10, 20);
	Integer expectedResult = 30;
	assertEquals(expectedResult, actualResult);
	
	}

}
