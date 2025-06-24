package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {	
//    	StudentDao sd = new StudentDao();
//    	Student s1 = new Student();
    	
//    	s1.setName("Sheetal Khan");
//    	s1.setCity("Satara");
//    	s1.setPercentage(76.34);
//    	int result = sd.insertStudent(s1);
//    	System.out.println(result);
    	
    	
//    	int result = sd.deleteStudentById(3);
//    	System.out.println(result);
    	
//    	Student result = sd.findStudentById(2);
//    	System.out.println(result);
    	
//    	List<Student> result = sd.findAllStudent();
//    	for(Student s:result)
//    		System.out.println(s);
    	
//    	Student s2 = sd.findStudentById(1);
//    	s2.setName("Aniket");
//    	System.out.println(sd.updateStudent(s2));

//-------------------------------------------------------
    	
    	StudentDao sd = new StudentDao();
//    	Student s1 = new Student();
    	
//    	s1.setName("Shubham Davat");
//    	s1.setCity("Sangli");
//    	s1.setPercentage(69.99);
//    	int result = sd.insertStudent(s1);
//    	System.out.println(result);
    	
//    	int result = sd.deleteStudentById(4);
//    	System.out.println(result);
    	
//    	Student result = sd.findStudentById(2);
//    	System.out.println(result);
    	
//    	List<Student> result = sd.findAllStudent();
//    	for(Student s:result)
//    		System.out.println(s);
    	
    	Student s2 = sd.findStudentById(2);
    	s2.setName("Aslam Patil");
    	System.out.println(sd.updateStudent(s2));
    }
}
