package chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_Up  //Alert
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		Thread.sleep(3000);
		
		WebElement submit= driver.findElement(By.xpath("//input[@type='submit']"));
		 submit.click();
		 Thread.sleep(3000);
		 
		 
		 Alert alt= driver.switchTo().alert();
		// alt.accept();
		 
		// alt.dismiss();
		 String text=alt.getText();
		 System.out.println(text);
		 
		 
		
	}

}
