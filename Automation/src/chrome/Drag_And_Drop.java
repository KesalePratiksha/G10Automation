 package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Thread.sleep(3000);
		
		Actions act= new Actions(driver);
		
		act.dragAndDrop(draggable, droppable).perform();
		
		
		
		
		
	}

}
