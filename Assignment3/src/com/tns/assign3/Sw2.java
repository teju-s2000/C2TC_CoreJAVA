package com.tns.assign3;

public class Sw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "TEAM";

		switch (name.toLowerCase())
		{
		case "author":
		System.out.println("Vikas");
		break;
		case "team":
		System.out.println("Team Java Full Stack");
		break;
		case "editor":
		System.out.println("Vishnu & Krishna");
		break;
		default:
		System.out.println("Invalid entry");
		break;
	}

}
}
