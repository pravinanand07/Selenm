package org.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrsrLaunch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/" +Keys.ENTER);
		driver.manage().window().maximize();
	}

}
