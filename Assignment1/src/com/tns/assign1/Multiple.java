package com.tns.assign1;
import java.util.Scanner;

public class Multiple
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num%3==0) 
		{
			System.out.println(num+ " is a multiple of 3");
			
		}
		else 
		{
			System.out.println(num+ " is not a multiple of 3");
		}
    }
}
