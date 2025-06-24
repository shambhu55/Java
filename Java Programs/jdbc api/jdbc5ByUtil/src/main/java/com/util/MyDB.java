package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyDB {

//	public static Connection MyConnection() {
//		Connection con = null;
//		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		}
//		return con;
//	}
//	
//	public static void closeCon(PreparedStatement pst, Connection con) {
//		try {
//			pst.close();
//			con.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//	
//	public static void closeCon(PreparedStatement pst, Connection con, ResultSet rs) {
//		try {
//			rs.close();
//			closeCon(pst, con);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
	
	public static Connection myCon() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
