package com.hack.problemChallenger.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DaoService {

	static Connection conn = null;
	static PreparedStatement ps = null;
	
	public DaoService() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
		}

		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Infinity", "root", "root");
			if (conn != null) {
				System.out.println("DB conn success");
			} else {
				System.out.println("Failed to make connection!");
			}
		} catch (SQLException e) {
			System.out.println("MySQL Connection Failed!");
			
		}
		}
	
	public static boolean createChallenges(String from_usr,String to_usr,String prob_code)
	{
		try {
			String insertQueryStatement = "INSERT  INTO  Challenges  VALUES  (?,?,?,?,?)";
 
			ps = conn.prepareStatement(insertQueryStatement);
			ps.setInt(1, 0);
			ps.setString(2, from_usr);
			ps.setString(3, to_usr);
			ps.setString(4, prob_code);
			ps.setBoolean(5, false);
 
			// execute insert SQL statement
			ps.executeUpdate();
			System.out.println("Challenge added successfully");
			return true;
		} catch (
 
		SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	public static boolean addNotifications(String from_usr,String to_usr,String prob_code,String status)
	{
		try {
			String insertQueryStatement = "INSERT  INTO  Notifications  VALUES  (?,?,?,?,?)";
 
			ps = conn.prepareStatement(insertQueryStatement);
			ps.setInt(1, 0);
			ps.setString(2, from_usr);
			ps.setString(3, to_usr);
			ps.setString(4, prob_code);
			ps.setString(5, status);
 
			// execute insert SQL statement
			ps.executeUpdate();
			System.out.println("Notifications added successfully");
			return true;
		} catch (
 
		SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}
	
	
	
	
	
}
	
	
