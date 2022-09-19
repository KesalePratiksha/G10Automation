package Logical_Program;

public class ArmstrongNo_using_WhileLoop
{ 
	/* Armstrong No.
	 * 153=(1^3)+(5^3)+(3^3)               1. 153%10, rem=3  153/10=15
	 *    =1+125+27                        2. 15%10,  rem=5   15/10=1 
	 *    =153                             3. 1%10,   rem=1    1/10=0
	 *    
	 *    153%10=3
	 */
	
	public static void main(String[] args)
	{
		int n1=153;
		int n=n1;
		int rem=0;
		int addResult=0;
		
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			
		addResult=addResult+(rem*rem*rem);
		
		}
		
		   if (n1==addResult)
		   {
			  System.out.println(n1+" is Armstrong No.");
		   }
		  else
			  
		   {
			  System.out.println(n1+" is not armstrong No.");
		   }
		
		
	}

}
