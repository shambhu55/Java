package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Book;

public class BookDao {

//	public int insertBook(Book b) {
//		int result=0;
//		Connection con = null;
//		PreparedStatement pst = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "insert into book(name, price) values(?,?)";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, b.getName());
//			pst.setDouble(2, b.getPrice());
//			result = pst.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
	
//-------------------------------------------------------
	
	//display
//	public Book findById(int id) {
//		Book b = null;
//		Connection con = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "select id, name, price from Book where id=?";
//			pst = con.prepareStatement(sql);
//			pst.setInt(1, id);
//			rs = pst.executeQuery();
//			while(rs.next()) {
//				b = new Book();
//				b.setId(rs.getInt("id"));
//				b.setName(rs.getString("name"));
//				b.setPrice(rs.getDouble("price"));
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				rs.close();
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return b;
//	}
	
	
	
//-------------------------------------------------------
	// Delete
//	public int deleteBookById(int id) {
//	int result = 0;
//	Connection con = null;
//	PreparedStatement pst = null;
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//		String sql = "delete from book where id=?";
//		pst = con.prepareStatement(sql);
//		pst.setInt(1, id);
//		result = pst.executeUpdate();
//	} catch (ClassNotFoundException | SQLException e) {
//		e.printStackTrace();
//	}finally {
//		try {
//			pst.close();
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	return result;
//}


	
//-------------------------------------------------------
	
//	public int updateById(Book b) {
//		int result = 0;
//		Connection con = null;
//		PreparedStatement pst = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "update book set name=?, price=? where id=?";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, b.getName());
//			pst.setDouble(2, b.getPrice());
//			pst.setInt(3, b.getId());
//			result = pst.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
	
	
	//==================================
	public int insertBook(Book b) {
		
		Connection con = null;
		PreparedStatement pst = null;
		int result = 0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
			String sql = "insert into book(name, price) values (?, ?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, b.getName());
			pst.setDouble(2, b.getPrice());
			result = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	

}
