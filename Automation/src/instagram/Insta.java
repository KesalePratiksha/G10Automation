package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new  ChromeDriver();
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		Thread.sleep(3000);
	//	driver.manage().window().maximize();
	//	Thread.sleep(2000);
	//	driver.manage().window().minimize();
	//	Thread.sleep(2000);
  //      WebElement username=driver.findElement(By.name("username"));
	//	username.sendKeys("PratikshaK");
	//	Thread.sleep(3000);
	//	WebElement password=driver.findElement(By.name("password"));
	//	password.sendKeys("Pratiksha@123");
	//	Thread.sleep(2000);
//		WebElement username= driver.findElement(By.xpath("//input[@name='username']"));
//		 username.sendKeys("Pratiksha");
//		 Thread.sleep(3000);
//		 
//		 
//		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//		 password.sendKeys("Prati@123");
//		 Thread.sleep(3000);
//		 
//		 WebElement login = driver.findElement(By.xpath("//div[text()='Log In']"));
//		 login.click();
//		 Thread.sleep(3000);
		 
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Pratiksha");
		 Thread.sleep(3000);
		 
		 
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Prati@123");
		 Thread.sleep(3000);
		 
//		 
//		 WebElement loginButton =driver.findElement(By.xpath("//button//div[text()='Log In']"));
//		  Thread.sleep(2000);
		 
//		  String text=loginButton.getText();
//		  System.out.println(text);
		 
//		  String ExpectedText="Log In";
//		  if(text.equals(ExpectedText)) 
//		  {
//			  System.out.println("Test Case is Pass");
//		  }
//		  else
//		  {
//			  System.out.println("Test Case is Fail");
//		  }
		 
		 WebElement LoginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		 
		 boolean result=LoginButton.isEnabled();
		 
		 if(result==true)
		 { LoginButton.click();
		 System.out.println("This button is enabled");
		 }
		 else
		 {
			 System.out.println("Button is disabled");
		 }
		 Thread.sleep(1000);
		 

		 
		
		

		 
		
		
		
		
		
		
	}

}
