package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.navigate().to("https://kite.zerodha.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("userid"));
		username.sendKeys("Admin");
	    Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin123");
		Thread.sleep(2000);
	    WebElement next = driver.findElement(By.partialLinkText("Login "));
	    next.click();
	}

}
