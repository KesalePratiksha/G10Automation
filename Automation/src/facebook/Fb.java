package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("kesaleprati@gmail.com");
		
        WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Prati123");
		Thread.sleep(3000);
		
//		WebElement loginbutton =driver.findElement(By.id("loginbutton"));
//		loginbutton.click();
//		Thread.sleep(5000);
//		
//		WebElement loginbutton1=driver.findElement(By.tagName("input"));
//		loginbutton1.click();
//		Thread.sleep(5000);
////		
//     	WebElement signupbutton=driver.findElement(By.partialLinkText("Sign"));
//		signupbutton.click();
//		Thread.sleep(5000);
//		
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(5000);
		
		
	
		
	
//		WebElement CustomRadioButton = driver.findElement (By.xpath("//label[text()='Custom']/following-sibling::input"));
//		CustomRadioButton.click();
//		Thread.sleep(2000);
//		
//		
//		boolean result= CustomRadioButton.isSelected();
//		System.out.println(result );
//		
//		WebElement MaleRadioButton = driver.findElement (By.xpath("//label[text()='Male']/following-sibling::input"));
//		MaleRadioButton.click();
//		Thread.sleep(2000);
//		
//    	boolean result1= MaleRadioButton.isSelected();
//		System.out.println( result1);
//		
		
    	WebElement FemaleRadioButton = driver.findElement (By.xpath("//label[text()='Female']/following-sibling::input"));
		FemaleRadioButton.click();
    	Thread.sleep(2000);
    	
    	boolean result2= FemaleRadioButton.isSelected();
		System.out.println( result2);
		
	
		
		
		
		
		
		
		
		
		
		
		
		

    }
}
