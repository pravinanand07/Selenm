package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://facebook.com/");
		WebElement fl = driver.findElement(By.id("email"));
		fl.sendKeys("pravinanand07");
		Actions acc = new Actions(driver);
		acc.doubleClick(fl).perform();
		acc.contextClick(fl).perform();
		Robot lr = new Robot();
		for (int i = 0; i < 4; i++) {
			lr.keyPress(KeyEvent.VK_DOWN);
			lr.keyRelease(KeyEvent.VK_DOWN);
		}
		lr.keyPress(KeyEvent.VK_ENTER);
		lr.keyRelease(KeyEvent.VK_ENTER);
		lr.keyPress(KeyEvent.VK_TAB);
		lr.keyRelease(KeyEvent.VK_TAB);
		lr.keyPress(KeyEvent.VK_CONTROL);
		lr.keyPress(KeyEvent.VK_V);
		lr.keyRelease(KeyEvent.VK_CONTROL);
		lr.keyRelease(KeyEvent.VK_V);
	}

}
