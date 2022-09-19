package practice;

public class P4 
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
			for(int k=1;k<=(2*i-1);k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
