package test_package;

public class while_Loop1
{
	public static void main(String[] args)
	{
		int a=100;
		
		while(a>2)  //100>2-true, 25>2-true,12>2-true, 6>2-true, 3>2-true,1>2-false
		{
			a=a/2; // 100/2=50, 50/2=25,25/2=12, 12/2=6, 6/2=3, 3/2=1
			
			System.out.println(a);// 50,25,12,6,3,1
			
		}
		
	}

}
