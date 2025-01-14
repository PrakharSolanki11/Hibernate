package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.auction.AuctionItem;

public class TestDirtyCheck { 
	
	
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
		
		Session session = sf.openSession(); 
		
		Transaction tx =session.beginTransaction(); 
		
		AuctionItem item =(AuctionItem)session.get(AuctionItem.class, 1);
		
		item.setDiscription("Auction 3"); 
		
		session.save(item);
		
		tx.commit();
		
		sf.close();
		
	}
	
	

}
