package com.practiceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.entity.Student;

public class ClientToUpdateData {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr1 = session.beginTransaction();
		
		Student ss = session.get(Student.class, 30);
		System.out.println(ss);
		
		ss.setStudName("Sneha");
		session.update(ss);
		
		System.out.println(ss);
		tr1.commit();
		factory.close();
	}

}
