package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshWebPage {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();   
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	//driver.navigate().refresh();
	//driver.getCurrentUrl();
	//driver.navigate().to(driver.getCurrentUrl());
	driver.findElement(By.id("username")).sendKeys(Keys.F5);
	//driver.close();
	
	
}
}
