package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JvaScrpt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		JavascriptExecutor ja = (JavascriptExecutor)driver;
		WebElement il = driver.findElement(By.id("username"));
		ja.executeScript("arguments[0].setAttribute('value','pravinanand07')", il);
		WebElement ss = driver.findElement(By.id("password"));
		ja.executeScript("arguments[0].setAttribute('value','9876543210')", ss);
		WebElement gn = driver.findElement(By.id("u_0_b"));
		ja.executeScript("arguments[0].click()", gn);
		Object text = ja.executeScript("return arguments[0].getAttribute('value')", il);
		System.out.println(text);
	}

}
