package test_package;

public class Variables 
{
	//Global variables
	static int a=10;      //Static variables or class variables
	int b=20;             //Non-static variables or Instance variables
	
	Variables()
	{
		int p=40;
	}
	static void demo(int m)    //Local Variable
	{
		int j=90;               // Local Variable
		
		System.out.println(j);
		m=50;
		System.out.println(m);
	}

}
