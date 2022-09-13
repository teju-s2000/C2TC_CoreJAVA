package com.tns.prog1;

import java.util.Scanner;

public class scannerdemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String name = sc.nextLine();
char gender = sc.next().charAt(0);
System.out.println("Name: "+name);
System.out.println("Gender: "+gender);
}
}