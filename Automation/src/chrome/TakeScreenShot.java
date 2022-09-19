package chrome;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TakeScreenShot 
{
	public static void TimeandDate(WebDriver driver) throws IOException
	{
		
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY HH-mm-sss");
        String timestamp = sdf.format(d);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\Pratiksh\\OneDrive\\Pictures\\Screenshots\\pp"+timestamp+".jpeg");
		FileHandler.copy(source, dest);

	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		TakeScreenShot.TimeandDate(driver);
		Thread.sleep(5000);
		
		WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		button.click();
		TakeScreenShot.TimeandDate(driver);
		Thread.sleep(5000);
		
		WebElement Day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(Day);
		s1.selectByIndex(1);
		TakeScreenShot.TimeandDate(driver);
		Thread.sleep(5000);

		WebElement Month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(Month);
		s2.selectByValue("4");
		TakeScreenShot.TimeandDate(driver);
		Thread.sleep(5000);
		
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(Year);
		s3.selectByVisibleText("2000");
		TakeScreenShot.TimeandDate(driver);
		
	}

}