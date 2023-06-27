package com.TestCode;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.TestingPractise.Calculation;

public class TestLogic {
	static Calculation c = null;
	
	@BeforeClass
	public static void beforeClass() {
		c = new Calculation();
		System.out.println("Before Class!!!!");
	}
	
	@AfterClass
	public static void afterClass() {
		c = null;
		System.out.println("After Class!!!!");
	}
	
	@Before
	public void befor() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test
	public void testPositiveAddition() {
		
		int actual = c.Addition(5, 11);
		int expected = 16;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testNegativeAdditon() {
//		c= new Calculation();
		int actual = c.Addition(-5, 5);
		int expected = 0;
		assertEquals(expected, actual);
	}
}
