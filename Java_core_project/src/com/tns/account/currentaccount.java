package com.tns.account;

public abstract class currentaccount extends Bank_account{
	public currentaccount(int accNo, String accName, float accBal) {
		super(accNo, accName, accBal);
		// TODO Auto-generated constructor stub
	}
	private final float creditLimit = 0;
 
	public abstract float withdraw();
	public abstract String toString();
}


