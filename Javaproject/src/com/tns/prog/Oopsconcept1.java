package com.tns.prog;

public class Oopsconcept1 {
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("year of purchase "+2001);
		System.out.println("make " +"Suzuki");
	}
	//TODO add more code here in future
    void disp2() 
    {
    	System.out.println("model " +1999);
      	System.out.println("make " +500000);
    }
    
    public static void main(String[]args) {
   
    	Oopsconcept1 ob1 = new Oopsconcept1();
    	Oopsconcept1 ob2 = new Oopsconcept1();
    	ob1.display1();
    	ob2.disp2();
    }

}


