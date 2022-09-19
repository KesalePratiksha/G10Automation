package pratik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Om {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.whatsapp.com/");
		
	}

}
