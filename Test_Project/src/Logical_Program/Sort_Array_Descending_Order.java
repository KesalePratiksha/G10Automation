package Logical_Program;

public class Sort_Array_Descending_Order
{
	public static void main(String[] args)
	{
		int a[]= {5,2,7,10,6};
		int temp;
		for(int i=0; i<a.length;i++) 
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]< a[j])   // for ascending >
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
						}
			}
			System.out.println(a[i]);//10/7/6/5/2
		}
		
	}

}
