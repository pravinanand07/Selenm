package org.test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrn3scrlDu {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h2[@class='title mb-0 center']")).click();
		driver.findElement(By.xpath("//a[text()='HTC Global Services']")).click();
		driver.findElement(By.id("plugin"));
		TakesScreenshot st1  = (TakesScreenshot)driver;
		File src = st1.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Praveen\\workspace\\Selenm\\scrnpng\\kav.png");
		FileUtils.copyFile(src,dest);
		driver.quit();
	}
	

}

