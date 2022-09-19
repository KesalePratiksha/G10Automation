package Method;

public class Method_OverLoading 
{
	public static void addition(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public static void addition(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void addition(int a, char c)
	{
		System.out.println(c);
	}

}
