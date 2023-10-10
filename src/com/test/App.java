package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		System.out.println("Project Started");
		
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
		Configuration con=new Configuration().configure("hibernate.cfg.xml");

//		SessionFactory factory = con.buildSessionFactory(); 
//		Session session =  factory.openSession();
//		Transaction tx = session.beginTransaction();
		
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();

		//System.out.println(factory);
		
		
		Student st = new Student();
		st.setId(4);
		st.setName("Priya");
		st.setCity("Delhi");
		
//		System.out.println(st);
//
//		System.out.println("Data store sucessfully please check in database");
		
		
		session.save(st);
		tr.commit();
		
		System.out.println(st);

		System.out.println("Data store sucessfully please check in database");
		
		
		
		
		
		
		
		
	}
}
