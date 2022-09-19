package test_package;

public class Array                                                            //   04/July/2022
{
	//Syntax of array
	// DataType VariableName  [] = {v1,v2,v3,....vn};  or           Array- used to store multiple data of same type
	// DataType [] VariableName  = {v1,v2,v3.....vn};
	
	public static void main(String[] args)
	{
		         //0,1, 2, 3, 4
		int a[]= {10,20,30,40,50};	
		
		System.out.println(a[0]);
		
		System.out.println(a[1]);
		
		System.out.println(a[2]);
		
		System.out.println(a[3]);
		
		System.out.println(a[4]);
		
		        //  c[0],c[1],c[2],c[3]
		char [] c = {'a','b','c','d'};
		
		 System.out.println(c[1]);
		 
		 System.out.println(c[3]);
		 
		        //      s[0],         s[1],       s[2]
		String[] s = {"Pratiksha" ,"Dashrath" , "Kesale"};
		
		System.out.println(s[0]);
		
		System.out.println(s[1]);
		
		System.out.println(s[2]);
		
	}
}
