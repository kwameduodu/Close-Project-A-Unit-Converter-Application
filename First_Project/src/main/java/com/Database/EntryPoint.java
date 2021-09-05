package com.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controllers.TestController;
import io.javalin.Javalin;

public class EntryPoint {

	public static void main(String[] args) {
		
		
		Javalin app = Javalin.create().start(7770);
//	Connection conn = ConnectionFactory.getConnection();
		

	TestController.init(app);
	
	
	}
}
	
	
//		
//		String sql = "SELECT * FROM test_table";
//		
//		try {
//			  Statement stmt = conn.createStatement();
//	            ResultSet rs = stmt.executeQuery(sql);
//
//	            System.out.println("================ test_table =================");
//	            while(rs.next()) {
//	                System.out.println("string_id: ["
//	                        + rs.getInt("string_id")
//	                        + "]   string: ["
//	                        + rs.getString("string")
//	                        + "]");
//			
//	            }
//	            System.out.println("=============== /test_table =================");
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        }
//	}
//
//}
