package test_package;

public class RightSide_Equilateral_Triangle 
{
	public static void main(String[] args)
	{
		/*              Line   Spaces Stars
		 *         *     1      5-1     1
		 *        **     2      5-2     2
		 *       ***     3      5-3     3
		 *      ****     4      5-4     4
		 *     *****     5      5-5     5
		 */
		
		 int TotalLines=5;
		 for(int i=1; i<=TotalLines; i++)
		 {
			 for(int j=TotalLines; j>i; j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=i; k++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 
		
			
		  
		
	}

}
