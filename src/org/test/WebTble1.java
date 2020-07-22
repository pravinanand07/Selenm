package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTble1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
        driver.manage().window().maximize();
        List<WebElement> tab = driver.findElements(By.tagName("table"));
        for (int i = 0; i < tab.size(); i++) {
			WebElement tbl = tab.get(i);
			List<WebElement> tble = driver.findElements(By.tagName("tr"));
			for (int j = 0; j < tble.size(); j++) {
				WebElement tbb = tble.get(j);
				List<WebElement> tll = driver.findElements(By.tagName("td"));
				for (int k = 0; k < tll.size(); k++) {
					WebElement tle = tll.get(k);
					String text = tle.getText();
					System.out.println(text);
				}
			}
		}
	}

}
