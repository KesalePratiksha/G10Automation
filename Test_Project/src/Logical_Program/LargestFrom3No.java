package Logical_Program;

public class LargestFrom3No
{
	public static void main(String[] args)
	{
		int a=210;
		int b=110;
		int c=200;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater");
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		
		else if(b>c)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}
		
		
		
		
	}

}
