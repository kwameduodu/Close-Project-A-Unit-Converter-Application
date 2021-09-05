package com.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EntryPoint {

	public static void main(String[] args) {
		
	Connection conn = ConnectionFactory.getConnection();
		
		//Create a template for a connection string
		
		//"jdbc:mariadb://database-1<RDA ENDPOINT from AWS RDBS service>:<port>/<DATABASE NAME>?user=<USER NAME>&password=<PASSWORD>
		
		String sql = "SELECT * FROM test_table";
		
		try {
			  Statement stmt = conn.createStatement();
	            ResultSet rs = stmt.executeQuery(sql);

	            System.out.println("================ test_table =================");
	            while(rs.next()) {
	                System.out.println("string_id: ["
	                        + rs.getInt("string_id")
	                        + "]   string: ["
	                        + rs.getString("string")
	                        + "]");
			
	            }
	            System.out.println("=============== /test_table =================");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

}
