package test_package;

public class Method_Overloading 
{
	public static void addition(int x, int y)        //Method overloading
	{
		int c= x+y;
		System.out.println(c);
	}
	
	public static void addition (int x, int y, int z)
	{
		int c= x+y+z;
		System.out.println(c);
	}
	
	public static void addition (char x, int y)
	{
		int c= x+y;
		System.out.println(c);
	}
	
	public static void main(String[] args) //system defined method
	{
		addition(10,40);
		addition(20,60,70);
		addition('s',2);
	}
	
}