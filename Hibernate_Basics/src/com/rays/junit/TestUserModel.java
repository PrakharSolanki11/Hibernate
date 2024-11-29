package com.rays.junit;

import static org.junit.Assert.fail;

import org.junit.Test;



public class TestUserModel { 
	
	@Test
	public void testAdd() throws Exception { 
		
		
		UserBean bean =  new UserBean();
		
		//bean.setId(13);
		bean.setName("Rajput");
		bean.setSalary(11000); 
		
		UserModel model = new UserModel();
		
		model.add(bean);
		
		bean = model.findByPk(15); 
		
		if(bean==null) {
			
			fail("No Record Found ....!!!!");
			
			
		} 
		
		else {
			
			System.out.println("Record is Added....");
		}
		
		
	}

}
