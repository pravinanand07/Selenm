package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseCodePom {
    
	static WebDriver driver;
	public static void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void url(String url) {
		driver.get(url);
	}
	public static void fill(WebElement e, String n) {
		e.sendKeys(n);
	}
}
