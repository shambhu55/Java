package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.MyDatabase;

public class StudentDao {
	
//	public int insertStudent(Student s) {
//		int result = 0;
//		Connection con = null;
//		PreparedStatement pst = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "insert into Student(name, city, percentage)values(?,?,?)";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, s.getName());
//			pst.setString(2, s.getCity());
//			pst.setDouble(3, s.getPercentage());
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
//	
//	
//	public int deleteStudentById(int id){
//		int result = 0;
//		Connection con = null;
//		PreparedStatement pst = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "delete from Student where id = ?";
//			pst = con.prepareStatement(sql);
//			pst.setInt(1, id);
//			result = pst.executeUpdate();
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
//	
//	
//	public Student findStudentById(int id) {
//		Student s = null;
//		Connection con = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "select id, name, city, percentage from Student where id=?";
//			pst = con.prepareStatement(sql);
//			pst.setInt(1, id);
//			rs = pst.executeQuery();
//			
//			while(rs.next()) {
//				s = new Student();
//				s.setId(rs.getInt("id"));
//				s.setName(rs.getString("name"));
//				s.setCity(rs.getString("city"));
//				s.setPercentage(rs.getDouble("percentage"));
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return s;
//	}
//	
//	
//	public List<Student> findAllStudent(){
//		List<Student> list = new ArrayList();
//		Connection con = null;
//		PreparedStatement pst = null;
//		ResultSet rs = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "select id, name, city, percentage from Student";
//			pst = con.prepareStatement(sql);
//			rs = pst.executeQuery();
//			
//			while(rs.next()) {
//				Student s = new Student();
//				s.setId(rs.getInt("id"));
//				s.setName(rs.getString("name"));
//				s.setCity(rs.getString("city"));
//				s.setPercentage(rs.getDouble("percentage"));
//				list.add(s);
//			}
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		return list;
//	}
//	
//	public int updateStudent(Student s) {
//		int result = 0;
//		Connection con = null;
//		PreparedStatement pst = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap76", "root", "shambhu55");
//			String sql = "update Student set name=?, city=?, percentage=? where id=?";
//			pst = con.prepareStatement(sql);
//			pst.setString(1, s.getName());
//			pst.setString(2, s.getCity());
//			pst.setDouble(3, s.getPercentage());
//			pst.setInt(4, s.getId());
//			
//			result = pst.executeUpdate();
//			
//		} catch (ClassNotFoundException | SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				pst.close();
//				con.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		return result;
//	}
//------------------------------------------------------
	
	public int insertStudent(Student s) {
		int result = 0;
		Connection con = MyDatabase.myConnection();
		PreparedStatement pst = null;
		String sql = "insert into Student(name, city, percentage) values(?,?,?)";
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2, s.getCity());
			pst.setDouble(3, s.getPercentage());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MyDatabase.closeConnection(pst, con);
		}
		return result;
	}
	
	public int deleteStudentById(int id) {
		int result = 0;
		Connection con = MyDatabase.myConnection();
		
		String sql = "delete from Student where id = ?";
		PreparedStatement pst = null;
		try {
			pst=con.prepareStatement(sql);
			pst.setInt(1, id);
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			MyDatabase.closeConnection(pst, con);
		}
		return result;
	}
	
	public Student findStudentById(int id)
	{
		Connection con = MyDatabase.myConnection();
		String sql = "select id, name, city, percentage from Student where id=?";
		PreparedStatement pst = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList();
		try {
			pst = con.prepareStatement(sql);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			list.addAll(MyDatabase.studentRowMapper(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {MyDatabase.closeConnection(rs, pst, con);}
		return (list.isEmpty())?null:list.get(0);
	}
	
	
	public List<Student> findAllStudent()
	{
		List<Student> list = new ArrayList();
		Connection con = MyDatabase.myConnection();
		String sql = "select id,name,city,percentage from Student";
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			list.addAll(MyDatabase.studentRowMapper(rs));
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {MyDatabase.closeConnection(rs, pst, con);}
		return list;
	}
	
	public int updateStudent(Student s) {
		int result = 0;
		Connection con = MyDatabase.myConnection();
		String sql = "update Student set name=?, city=?, percentage=? where id=?";
		PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getName());
			pst.setString(2,  s.getCity());
			pst.setDouble(3,  s.getPercentage());
			pst.setInt(4, s.getId());
			result = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {MyDatabase.closeConnection(pst, con);}
		return result;
	}

}





























