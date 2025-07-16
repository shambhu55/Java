package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
//        Employee e = new Employee();
//        e.setName("John Patil");
//        e.setCompany("Wipro");
//        e.setDesignation("Software Developer");
//        e.setSalary(47000);
//        session.save(e);
//        tx.commit();
        
//        Employee e = new Employee();
//        e.setId(3);
//        e.setName("Aman Patel"); // not required
//        session.delete(e);
//        tx.commit();
        
//        Employee e = session.get(Employee.class, 10);
//        System.out.println(e);	//null	// not required to commit as it is dql
        
//        Employee e = session.load(Employee.class, 10);
//        System.out.println(e);		// exception if not found
        
//        Employee e = session.get(Employee.class, 1);
//        e.setName("Nasim Shah");
//        session.update(e);
//        tx.commit();
        
//        Employee e = session.get(Employee.class, 1);	//updates
//        e.setName("Aman Rathod");	// existing data i.e detached
//        session.saveOrUpdate(e);
//        tx.commit();
//        
//        Employee e = new Employee();	// save 
//        e.setName("Guman Singh");	// new data i.e transient
//        session.saveOrUpdate(e);
//        tx.commit();
        
    }
}
