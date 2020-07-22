package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.shopclues.com/wholesale.html");
	WebElement ky = driver.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
	WebElement lg = driver.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
	Actions kcc = new Actions(driver);
	kcc.moveToElement(ky).perform();
	kcc.moveToElement(lg).click();
}
}
