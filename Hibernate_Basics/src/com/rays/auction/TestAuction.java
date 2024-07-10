package com.rays.auction;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestAuction { 
	
	public static void main(String[] args) {
		
		Bid bid1= new Bid(); 
		Bid bid2= new Bid();
		Bid bid3= new Bid();
		
		
		bid1.setId(4);
		bid1.setAmount("1000");
		bid1.setTimeStamp("A");  
		
		bid2.setId(5);
		bid2.setAmount("2000"); 
		bid2.setTimeStamp("AA");
		
		bid3.setId(6);
		bid3.setAmount("3000");
		bid3.setTimeStamp("AAA"); 
		
		
		Set Bids = new HashSet(); 
		
		Bids.add(bid1); 
		Bids.add(bid2);
		Bids.add(bid3);
		
		
		AuctionItem item = new AuctionItem();
		
		item.setId(2);
		item.setDiscription("Auction 2"); 
		item.setBids(Bids);
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory(); 
		
		Session session = sf.openSession(); 
		
		Transaction tx = session.beginTransaction(); 
		
		session.save(item);
		
		tx.commit(); 
		
		sf.close();
			
		
	}

}

