package test_package;

public class Solid_Invert_Equilateral_Triangle
{
	public static void main(String[] args)
	{
		/*             Pattern       Lines    Stars      Spaces
		 *            *********        1        9           1
		 *             *******         2        7           2
		 *              *****          3        5           3
		 *               ***           4        3           4
		 *                *            5        1           5 
		 */
		

		int row=5;
		for(int i=1; i<=row; i++)  // i=1  1<=5-true  / i=2  2<=5-true   / i=3 3<=5-true
		{
			for(int j=1; j<i; j++ )// j=1  1<1-false / j=1 1<2-true j++ j=2 2<2-false / j=1 1<3-true j++ j=3 3<2-true 3<1-true
			{
				System.out.print(" ");    // 1 space j++  / 2 Spaces j++
			}
			for(int k=1; k<=2*(row-i)+1; k++) // k<= 2*(5-1)+1 k++ k=10   /  k=1 k<=2*(5-2)+1  k++ k=8 /  
			{                                 // 1<=9  true *********      /    1<=7 -true      8<=7-false /
				System.out.print("*");
			}
			System.out.println();
	
		}
		
	}
	
}
		
		
		
		
		




	
	                
		


