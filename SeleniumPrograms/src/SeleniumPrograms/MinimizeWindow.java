package SeleniumPrograms;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		//driver.manage().window().setPosition(new Point(-1000,0));
		Dimension n = new Dimension(360, 592);
		driver.manage().window().setSize(n);
	}
}
