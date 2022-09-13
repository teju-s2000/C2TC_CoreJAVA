package com.tns.prog1;


class withdraw
{
	int amt_withdraw = 3000;
}

public class Inheritence1 extends withdraw 
{
	
	int amt_left = 6000;
	public static void main(String[] args)
	{
		Inheritence1 ob1 = new Inheritence1();
		System.out.println("Amount withdraw: "+ ob1.amt_withdraw);
	}
}