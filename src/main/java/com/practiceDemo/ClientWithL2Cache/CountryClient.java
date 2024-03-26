package com.practiceDemo.ClientWithL2Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.l2CacheEntity.Country;

public class CountryClient {

	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernatel2Cache.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		//Transaction tr = session.beginTransaction();
		
		/*Country c1 = new Country();
		c1.setCountryCode(234);
		c1.setCountryName("Germany");*/
		
		Country c2= session.load(Country.class, 1);
		System.out.println(c2);
		session.evict(c2);
		System.out.println("data from cache");
		System.out.println(session.contains(c2));
		c2=session.get(Country.class, 1);
		System.out.println(c2);
		//tr.commit();

		
		
		//session.save(c1);
		factory.close();
	}
}


