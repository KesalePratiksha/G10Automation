package Logical_Program;

import java.util.Scanner;

public class Armstrong_Nousing_ForLoop 
{
	public static void main(String[] args) 
	{
	   // Scanner s= new Scanner(System.in);
	  // System.out.println("Enter the Number: ");
	//   int num= s.nextInt();
		
		for(int num =1; num<1000; num++)
		{
			int num2=num;
			int counter=num;
			int temp=num;
			int rem=0;
			double add=0;
			int n=0;
			while(counter>0)
			{
				n++;
				counter=counter/10;
				
			}
			while(temp!=0)
			{
				rem=temp%10;
				temp=temp/10;
				
			add= add+(Math.pow(rem, n));
			}
			if(add==num2)
			{
				System.out.println(num2+" is Armstrong Number");
			}
			
		}
		
	}

}
