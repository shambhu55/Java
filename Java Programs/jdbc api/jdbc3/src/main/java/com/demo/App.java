//package com.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Connection con = null;
//    	PreparedStatement pst = null;
//    	int check = 0;
//    	try {
//			Class.forName("com.mysql.cj.jdbc.Driver");	// Step 1
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76","root","shambhu55");		// Step 2
//			String sql = "insert into book(name, price) values(?,?)";		// Step 3
//			pst = con.prepareStatement(sql);	// Step 4
//			pst.setString(1, "Musafir Cafe");
//			pst.setInt(2, 160);
//			check = pst.executeUpdate();	// Step 5
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				pst.close();		// Step 6
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//    	System.out.println(check);
//    }
//}

//package com.demo;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class App{
//	public static void main( String[] args ) {
//		Connection con = null;
//		PreparedStatement pst = null;
//		int result = 0;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");		// Step 1
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");	// Step 2
//			String sql = "insert into book(name, price) values(?,?)";		// Step 3
//			pst = con.prepareStatement(sql);		// Step 4
//			pst.setString(1, "Kashi:The Oldest City");
//			pst.setInt(2, 360);
//			result = pst.executeUpdate();		// Step 5
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				pst.close();		// Step 6
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(result);
//	}
//}


package com.demo;

import com.dao.BookDao;
import com.model.Book;

public class App{
	public static void main( String[] args ) {
		
		// Insert Book
//		BookDao bd = new BookDao();
//		
//		Book b = new Book();
//		b.setName("Life");
//		b.setPrice(160);
//		
//		int result = bd.insertBook(b);
//		System.out.println(result);
		
//==================================

		// Display
//		BookDao bd = new BookDao();
//		
//		Book b = bd.findById(2);
//		System.out.println(b);
		
		
//==================================
		 //Delete by id
//		BookDao bd = new BookDao();
//		int result = bd.deleteBookById(4);
//		System.out.println(result);
		
		
//======================================
		
//		BookDao bd = new BookDao();
//		Book b = new Book();
//		
//		b.setName("Science");
//		b.setPrice(650);
//		
//		System.out.println(bd.insertBook(b));
	}
}





















