package Logical_Program;

public class String_Into_Sequence_Of_Character 
{
	public static void main(String[] args) 
	{
		String a="Pratiksha";

		for(int i=0; i<a.length();i++)
		{
			char ch=a.charAt(i);
			System.out.println(" position@ "+i+" Character "+ch);
		}
		
	 }

}