package com.practiceDemo.CustClientWithHQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.practiceDemo.entity.annotation.Customer;

public class CustomerHqlClient {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		String hql = "from Customer";
		Query query = session.createQuery(hql);
		
		List<Customer> list = query.getResultList();
		System.out.println(list);
		
		/*
		 * String hql2 = "Update Customer set custAddress='mumbai' where custId=2";
		 * Query query2 = session.createQuery(hql2); int updateCount =
		 * query2.executeUpdate(); System.out.println("updated count: "+updateCount);
		 */
		
		String hql3 = "delete Customer where custId=3";
		Query query3 = session.createQuery(hql3);
		int deletecount = query3.executeUpdate();
		System.out.println(deletecount);
		tr.commit();
		factory.close();
	}

}
//INSERT INTO `test`.`customer` (`cust_Id`, `cust_Address`, `cust_name`, `cust_email`, `pinCode`) VALUES ('3', 'xyz', 'abc', 'abc@gmail.com', '2005');
