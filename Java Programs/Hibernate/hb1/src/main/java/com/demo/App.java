package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;


public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        Student s1 = new Student();
        s1.setName("Andrue Patil");
        s1.setCity("New York");
        s1.setPercentage(99.45);
        session.save(s1);
        
        tx.commit();
        session.close();
    }
}
