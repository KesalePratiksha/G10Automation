package testCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
		
	}
	
	@Test(priority=1,invocationCount=2)
	public void TestB()
	{
		System.out.println("testB");
	}
	
	
	//@Test(dependsOnMethods= {"TestB","Testc"})
	//public void TestA()
	//{
	//	System.out.println("TestA");
		
	//}
	
	@Test(enabled=false)
	public void Testc()
	{
	
		System.out.println("Testc");
		
	}
	@Test(timeOut=3000)
	public void TestD() throws InterruptedException
	{
		System.out.println("TestD");
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("afterMethod");
		
	}
	
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("afterClass");
	}
}
