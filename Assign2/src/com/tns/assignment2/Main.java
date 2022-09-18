package com.tns.assignment2;

public class Main {

	int x;

	  // Constructor with a parameter
	  public Main(int x) {
	    this.x = x;
	  }

	  // Call the constructor
	  public static void main(String[] args) {
	    Main Ob = new Main(6);
	    System.out.println("Value of x = " + Ob.x);
	  }
}
