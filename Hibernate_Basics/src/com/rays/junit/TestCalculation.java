package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculation { 
	
	@Test
	public void testAssertEquals()  { 
		
		int max = Calculation.findMax(new int[] { 1, 3, 4, 2, 6 });

		assertEquals(6, max);
		
		
	}

}
