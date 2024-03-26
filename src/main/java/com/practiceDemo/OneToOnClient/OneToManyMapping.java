package com.practiceDemo.OneToOnClient;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.oneToManyEntity.Cart;
import com.practiceDemo.oneToManyEntity.Items;

public class OneToManyMapping {
	
	public static void main(String[] args) {
		
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory = conf.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		Cart cart = new Cart();
		cart.setName("MyCart2");
		
		Items item1 = new Items("Pen", 10, 4);
		Items item2 = new Items("Mobile", 20, 3);
		
		Set<Items> itemsSet = new HashSet<Items>();
		itemsSet.add(item1); 
		itemsSet.add(item2);
		
		cart.setItems1(itemsSet);
		cart.setTotal(10*4 + 20*3);
		
		
			session.save(cart);
			session.save(item1);
			session.save(item2);
			//Commit transaction
			tr.commit();
			System.out.println("Cart1 ID="+cart.getId());
			System.out.println("item1 ID="+item1.getId());
			System.out.println("item2 ID="+item2.getId());
			
			factory.close();
	
	
	}

}
