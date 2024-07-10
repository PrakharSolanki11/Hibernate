package com.rays.user;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDTO {

	public static void main(String[] args) {

		UserDTO dto = new UserDTO();

		dto.setId(2);
		dto.setFirstName("Riya");
		dto.setLastName("Garhwal");
		dto.setLoginId("riyagarhwal@gamil.com");
		dto.setPassword("Riya@123");
		dto.setDob(new Date());
		dto.setAddress("New Dehli");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.update(dto);

		tx.commit();

		session.close();

	}

}
