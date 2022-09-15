package com.tns.assign1;

import java.util.Scanner;

public class Maximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of A:");  
		int a=sc.nextInt();
		System.out.println("Enter the value of B:");  
		int b=sc.nextInt();
		System.out.println("Enter the value of C:");  
		int c=sc.nextInt();
		
		if(a>b)
		{
			System.out.println("A is greater");
		}
		else if(b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a)
		{
			System.out.println("C is greater");
		}
		else
		{
			System.out.println("All are equal");
		}
	}
}


