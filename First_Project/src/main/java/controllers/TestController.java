package controllers;

import io.javalin.Javalin;
import io.javalin.http.Context;

public class TestController {
	private static Javalin application;
	
	public static void init(Javalin app) {
		application = app;
		
		app.get("/test",TestController::testConnection);
		app.post("/test/:id", TestController::insertTestData);
		
	}
	
	public static void testConnection(Context ctx) {
		
		ctx.status(200);
		ctx.result("Test Received");
	}
	
public static void insertTestData(Context ctx) {
		
	
	
	
	}
	
	
	
}
