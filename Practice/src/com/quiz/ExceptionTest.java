package com.quiz;

public class ExceptionTest {


	
    public static void main(String[] args) {

    	System.out.println(caesarCipher("kwame",2));
    }
    
    public static String caesarCipher(String s, int k) {
    	
    	String result = "";
    	
        int len = s.length();
        for(int x = 0; x < len; x++){
            char c = (char)(s.charAt(x) + k);
            if (c > 'z')
                result += (char)(s.charAt(x) - (26-k));
            else
                result += (char)(s.charAt(x) + k);
        }
        return result;
    	
    }
 ;
  }

