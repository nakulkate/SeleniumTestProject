package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
		Thread.sleep(3000);
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='bookFlight']"));
	   radio1.click();
	   System.out.println(radio1.isEnabled());
	   
	}
}

