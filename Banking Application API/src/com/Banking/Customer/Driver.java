package com.Banking.Customer;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class Driver {
	

	public static void main(String[] args) {
		
		try {
			
			
			//Get a connection to database
			Properties props = new Properties();
			FileReader connectionProperties = new FileReader("src/main/resources/connection.properties");
			props.load(connectionProperties);
		
			String connectionString = "jdbc:mariadb://" + 
					props.getProperty("endpoint")+":"+
					props.getProperty("port") + "/"+ 
					props.getProperty("dbname") + "?user="+
					props.getProperty("username")+ "&password="+
					props.getProperty("password");
			Connection connection = DriverManager.getConnection(connectionString);
			
			
			// create a statement
			Statement stmt = connection.createStatement();
			
			//execute sql query
			ResultSet Rs = stmt.executeQuery("SELECT * FROM Customers");
			
			//process the result set
			while(Rs.next()) {
				
				System.out.println(Rs.getString("Last_name") + "," +Rs.getString("First_Name"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}
