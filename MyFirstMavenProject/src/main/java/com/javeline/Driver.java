package com.javeline;

import io.javalin.Javalin;

public class Driver {
    public static void main(String[] args) {
    	
        Javalin app = Javalin.create().start(7700);
        
        app.get("/hello" , eee -> eee.html("welcome page"));
        
    }
}