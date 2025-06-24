package com.demo;

import com.dao.BookDao;
import com.model.Book;

public class App 
{
    public static void main( String[] args )
    {
    	// Delete by ID
//    	BookDao bd = new BookDao();
//    	bd.deleteById(8);
    	
    	// Update by ID
//    	BookDao bd = new BookDao();
//    	book b = new book();
//    	b.setId(7);
//    	b.setName("Musafir");
//    	b.setPrice(200);
//    	bd.updateById(b);
    	
    	
    	// Display By ID
    	BookDao bd = new BookDao();
    	Book b = bd.displayById(1);
    	System.out.println(b);
    }
}
