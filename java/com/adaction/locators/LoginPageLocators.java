package com.adaction.locators;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators extends Base {
	public  LoginPageLocators() { //create as constructor
		PageFactory.initElements(driver, this); // used to intialize webElment
	}
	//WebElement user = driver.findElement(By.id("username")); 
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement login;
	//getter methods

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
}
