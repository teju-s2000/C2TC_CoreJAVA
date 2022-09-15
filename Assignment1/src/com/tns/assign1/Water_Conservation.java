package com.tns.assign1;
import java.util.Scanner;

public class Water_Conservation
{
	
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			// TODO Auto-generated method stub
			int wc=sc.nextInt();
			if(wc <= 45) {
				System.out.println("No tax");
			}
			else if(wc < 75 && wc > 45) {
				System.out.println("Tax:475");
			}
			else if(wc < 125 && wc > 75){
				System.out.println("Tax:750");
			}
			else if(wc < 200 && wc > 125) {
				System.out.println("Tax:1225");
			}
			else if(wc < 350 && wc > 200) {
				System.out.println("Tax:1650");
			}
			else {
				System.out.println("Tax:2000");
			}
		}
}
