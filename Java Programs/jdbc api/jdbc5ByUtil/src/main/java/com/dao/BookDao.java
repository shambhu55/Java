package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.model.Book;
import com.util.MyDB;

public class BookDao {

	// Insert Books
	public int insertBook(Book b) {
		int res = 0;
		Connection con = null;
		PreparedStatement pst = null;
		
		con = MyDB.MyConnection();
		String sql = "insert into book(name, price) values (?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, b.getName());
			pst.setDouble(2, b.getPrice());
			res = pst.executeUpdate();
			System.out.println(res);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MyDB.closeCon(pst, con);
		}
		return res;
	}
	
	// delete Book by ID  =============================
	
}
