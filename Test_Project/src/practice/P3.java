package practice;

public class P3
{
	public static void main(String[] args) 
	{
		int t=5;
		
		for(int i=1; i<=t; i++)
		{
			for(int j=t; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i=1; i<=t; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=t; k>i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
