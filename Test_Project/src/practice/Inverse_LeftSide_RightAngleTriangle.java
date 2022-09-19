package practice;

public class Inverse_LeftSide_RightAngleTriangle
{
	public static void main(String[] args) 
	{
		/*     Pattern        Lines     Stars
		 *   
		 *     *****            1         5
		 *     ****             2         4                 i- No. of lines
		 *     ***              3         3                 j- No. of Stars
		 *     **               4         2
		 *     *                5         1
		 */
		
		for(int i=1; i<6; i++)
		{
			for(int j=5; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
