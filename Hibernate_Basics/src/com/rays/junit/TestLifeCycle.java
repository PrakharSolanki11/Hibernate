package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle { 
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}   
	
	@Before
	public void before() {
		System.out.println("Before Test");
	} 
	
	@Test
	public void test1() {
		System.out.println("Test 1"); 
		assertEquals("6", Calculation.findMax(new int[] {1,2,3,4,5,6}));
	} 
	
	@Test
	public void test2() {
		
		System.out.println("Test 2"); 
		assertEquals("6", Calculation.findMax(new int[] {1,2,3,4,5,6}));
	} 
	
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("After Class");
	}

}
