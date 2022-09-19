package practice;

public class Nested_If_Else                                          //14/07/2022
{
	public static void main(String[] args)
	{
		int marks=30;
		
		if(marks>=75)
		{
			System.out.println("Take admission to Science");
		
			if(marks>90)
			{
				System.out.println("Div. A");
			}
			else if(marks>80)
			{
				System.out.println("Div B");
			}
			else if(marks>75)
			{
				System.out.println("Div C");
			}
		}
		
		else if(marks>60)
		{
			System.out.println("Take admission to Commerse");
			
			 if(marks>70)
			 {
				 System.out.println("Div A");
			 }
			 else if(marks>65)
			 {
				 System.out.println("Div B");
			 }
			 else if(marks>60)
			 {
				 System.out.println("Div C");
			 }
		}
		
		else if(marks>40)
		{
			System.out.println("Take admission to Art");
			if(marks>55)
			{
				System.out.println("Div A");
			}
			else if(marks>50)
			{
				System.out.println("Div B");
			}
			else if(marks>45)
			{
				System.out.println("Div C");
			}
		}
		
		else if(marks<35)
		{
			System.out.println("You are Fail");
		}
	
	
	
		
	}

}
