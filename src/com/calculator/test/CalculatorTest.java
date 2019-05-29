package com.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.junit.Calculator;

public class CalculatorTest {

	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		Calculator cal = new Calculator();
		assertEquals(63, cal.multiple(7, 9));
	}

}
