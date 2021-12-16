package com.tuto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Application Started...");
		Student std1 = new Student(112, "Sahana MS", "Chennai");
		Student std2 = new Student(273, "Manish", "Noida");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		// session.save(std2);
		
			Student std = session.get(Student.class, 279);
			System.out.println(std);
		
		// Transaction tx = session.beginTransaction();
		// tx.commit();
		session.close();
		sessionFactory.close();

	}
}
