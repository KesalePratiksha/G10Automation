package Method;

public class DemoClass2 extends DemoClass1
{
	public void ArithmeticOperations()
	{
		System.out.println("Subtraction");
	}
	
	public static void main(String[] args) 
	{
		DemoClass1 d1= new DemoClass1();
		d1.ArithmeticOperations();
		
		DemoClass2 d2= new DemoClass2();
		d2.ArithmeticOperations();
				
		
		
	}

}
