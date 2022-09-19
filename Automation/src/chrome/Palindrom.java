package chrome;

public class Palindrom
{
	public static void main(String[] args)
	{
		int n=323,rem,sum=0;
		int c=n;
		while(n>0) 
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(c==sum) 
		{
			System.out.println("Palindrom No"+" "+c);
		}
		else
		{
			System.out.println("Not Palindrom No"+" "+c);
		}
	}

}
