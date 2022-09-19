package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsDisplayed
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(5000);
		WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Create New')]"));
		button.click();
		Thread.sleep(8000);
		WebElement CustomButton=driver.findElement(By.xpath("//label[text()='Custom']/following-sibling::input"));	
	    CustomButton.click();
		Thread.sleep(3000);
//		boolean result = CustomButton.isSelected();
//		System.out.println( result ); 
		////select[@aria-label='Select your pronoun']
		WebElement pronoun =driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		Select s2=new Select(pronoun);
		s2.selectByIndex(1);
		Thread.sleep(3000);
		WebElement Gender=driver.findElement(By.xpath("//input[@name='custom_gender']"));	
	    boolean result1= Gender.isDisplayed();////input[@name='custom_gender']/preceding-sibling::div
	    System.out.println( result1 ); 
	    if(result1==true) 
	    {
	    	Gender.sendKeys("test");	    	
	    }
	}

}


