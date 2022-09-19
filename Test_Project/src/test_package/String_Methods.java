package test_package;

public class String_Methods 
{
	public static void main(String[] args)
	{
		String a="Velocity";
		String b="Velocity";
		
		String c=new String("Velocity");  // Memory allocation comparison
		String d=new String ("Velocity");
		System.out.println(a==b);
		System.out.println(c==d);
		
		b="Class";
		System.out.println(a==b);
		
		String f="velocity";
		
		//equals // data comparison
		System.out.println(c.equals(d));
		
		System.out.println("___________________________");
		
		//equalsIgnoreCase   // data comparison by ignoring case
		System.out.println(a.equals(f));
		System.out.println(a.equalsIgnoreCase(f));
		
		//toUpperCase //Convert string data into UPPER Case
		String t=f.toUpperCase();
		System.out.println(t);
		
		//toLowerCase      // convert string into lower case
		String s= a.toLowerCase();
		System.out.println(s);
	}

}
