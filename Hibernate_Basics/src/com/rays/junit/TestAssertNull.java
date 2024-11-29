package com.rays.junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.TestCase;

public class TestAssertNull extends TestCase { 
	
	@Test
	public void testAssertNull() throws Exception{
		
		
		UserBean bean = UserModel.findByPk(20); 
		
		assertTrue("Is Not True",bean==null);
		
		
	}

}
