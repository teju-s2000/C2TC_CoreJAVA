package com.tns.equalsoperator;

public class EqualsDemo3 {

	public static void main(String[] args) {
		
        String s1 = new String("TEJU");  //new String object for uppercase TEJU
        String s2 = new String("teju");  //new String object for lowercase teju  
        String s3 = null;                //null object
        String s4 = "teju";              //String literal teju
 
         
        System.out.println("Str1 and Str2 are equal : "+(s1.equals(s2)));  
        System.out.println("Str1 and Str4 are equal : "+(s1.equals(s4)));
        System.out.println("Str2 and Str4 are equal : "+(s2.equals(s4)));
        System.out.println("Str4 and Str3 are equal : "+(s4.equals(s3)));
         
    }
}
