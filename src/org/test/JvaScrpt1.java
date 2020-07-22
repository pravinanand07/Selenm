package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JvaScrpt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://facebook.com");
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		WebElement em = driver.findElement(By.id("email"));
		ja.executeScript("arguments[0].setAttribute('value','pravinanand07')", em);
		WebElement pa = driver.findElement(By.id("pass"));
		ja.executeScript("arguments[0].setAttribute('value','9876543210')", pa);
		WebElement ln = driver.findElement(By.id("u_0_b"));
		ja.executeScript("arguments[0].click()", ln);
	}

}
