package com.tns.equalsoperator;

public class Demo_of_Equals {
	
	public static void main(String[] args) {
		
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");        
         
        //returning ‘false’ because the ‘==’ operator is comparing references of objects s1 and s2,
        System.out.println("s1 and s2 are equal : "+(s1==s2));   //s1 and s2 are different objects, so have different addresses.
        
        //equals () method compares the content of objects s1 and s2,hence returns true.
        System.out.println("s1 and s2 are equal : "+(s1.equals(s2)));  
 
        
        //we are assigning s2 to s1, this changes the reference address of s2 to the same as s1.
        s1 = s2;  //Both are having same object address
        System.out.println("s1 and s2 are equal : "+(s1==s2)); //equals () method is "overridden"
}
}
