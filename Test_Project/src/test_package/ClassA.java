package test_package;

public class ClassA {
	
	public static int a=10;           // public access specifier 
	       static int b=20;           //Default access specifier
	private static int c= 30;         // Private access specifier
	protected static int d=40;        //Protected access specifier
	
	public static void xyz()
	{
		System.out.println("Public-Static method of ClassA");
	}
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}

}
