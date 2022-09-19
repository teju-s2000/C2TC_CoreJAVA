package com.tns.method;

public class volume {

void volume(int s) {
	
	int cube = s*s*s;
	
	System.out.println("Volume of cube is: "+cube);
}

void volume(double r) {
	
	double sphere = (4/3)*3.14*r*r*r;
	
	System.out.println("Volume of sphere: "+sphere);
	
}

void volume(int l,int b,int h) {
	
	int cuboid = l*b*h;
	
	System.out.println("Volume of cuboid: "+cuboid);
}
public static void main(String[] args)
{
volume ob = new volume();
ob.volume(4);
ob.volume(2.0);
ob.volume(2,4,3);

}
}
