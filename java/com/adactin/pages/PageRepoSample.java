package com.adactin.pages;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import adactin.page.repository.PageRepo;

public class PageRepoSample extends Base
{
public static PageRepo pr= new PageRepo();
public static void userLogin(String username, String password) {
	try {
		
		browserlaunch("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement user=findBy(pr.getLogin().username);
		user.sendKeys(username);
		WebElement pswd=findBy(pr.getLogin().password);
		pswd.sendKeys("vishnu@25");
		WebElement login=findBy(pr.getLogin().login);
		click(login);
		
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}

public static void searchHotelAndClickOnSearch(String location) {
	try {
		WebElement location1=findBy(pr.getSearch().location);
		selectByVisibleText(location1, location);
		
		
		
		WebElement submit=findBy(pr.getSearch().submit);
		click(submit);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}


public static void selectHotelAndClickContinue() {
	try {
		WebElement radioBtn = findBy(pr.getSelect().firstHotelRadioBtn);
		click(radioBtn);
		
		WebElement continueBtn = findBy(pr.getSelect().continueBtn);
		click(continueBtn);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}

public static void verifyUserRedirectsToBookAHotelPage() {
	try {
		String currentUrl = getCurrentUrl();
		if(currentUrl.contains("BookHotel")) {
			System.out.println("User redirected to the Book a Hotel Page");
		}else {
			System.out.println("User doesn't redirected to the Book a Hotel Page");
		}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
public static void bookHotelAndclickBookNow(String fname,String lname,String Address,String creditcardno,String creditcard,String cvv,String expirymonth,String expiryyear) {
	try {
	 PageRepo pr= new PageRepo();
		WebElement firstname=findBy(pr.getBook().firstname);
		firstname.sendKeys(fname);
		WebElement lastname=findBy(pr.getBook().lastname);
		lastname.sendKeys(lname);
		WebElement Address1=findBy(pr.getBook().Address);
		Address1.sendKeys(Address);
		WebElement creaditcardno=findBy(pr.getBook().creditcardno);
		creaditcardno.sendKeys(creditcardno);
		WebElement creaditcard=findBy(pr.getBook().creditcard);
		selectByVisibleText(creaditcard, "VISA");
		WebElement cvvnumber=findBy(pr.getBook().cvvnumber);
		cvvnumber.sendKeys(cvv);
		WebElement expirymonth1=findBy(pr.getBook().expirymonth);
		selectByVisibleText(expirymonth1, "December");
		WebElement expiryyr=findBy(pr.getBook().expiryyear);
		selectByVisibleText(expiryyr,"2027");
		WebElement booknow=findBy(pr.getBook().booknow);
		click(booknow);
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
//private static void selectByVisibleText() {
//	// TODO Auto-generated method stub
//	
//}

public static void verifyUserBookedhotel() {
	try {
		String currentUrl=getCurrentUrl();
		if(currentUrl.contains("https://adactinhotelapp.com/BookingConfirm.php")){
			System.out.println("User Booked Hotel");
			
			
		}else {
			System.out.println("User not Booked Hotel");
	}
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
public static void takeScreenshot() {
	try {
		screenshot(driver,"HotelBooked" );
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}

