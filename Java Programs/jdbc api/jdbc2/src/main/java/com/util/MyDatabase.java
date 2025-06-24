package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class MyDatabase {
	
	public static Connection createConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	//Row Mapper class
		public static List<Employee> employeeRowMapper(ResultSet rs) throws SQLException{
			
			List<Employee> list = new ArrayList();
			while(rs.next()) 
			{
				Employee e = new Employee();
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setDesignation(rs.getString("designation")); 
				e.setCompany(rs.getString("company"));
				e.setSalary(rs.getDouble("salary"));
				list.add(e);
			}
			rs.close();	// it is used when we are working with display
			return list;
		}
}
