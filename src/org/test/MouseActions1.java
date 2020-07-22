package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.gettyimages.in/");
	WebElement fc = driver.findElement(By.xpath("//a[@class='text-link--sly action--with-emphasis is-selected']"));
	WebElement cl = driver.findElement(By.xpath("//a[contains(text(),'Entertainment')]"));
	Actions ac = new Actions(driver);
	ac.moveToElement(fc).perform();
	ac.moveToElement(cl).click();
	
	
	
}
}
