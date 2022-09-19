package methodsOf_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected 
	{
		public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.name("email"));
		name.sendKeys("kesaleprati@gmail.com");
		
	    WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Prati123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'New Account')]")).click();
		Thread.sleep(5000);
		

		WebElement FemaleRadioButton = driver.findElement (By.xpath("//label[text()='Female']/following-sibling::input"));
		FemaleRadioButton.click();
		Thread.sleep(2000);
		
		boolean result2= FemaleRadioButton.isSelected();
		System.out.println( result2);
		
		

	}


}
