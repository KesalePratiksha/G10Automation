package test_package;

public class Three_Diamensional_Array        //MultiDiamentional  array
{
	public static void main(String[] args)
	{
		int a[][][]= {{{10,20,30,40,50},{60,70,80,90,100},{110,120,130,140,150}}};
		
		System.out.println(a[0][0][2]);
		System.out.println(a[0][1][1]);
		System.out.println(a[0][2][3]);
		
	}

}
