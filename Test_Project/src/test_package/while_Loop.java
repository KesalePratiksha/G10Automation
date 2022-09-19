package test_package;

public class while_Loop 
{
	public static void main(String[] args) 
	{
		int a=100;
		
		while(a>2) //100>2-true 50>2-true,12>2-true, 6>2-true, 1>2-false
		{
			System.out.println(a);// 100, 50,12,3, so 1 is not printing
		
		a=a/2;   // 50,25,12,6,1
		}
	}

}
