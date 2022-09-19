package test_package;

public class RightSide_Inverted_Equilateral_Triangle
{
	public static void main(String[] args)
	{   /*              line   spaces   star         i used to no. of lines
	     *      *****     1      0        5          j used to no. of stars
	     *       ****     2      1        4          k used to no. of spaces
	     *        ***     3      2        3
	     *         **     4      3        2
	     *          *     5      4        1
	     */
		int t=5;
		
		for (int i=1; i<=t; i++)                
		{
			for (int j=t; j>=i; j-- )      //no. of stars decreasing
			{
				System.out.print("*");
			}
			System.out.println();            //new line
			for(int k=1; k<=i; k++)         // no. of spaces increasing
			{
				System.out.print(" ");        
			}
		}
	}
}
