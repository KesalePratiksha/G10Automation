package selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.instagram.com");
		
		Thread.sleep(5000);
		
		driver.navigate().back(); // to perform backward operation
		
		Thread.sleep(3000);
		
		driver.navigate().forward();  // to perform forward operation
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();   // to perform Page reload operation
		
		Thread.sleep(3000);
		
		String URL = driver.getCurrentUrl(); // to get current URL
		
		System.out.println(URL);
		
		String title =driver.getTitle();  // to get title
		
		System.out.println(title);
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.manage().window().minimize(); // to minimize browser window // this is possible after 4.0 version //Method Chaining
	
		Dimension d= new Dimension(500,700);   // to set size of browser // import from selenium
		driver.manage().window().setSize(d);
		
		Point p= new Point(600,300);         // to set position of browser //import from selenium
		driver.manage().window().setPosition(p);
		
		driver.close(); // to close single tab
		
		driver.quit(); // to close browser
		
		 
		 
		 
		
	
		
	
		

		 
		
		
		
	}

}
