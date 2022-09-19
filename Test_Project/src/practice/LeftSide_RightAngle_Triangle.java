package practice;

public class LeftSide_RightAngle_Triangle 
{
	public static void main(String[] args)
	{
		
		/*    pattern     Lines      Stars
		 *    
		 *    *             1          1
		 *    **            2          2
		 *    ***           3          3
		 *    ****          4          4
		 *    *****         5          5
		 */
		
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
