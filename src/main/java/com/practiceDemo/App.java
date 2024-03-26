package com.practiceDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.practiceDemo.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        
        SessionFactory factory = conf.buildSessionFactory();
        Session session = factory.openSession();
        
        Transaction tr = session.beginTransaction();

        Student st = new Student();
        st.setRollNo(20);
        st.setStudName("abc");
        st.setStudAdd("xyz");
        
        Student st2 = new Student();
        st2.setRollNo(30);
        st2.setStudName("pqr");
        st2.setStudAdd("xyz");
        
        
        session.save(st2);
        tr.commit();
        
        
        factory.close();
        
    }
}
