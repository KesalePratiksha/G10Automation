package Logical_Program;

public class Sort_Array_Ascending_order 
{
	public static void main(String[] args)
	{
		int a[]= {5,2,7,10,6};
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
		
		
		
	}

}
