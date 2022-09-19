package test_package;

public class Constructor 
{
	
	
		static byte a;
		static float b;
		static char c;
		static boolean d;
		static String e;
		
		Constructor()           // without argument  constructor
		{
			a=10;
			b=30.50f;
			c='s';
			d= true;
			e="Velocity";
		}
		
		Constructor(int r)       // with argument constructor
		{
			a=20;
			b=40.80f;
			c='q';
			d=false;
			e="Testing";
		}
		
		public static void main(String[]args)
		{
			System.out.println(a);
			
		System.out.println("------------------------");
		
		
		new Constructor();            //Constructor calling
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	System.out.println("------------------------------");
	
	new Constructor(20);            //Constructor calling
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
		}
		
   

  }

