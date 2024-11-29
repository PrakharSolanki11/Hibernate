package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.auction.AuctionItem;
import com.rays.auction.Bid;

public class TestTransitivePersistance { 
	
	public static void main(String[] args) {
		
		
		Bid bid = new Bid(); 
		
		bid.setId(7);
		bid.setAmount("10000");
		bid.setTimeStamp("WWE"); 
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
		 
		Session session = sf.openSession();
		
		Transaction tx =session.beginTransaction();
		
		session.get(AuctionItem.class, 1);
	} 
	
	

}
