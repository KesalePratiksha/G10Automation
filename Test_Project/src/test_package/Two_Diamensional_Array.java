package test_package;

public class Two_Diamensional_Array
{
	public static void main(String[] args)
	{
		int a[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		
		System.out.println(a[0][1]);
		System.out.println(a[1][4]);
		
		              //(0,0),(0,1),  (0,2)     (1,1),     (1,2),   (1,3)
		String b[][]= {{"puja","Pawan","Om"},{"Pratiksha","Pratik","Omkar"}};
		
		System.out.println(b[0][2]);
		System.out.println(b[1][1]);
		
		char c[][]= {{'a','b','c','d','e'},{'v','w','x','y','z'}};
		System.out.println(c[0][3]);
		System.out.println(c[1][2]);
		
		float d[][]= {{0.1f, 0.2f},{1.1f, 1.2f}};
		
		System.out.println(d[0][0]);
		System.out.println(d[1][1]);
		
		double e[][]= {{10.1, 10.2},{20.1, 20.2}};
		
		System.out.println(e[1][1]);
		
	}

}
