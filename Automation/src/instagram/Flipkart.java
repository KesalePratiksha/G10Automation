package instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/account/login?ret=/%5C");
		Thread.sleep(2000);
		WebElement username= driver.findElement(By.xpath("(//*[contains(@type,'text')])[1]"));
	    username.sendKeys("PratikshaK");
		Thread.sleep(5000);
		
		WebElement password= driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		 password.sendKeys("Prati@123");
		 Thread.sleep(5000);
		 
		 WebElement login= driver.findElement(By.xpath("(//*[contains(@type,'submit')])[1]"));
		 login.click();
		 Thread.sleep(2000);
		 
		 
		 
		
		
		
		
	}

}
