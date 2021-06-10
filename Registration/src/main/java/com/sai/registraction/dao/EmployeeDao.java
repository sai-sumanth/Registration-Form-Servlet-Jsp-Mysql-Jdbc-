package com.sai.registraction.dao;

import java.sql.*;
import java.sql.SQLException;
import java.sql.DriverManager;

import com.sai.registraction.model.Employee;

public class EmployeeDao {
	
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee" +
				"(id, firstname,lastname,username,password,address,contact) VALUES"+
				"(?,?,?,?,?,?,?);";
		
		int result=0;
		
			Class.forName("com.mysql.jdbc.Driver");  
			try (Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee?" +
                    "user=root&password=saisumanth9");  
			PreparedStatement preparedStatement=connection.prepareStatement(INSERT_USERS_SQL)) {
				preparedStatement.setInt(1, employee.getId());
				preparedStatement.setString(2, employee.getFirstname());
				preparedStatement.setString(3, employee.getLastname());
				preparedStatement.setString(4, employee.getUsername());
				preparedStatement.setString(5, employee.getPassword());
				preparedStatement.setString(6, employee.getAddress());
				preparedStatement.setInt(7, employee.getContact());
				
				System.out.println(preparedStatement);
				result=preparedStatement.executeUpdate();
				
				
			}
			catch(SQLException e) {
				System.out.println("SQLException: " + e.getMessage());
			    System.out.println("SQLState: " + e.getSQLState());
			    System.out.println("VendorError: " + e.getErrorCode());
			}
			return result;
		}
	

}
