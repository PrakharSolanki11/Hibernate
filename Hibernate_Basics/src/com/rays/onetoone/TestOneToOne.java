package com.rays.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestOneToOne {

	public static void main(String[] args) {
		
		Address empAddress = new Address();
		
		Employee e = new Employee();
		
		empAddress.setId(1);
		empAddress.setStreet("Street 1");
		empAddress.setCity("Indore"); 
		
		e.setId(1);
		e.setName("Prakhar");
		e.setEmpAddress(empAddress);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
		
		Session session = sf.openSession();		 
		
		Transaction tx = session.beginTransaction();     
		
	    session.save(e); 
	    
	    tx.commit(); 
	    
	    sf.close(); 
		
	}
	
	
}
