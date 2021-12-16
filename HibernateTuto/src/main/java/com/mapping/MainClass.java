package com.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
//		Answer a1 = new Answer();
//		Answer a2 = new Answer();
//		Answer a3 = new Answer();
//		Question q1 = new Question();
//
//		a1.setAnswer("Java is OOPs concept");
//		a1.setAnswerId(56);
//
//		a2.setAnswer("Java is light weight");
//		a2.setAnswerId(22);
//
//		a3.setAnswer("Java is pass by value");
//		a3.setAnswerId(19);
//
//		q1.setQuestion("What is Java");
//		q1.setQuestionId(112);
//
//		a1.setQuestion(q1);
//		a2.setQuestion(q1);
//		a3.setQuestion(q1);

//		List<Answer> list = new ArrayList<>();
//		list.add(a1);
//		list.add(a2);
//		list.add(a3);
//
//		q1.setAnswer(list);
//		
//		session.save(a1);
//		session.save(a2);
//		session.save(a3);
//		session.save(q1);

//		Transaction tx = session.beginTransaction();
//		tx.commit();
		
		Question ques=session.get(Question.class,112);
		//System.out.println(ques);
		
		for(Answer a: ques.getAnswer()){
			System.out.println(a.getAnswer());
		}
		
		session.close();
		sessionFactory.close();

	}

}
