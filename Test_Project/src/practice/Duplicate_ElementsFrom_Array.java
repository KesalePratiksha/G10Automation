package practice;

public class Duplicate_ElementsFrom_Array
{
	public static void main(String[] args)
	
	{
		boolean flag=false;
		 char a []= {'P','Q','A','S','O','P'};
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
		          System.out.println("Duplicate Element Found:"+ a[i]);
				
			flag=true;
				}
		    }
		}
			
		
	
	if(flag==false)
	       {
		      System.out.println("Duplicate Element Not found");
	       }
	}
		

}

