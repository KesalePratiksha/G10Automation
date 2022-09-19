package Logical_Program;

public class LargestNoFrom4No 
{
	public static void main(String[] args) 
	{
		
	
	int a= 2;
	int b= 3;
	int c= 50;
	int d= 40;
	
	if(a>b)
	{
        if(a>c)
        {
		
			System.out.println("A is greater");
		}
		else if(a>d)
		{
			System.out.println("A is greater");
		}
		else
		{
			System.out.println("D is greater");
		}
	}
	else if (b>c)
	{
	
		if(b>d)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("D is greater");
		}
	}
		
	else if(c>d)
		{
			System.out.println("C is greater");
		}
		else 
		{
			System.out.println("D is greater");
			
		}
	
		
}

}




