package com.tns.assign1;

import java.util.Scanner;
public class light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int hrs=sc.nextInt();
        if(hrs<18)
        {
            System.out.println("lights on");
        }
        else if(hrs<=24&&hrs>18){
        System.out.println("lights off");    
        }
	}
}

