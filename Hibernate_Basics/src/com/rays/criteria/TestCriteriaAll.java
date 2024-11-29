package com.rays.criteria;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestCriteriaAll {
	
	public static void main(String args []) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession(); 
		
		Transaction tx = session.beginTransaction(); 
		
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		List list = criteria.list(); 
		
		Iterator it = list.iterator();	 
		
		while (it.hasNext()) {
			
			
			UserDTO dto = (UserDTO) it.next();
			
			System.out.println();
			System.out.print(dto.getId() + " | ");
			System.out.print(dto.getFirstName() + " | ");
			System.out.print(dto.getLastName() + " | ");
			System.out.print(dto.getLoginId() + " | ");
			System.out.print(dto.getPassword() + " | ");
			System.out.print(dto.getDob() + " | ");
			System.out.println(dto.getAddress() + " | ");
			
			
		} 
		
		tx.commit();
		
		session.close();
		
	}

}