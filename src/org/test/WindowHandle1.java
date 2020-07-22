package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphonex" +Keys.ENTER);
        driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
        String p1 = driver.getWindowHandle();
        Set<String> c1 = driver.getWindowHandles();
        for (String x : c1) {
			if (!p1.equals(x)) {
				List<String> li = new ArrayList<>();
				li.addAll(c1);
				String st = li.get(0);
				driver.switchTo().window(st);
				driver.findElement(By.id("add-to-cart-button")).click();
				
			}
		}
	}

}
