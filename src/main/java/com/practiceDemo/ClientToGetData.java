package com.practiceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.entity.Student;

public class ClientToGetData {
	
public static void main(String[] args) {
	
	Configuration conf = new  Configuration();
	conf.configure("hibernate.cfg.xml");
	
	SessionFactory factory = conf.buildSessionFactory();
	Session session = factory.openSession();
	
	Student st1 = session.get(Student.class, 20);
	System.out.println(st1);
	
	factory.close();
}
}
