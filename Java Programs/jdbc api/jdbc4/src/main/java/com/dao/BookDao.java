package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.Book;
import com.model.Book;

public class BookDao {

	// Delete By ID		=======================================
	public int deleteById(int id) {
		int res = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
			String sql = "delete from Book where id=?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			res = pst.executeUpdate();
			System.out.println(res);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	// Update By Id		==================================
	public int updateById(Book b) {
		int res = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
			String sql = "update Book set name=?, price=? where id=?";
			pst = con.prepareStatement(sql);
			
			pst.setString(1, b.getName());
			pst.setDouble(2, b.getPrice());
			pst.setInt(3, b.getId());
			
			res = pst.executeUpdate();
			System.out.println(res);
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
		return res;
	}
	
	// Display By ID		=================================================== 
	public Book displayById(int id) {
		Book b = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet res = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
			String sql = "select id, name, price from Book where id=?";
			
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			res = pst.executeQuery();
			
			while(res.next()) {
				b = new Book();
				b.setId(res.getInt("id"));
				b.setName(res.getString("name"));
				b.setPrice(res.getDouble("price"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				res.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return b;
	}
	
	// ===========================================
	public Book displayById2(int id) {
		Book book = null;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
			String sql = "select id, name, price from book where id = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setName(rs.getString("name"));
				book.setPrice(rs.getDouble("price"));
			}
			//System.out.println(book);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return book;
	}
	
	// ==============================================
}
