package com.jocata.ssp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jocata.ssp.base.ExtentTestManager;
import com.relevantcodes.extentreports.LogStatus;


public class ContactJocataDatabase {
	
	public static String user = "Raghu";

	private static Connection connection;
	private static Statement statement;
	private static ResultSet rs;

	public static void setUp() {
		String databaseURL = "jdbc:mysql://35.154.69.220:3306/evoke_ssp";
		String Username = "read-only";
		String Password = "dxhAsL@9";
		connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to Database...");
			connection = DriverManager.getConnection(databaseURL, Username, Password);
			if (connection != null) {
				System.out.println("Connected to the Database...");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}

	public  static String getEmployeesFromDataBase() {
	
			
			setUp();
			
			String EmpName=null;
			try {
			String query = "SELECT NAME FROM `tbl_contact_us` ORDER BY `contactus_id` DESC LIMIT 1";
			statement = connection.createStatement();
			rs = statement.executeQuery(query);

			while (rs.next()) {
				// int EmpId= rs.getInt("empid");
				 EmpName = rs.getString("NAME");
				// String EmpAddress=rs.getString(3);
				// String EmpDept=rs.getString("lastname");
				// Double EmpSal= rs.getDouble(5);
				// System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
				// System.out.println(EmpId+"\t"+EmpName+"\t"+EmpDept);

				System.out.println(EmpName);// 3

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return EmpName;
	}

	public void tearDown() {
		if (connection != null) {
			try {
				System.out.println("Closing Database Connection...");
				connection.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		/*ContactJocataDatabase se = new ContactJocataDatabase();

		se.setUp();
		se.getEmployeesFromDataBase();
		se.tearDown();*/

	String userdetails=	ContactJocataDatabase.getEmployeesFromDataBase();
		
	System.out.println("User Details..."+userdetails);
	
	
	

	
	}

}
