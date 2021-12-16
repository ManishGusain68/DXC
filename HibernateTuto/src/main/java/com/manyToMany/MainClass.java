package com.manyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;

import org.hibernate.Transaction;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setEid(112);
		e1.setEname("Kusuma");

		e2.setEid(234);
		e2.setEname("Samar");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(1);
		p1.setPname("Online Project");

		p2.setPid(5);
		p2.setPname("Offline Project");

		List<Employee> elist = new ArrayList<>();
		elist.add(e1);
		elist.add(e2);

		List<Project> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);

		e1.setProject(plist);
		p2.setEmp(elist);

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		Transaction tx = session.beginTransaction();
		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
