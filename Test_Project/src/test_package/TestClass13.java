package test_package;

public class TestClass13 
{
	public static void main(String[] args)
	{
		/*    Equilateral Triangle  
		 * 
		 *             *
		 *            ***
		 *           *****
		 *          *******
		 *         *********
		 */
		
		int TotalLines=5;
		for(int i=1; i<=TotalLines; i++)
		{
			for(int j=TotalLines; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=2*i-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
				
		}
		
	}

}
