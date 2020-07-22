package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMBaseCode extends BaseCode {
     
	public POMBaseCode() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement user;
	
	@FindBy(id="pass")
	private WebElement pass;
	
	@FindBy(id="u_0_b")
	private WebElement login;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
