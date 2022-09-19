package practice;

public class Inverse_RightSide_RightAngleTriangle 
{
	public static void main(String[] args) 
	{
		/*      Pattern      Lines     Stars
		 * 
		 *       *****
		 *        ****
		 *         ***
		 *          **
		 *           *
		 *           
		 */
		
		int t=5;
		
		for(int i=1; i<t; i++)
		{
			for(int j=t; j>i; j--)
			{
				System.out.print("*");
			}
			for(int k=i; k<t; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
