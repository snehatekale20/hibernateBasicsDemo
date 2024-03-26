package com.practiceDemo.CustClientWithAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.entity.annotation.Customer;

public class CustomerCleint {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Customer c1 = new Customer();
		c1.setCustName("kavya");
		c1.setCustAddress("mumbai");
		c1.setEmailId("kavya@gmail.com");
		c1.setPinCode(123098);
		
		Customer c2 = new Customer();
		c2.setCustName("arav");
		c2.setCustAddress("pune");
		c2.setEmailId("arav@gmail.com");
		c2.setPinCode(3456);
		
		Customer c3 = session.get(Customer.class, 1);
		System.out.println(c3);
		
		//c3.setPinCode(3456);
		//session.update(c3);
		
		session.delete(c3);
		//session.save(c2);
		tr.commit();
		
		factory.close();
		
		
	}

}
