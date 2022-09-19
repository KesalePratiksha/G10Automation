package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRM {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
	    Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
	    WebElement next = driver.findElement(By.id("btnLogin"));
	    next.click();
		
	}

}
