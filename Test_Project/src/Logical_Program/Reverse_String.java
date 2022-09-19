package Logical_Program;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String str = "PRATIKSHA";
		String rev="";
		
		int length= str.length();  //9
		
		for(int i=length-1; i>=0;i--)     //8 7 6 5 4 3 2 1 0
		{
			rev=rev+str.charAt(i);       // A H S K I T A R P
			
		}
		System.out.println("Reverse string is:  "+ rev);
	}
}
		
