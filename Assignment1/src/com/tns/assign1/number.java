package com.tns.assign1;
import java.util.Scanner;
public class number
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the number: ");
          int number =sc.nextInt();
          if(number>0)
          {
        	  System.out.println(number+ " is a positive number");
          }
          if(number<0) 
          {
        	  System.out.println(number+ " is a negative number");
          }
          else if(number==0)
          {
        	 System.out.println( "The Entered number is zero ");
          }
	
	}

}
