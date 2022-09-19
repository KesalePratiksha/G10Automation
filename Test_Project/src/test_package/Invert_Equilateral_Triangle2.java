package test_package;

public class Invert_Equilateral_Triangle2 
{
	public static void main(String[] args) 
	{

        /*          * * * * *
         *           * * * *
         *            * * *
         *             * *
         *              *
         */


		int t=5;
		for(int i=1; i<=t; i++)
		{
			for(int j=1;j<=i; j++) 
			{
				System.out.print(" ");
			}
			
		
			for(int k=t; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}



		


