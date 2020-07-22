package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://http://www.greenstechnologys.com//");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@href='contact.php']")).click();
        String wh = driver.getWindowHandle();
        Set<String> whs = driver.getWindowHandles();
        for (String x1 : whs) {
			if (!wh.equals(x1)) {
				driver.switchTo().window(x1);
			}
		}
        WebElement txt = driver.findElement(By.tagName("address[2]"));
        String text = txt.getText();
        System.out.println(text);
	}

}
