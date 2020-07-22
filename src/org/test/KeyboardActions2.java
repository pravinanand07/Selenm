package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https:// http://greenstech.in/selenium-course-content.html");
	driver.findElement(By.id("heading20")).click();
	WebElement ll = driver.findElement(By.xpath("//p[contains(text(),'10+ years')]"));
	System.out.println(ll.getText());
}
}
