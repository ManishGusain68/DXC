package com.EmbedDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		Certificate java=new Certificate("Java Course", 2);
		Certificate python=new Certificate("Python", 1);
		
		Employee sahana=new Employee( "Sahana", 90000, java);
		Employee samar=new Employee("Samar", 80000, python);
		
		session.save(samar);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		sessionFactory.close();
		
		
	
	}

}
