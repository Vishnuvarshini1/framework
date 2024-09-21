package com.adactin.pages;

import org.base.Base;
import org.openqa.selenium.WebElement;

import com.adaction.locators.LoginPageLocators;

import adactin.withoutpf.Loginwopf;



public class Loginpage extends Base {
	public static Loginwopf login= new Loginwopf();
	public static void adactinLogin(String username,String password) {
		try {
			browserlaunch("chrome");
			getUrl("https://adactinhotelapp.com/");
			
//			LoginPageLocators loc = new LoginPageLocators();
//			waitdatasend(loc.getUser(), username);
//			
//			WebElement pswd = loc.getPassword();
//			waitdatasend(pswd, password);
//			
//			click(loc.getLogin());
					
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	public static void verifyuserLogin() {
		try {
			String currentUrl = getCurrentUrl();
			if(currentUrl.contains("SearchHotel")) {
				System.out.println("User logged in");
			}else {
				System.out.println("User NOT logged in");
			}
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}














