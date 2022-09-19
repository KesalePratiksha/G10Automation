package test_package;

public class TestClass10 
{
	public static void main(String[] args)
	{
		/*    Pattern      Lines    Stars       
		 *     *****         1       5         5-1               i used for no. of lines
		 *     ****          2       4         5-2               j used for no. of stars
		 *     ***           3       3         5-3
		 *     **            4       2         5-4
		 *     *             5       1         5-5
		 *     
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
