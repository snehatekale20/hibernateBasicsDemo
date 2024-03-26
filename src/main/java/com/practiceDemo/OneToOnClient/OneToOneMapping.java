package com.practiceDemo.OneToOnClient;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.oneToOneEntity.Stock;
import com.practiceDemo.oneToOneEntity.StockDetail;

public class OneToOneMapping {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction tr = session.beginTransaction();
		
		Stock st1 = new Stock();
		//st1.setStockId(1);
		st1.setStockName("tv");
		st1.setStockCode("345");
		
		StockDetail sd = new StockDetail();
		sd.setCompName("lg");
		sd.setListedDate(new Date());
		
		st1.setStockDetail(sd);
		
		session.save(st1);
		
		tr.commit();
		factory.close();
		
	}
}
