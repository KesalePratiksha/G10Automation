package Logical_Program;

public class Factorial   // 5!=5*4*3*2*1=120    1*1=1  2*1=2 2*3=6 6*4=24 24*5=120
{
	public static void main(String[] args) 
	{
		int num= 5;
		int factorial=1;
		for(int i=1; i<=num; i++)
		{               // i=1 i=2 i=3  i=4  i=5
			 factorial= factorial*i;  //1*1=1  2*1=2 3*2=6   6*4=24   24*5=120 
		}
		System.out.println("Factorial of No. is:"+ factorial);
	
		
		
		
	}

}
