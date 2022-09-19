package Multi_Level_Inheretance;

public class ClassD extends ClassC
{
	public void Division()
	{
		int a=5, b=1, c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		ClassD s = new ClassD();
		s.Addition();
		s.Subtraction();
		s.Multiplication();
		s.Division();
		
	}

}
