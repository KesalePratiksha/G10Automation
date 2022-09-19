package chrome;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy   //Srolling by ScrollBy

	{
		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://jqueryui.com/");
			
		//	driver.manage().window().maximize();
			Thread.sleep(3000);
			JavascriptExecutor jse= (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,700)");// Scroll down
			Thread.sleep(3000);
			
			jse.executeScript("window.scrollBy(0,-700)");   //Scroll up
			Thread.sleep(3000);
			
			jse.executeScript("window.scrollBy(500,0)");   //Scroll right
			Thread.sleep(3000);
			
			jse.executeScript("window.scrollBy(-500,0)");  //Scroll left
			Thread.sleep(3000);
		
	}

}
