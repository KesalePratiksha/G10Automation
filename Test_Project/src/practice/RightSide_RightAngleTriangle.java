package practice;

public class RightSide_RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		/*        Pattern    Lines    Stars  
		 * 
		 *            *        1         1
		 *           **        2         2
		 *          ***        3         3
		 *         ****        4         4
		 *        *****        5         5
		 */
		
		int t=5;
		
		for(int i=1; i<=t; i++)
		{
			for(int j=t; j>=i; j--)
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
