package Logical_Program;
                                      // n1 n2 n1  n2    
public class Fibonacii_Series  // 0 1    0+1=1  1+1=2    2+1=3
{
	public static void main(String[] args) 
	{
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1);
		System.out.println(n2);
		
		for(int i=0; i<=5; i++)
		{
			sum=n1+n2;
			System.out.println(sum);
			n1=n2;
			n2=sum;
			
		}
		
	
	}

}
