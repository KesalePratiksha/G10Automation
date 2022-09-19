package Logical_Program;

public class Duplicate_ElementsFrom_Array 
{
	public static void main(String[] args)
	{
		String a[]= {"Java","c","c++","Python","Java"}; // Duplicate String
	//	int a[]= {5,10,3,2,5};                     // Duplicate no.
		
	    boolean flag= false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
		
		if(a[i]==a[j])
		{
			System.out.println("Found Duplicate Elememt:" +a[i]);
			flag=true;
		}
		
		}
	
	if(flag==false)
{
	System.out.println("Duplicate Element Not Found");
	}
		
		
		
	}
	

}

