package com.rays.junit;

import junit.framework.TestSuite;

public class TestAllSuite { 
	
	public static void main(String arr []) {
		
		TestSuite suite = new TestSuite("All User"); 
	
		suite.addTestSuite(TestAssertNotNull.class); 
		suite.addTestSuite(TestAssertNull.class); 
		
		junit.textui.TestRunner.run(suite);
		
		
	}

}
