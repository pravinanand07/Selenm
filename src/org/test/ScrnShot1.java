package org.test;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrnShot1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Praveen\\workspace\\Selenm\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		TakesScreenshot st = (TakesScreenshot)driver;
		File src = st.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Praveen\\workspace\\Selenm\\scrnpng\\prn.png");
		FileUtils.copyFile(src,dest);
		driver.quit();
	}

}
