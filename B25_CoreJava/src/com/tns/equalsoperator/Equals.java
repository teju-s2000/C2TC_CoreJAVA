package com.tns.equalsoperator;

public class Equals {

	public static void main(String[] args) {
		
        int a = 7;
        int b = -3;
        int c = 7;
         
        if(a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are Not equal");
        }   
 
        if(c == a) {
            System.out.println("a and c are equal");
        }else {
            System.out.println("a and c are not equal");
        }         
    }
}
