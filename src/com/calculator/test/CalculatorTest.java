package com.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.junit.Calculator;

public class CalculatorTest {

//	private Calculator cal = new Calculator(); //추천하지않
	private Calculator cal; 

	//추천 , 매번 테스트가 서로간 영향을 미치지 않으면서 독립적으로 실행된다는것을 보장함 //초기화작업과 후처리작
	@Before
	public void setup() {
		cal = new Calculator();
		System.out.println("Setupt!");
	}
	@Test
	public void testAdd() {		
		assertEquals(3, cal.add(2, 1));
		System.out.println("add!");
	}

	@Test
	public void testdivide() {
		assertEquals(3, cal.divide(9, 3));
		System.out.println("divide!");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown!");
	}

}
