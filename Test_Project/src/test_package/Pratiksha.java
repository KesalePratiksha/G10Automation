package test_package;

public class Pratiksha 
{
	static int a;
	static float b;
	static String f;
	static char  c;
	
	
	
	
	Pratiksha()        // zero argument
	{
    		a=2;
     		b=3.2f;
    	f=" Pratiksha Kesale";
    	c ='s';
	}
	
	Pratiksha(int x, char y)    // with argument
	{
		  int d = x+y;
	  System.out.println(d);
	 
	}
	public static void main(String[] args)
	{
		new Pratiksha();            // constructor calling without argument
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(c);
	
	
    new Pratiksha(10, 'a');        // constructor calling with argument
	}
}
