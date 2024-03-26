package com.practiceDemo.CustWithNativeSQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.practiceDemo.entity.annotation.Customer;

public class CustomerNativeSQL {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		String sql = "INSERT INTO `test`.`customer` (`cust_Id`, `cust_Address`, `cust_name`, `cust_email`, `pinCode`) VALUES (5,'frankfurt', 'sneha', 'sneha@gmail.com', '431122')";
		
		String sql2 = "Select * from Customer";
		
		String sql3 = "update Customer set cust_Address='pune' where cust_Id=5";
		
		String sql4 ="delete from Customer where cust_Id=?";
		
		NativeQuery query = session.createSQLQuery(sql4);
		
		query.addEntity(Customer.class);
		query.setParameter(1, 5);
		//List<Customer> list = query.getResultList();
		int count = query.executeUpdate();
		System.out.println("deleted  : "+count);
		
		tr.commit();
		System.out.println("deleted");
		factory.close();
		
	}

}
