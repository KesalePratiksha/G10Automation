package gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://mail.google.com/");
		Thread.sleep(2000);
		
		
		WebElement email = driver.findElement(By.id("identifierId"));
	    email.sendKeys("kesaleprati@gmail.com");
		Thread.sleep(2000);
	    WebElement next = driver.findElement(By.linkText("Next"));
	    next.click();
	}
		
		
	}

