package com.practiceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.entity.Student;

public class ClientToDeleteData {
	
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		/*
		 * Student ss = new Student(); ss.setRollNo(11); ss.setStudName("sneha");
		 * ss.setStudAdd("frankfurt"); session.delete(ss);
		 */
		
		Student ss = session.load(Student.class, 20); 
		System.out.println(ss);
		session.delete(ss);
		System.out.println("ss deleted");
		
		tr.commit();
		factory.close();
		
	}

}
