package com.tns.method;

public class staticmethod {

	//Instance area
	static int x = 20;
	int y = 30;
	
	
	//Declare an instance method
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	//Declare an static method
	static void show()
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
    staticmethod st = new staticmethod();

//call instance method
    st.display();

//call static method
   staticmethod.show();
	}

}
