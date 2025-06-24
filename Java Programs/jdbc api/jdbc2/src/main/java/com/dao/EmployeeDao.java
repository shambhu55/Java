package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Employee;
import com.util.MyDatabase;

public class EmployeeDao {

	// insert Employee to table
	public int insertEmployee(Employee e) {
		int result = 0;
		String sql = "insert into Employee(name, designation, company, salary) values(?,?,?,?)";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql)){
			pst.setString(1, e.getName());
			pst.setString(2, e.getDesignation());
			pst.setString(3, e.getCompany());
			pst.setDouble(4, e.getSalary());
			
			result = pst.executeUpdate();
		}catch(SQLException e1) {e1.printStackTrace();}
		return result;
	}
	
	// delete employee from table
	public int deleteEmployeeById(int id) {
		int result = 0;
		String sql = "delete from employee where id=?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1,  id);
			result = pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// Display Employee by Id
	public Employee findEmployeeById(int id) 
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee where id = ?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setInt(1,  id);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		return (list.isEmpty())?null:list.get(0);
	}
	
	
	// find all Employee
	public List<Employee> findAllEmployee()
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// Update Employee
	public int updateEmployee(Employee e)
	{
		int result = 0;
		String sql = "update Employee set name=?, designation=?, company=?, salary=? where id=?";
		try(Connection con=MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, e.getName());
			pst.setString(2, e.getDesignation());
			pst.setString(3, e.getCompany());
			pst.setDouble(4, e.getSalary());
			pst.setInt(5, e.getId());
			result = pst.executeUpdate();
		}catch(SQLException e1) {
			e1.printStackTrace();
		}
		return result;
	}

	
	// Find Employee on condition
	public List<Employee> findEmployeeBySalaryLessThan(double salary){
		List<Employee> list = new ArrayList();
		String sql = "Select id, name, designation, company, salary from Employee where salary<?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setDouble(1,  salary);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// Find Employee Between Salary
	public List<Employee> findEmployeeBySalaryBetween(double low, double high){
		List<Employee> list = new ArrayList();
		String sql = "Select id, name, designation, company, salary from Employee where salary between ? and ?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setDouble(1,  low);
			pst.setDouble(2,  high);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// Find Employee not Between Salary
	public List<Employee> findEmployeeBySalaryNotBetween(double low, double high){
		List<Employee> list = new ArrayList();
		String sql = "Select id, name, designation, company, salary from Employee where salary not between ? and ?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setDouble(1,  low);
			pst.setDouble(2,  high);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	// Find Employee by name and Company
	public  List<Employee> findEmployeeByNameAndCompany(String name, String company)
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee where name=? and company=?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, name);
			pst.setString(2, company);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	// Find Employee by name or Company
	public  List<Employee> findEmployeeByNameOrCompany(String name, String company)
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee where name=? or company=?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, name);
			pst.setString(2, company);
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	// find Employee By Name like
	public  List<Employee> findEmployeeByNameLike(String name)
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee where name like ?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, "%"+name+"%");
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	// find by any
	public  List<Employee> findByAny(String s1)
	{
		List<Employee> list = new ArrayList();
		String sql = "select id, name, designation, company, salary from Employee where id like ? or name like ? or designation like ? or company like ? or salary like ?";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql);){
			pst.setString(1, "%"+s1+"%");
			pst.setString(2, "%"+s1+"%");
			pst.setString(3, "%"+s1+"%");
			pst.setString(4, "%"+s1+"%");
			pst.setString(5, "%"+s1+"%");
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// display all name
	public List<String> findAllName()
	{
		List<String> list = new ArrayList();
		String sql = "select name from Employee";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery();){
			while(rs.next())
				list.add(rs.getString("name"));
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	
	// display all name and company
	public Map<String, List<String>> findCompanyAndDesignation()
	{
		Map<String, List<String>> m = new HashMap();
		String sql = "select company,designation from Employee";
		try(Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery();){
			List<String> list1 = new ArrayList();
			List<String> list2 = new ArrayList();
			while(rs.next())
			{
				list1.add(rs.getString("company"));
				list2.add(rs.getString("designation"));
			}
			m.put("listOfCompanies", list1);
			m.put("listOfDesignations", list2);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	
	// Highest Salary
	public double findHighestSalary()
	{
		double salary = 0;
		String sql = "select max(salary) as salary from Employee";
		try (Connection con = MyDatabase.createConnection(); PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery();){
			while(rs.next())
				salary = rs.getDouble("salary");
		}catch(SQLException e) {e.printStackTrace();}
		return salary;
	}
	
	
	//Highest salary Employee 
	public List<Employee> findHighestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select max(salary) as salary from Employee)";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	
	// Second Highest Salary Employee
	public List<Employee> findSecondHighestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select max(salary) from Employee where salary <(select max(salary)  from Employee))";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	
	// third Highest Salary Employee
	public List<Employee> findThirdHighestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select max(salary) from Employee where salary <(select max(salary)  from Employee where salary < (select max(salary)  from Employee)))";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	
	// Lowest Salary Employee
	public List<Employee> findLowestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select min(salary) as salary from Employee)";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	
	public List<Employee> findSecondLowestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select min(salary) from Employee where salary >(select min(salary)  from Employee))";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	
	
	public List<Employee> findThirdLowestSalaryEmployee()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select min(salary) from Employee where salary >(select min(salary)  from Employee where salary > (select min(salary)  from Employee)))";
		
		try(Connection con = MyDatabase.createConnection(); 
				PreparedStatement pst = con.prepareStatement(sql); 
				ResultSet rs = pst.executeQuery();){
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
	
	//Highest salary Employee 
	public List<Employee> findHighestSalaryEmployeeInCompany()
	{
		List<Employee> list = new ArrayList();
		double salary = 0;
		String sql = "select id, name, designation, company, salary from Employee where salary = (select max(salary) as salary from Employee where company = 'Spacex') and company = 'Spacex'";
		
		try(Connection con = MyDatabase.createConnection();
				PreparedStatement pst = con.prepareStatement(sql);){
			ResultSet rs = pst.executeQuery();
			list.addAll(MyDatabase.employeeRowMapper(rs));
		}catch(SQLException e) {e.printStackTrace();}
		return list;
	}
}






















