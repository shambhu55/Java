package com.demo;

import com.dao.BookDao;
import com.model.Book;

public class App 
{
    public static void main( String[] args )
    {
        // Insert Book
    	BookDao bd = new BookDao();
    	Book b = new Book();
    	b.setName("Hymen");
    	b.setPrice(199.00);
    	bd.insertBook(b);
    }
}
