package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrn2Scrld {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/");
		driver.manage().window().maximize();
		WebElement dwn = driver.findElement(By.xpath("//div[@class='wf-container-bottom']"));
		WebElement up = driver.findElement(By.xpath("//div[@class='top-bar-bg']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeAsyncScript("arguments[0].scrollIntoView(true)", dwn);
		Thread.sleep(3000);
		js.executeAsyncScript("arguments[0].scrollIntoView(false)", up);
	}

}
