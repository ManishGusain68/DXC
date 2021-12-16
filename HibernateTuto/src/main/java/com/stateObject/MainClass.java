package com.stateObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String args[]) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		// object is in transient state
		Trainer t1 = new Trainer(10, "Sai", 4);
		Transaction tx = session.beginTransaction();

		session.save(t1); // Persistent: object will now move to persistent
							// state...session+database
		session.delete(t1); //Removed State : object is deleted from Session and Database
		tx.commit();
		
		session.close();//Detached state: object is now detached from session and database

	}

}
