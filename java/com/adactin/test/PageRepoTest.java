package com.adactin.test;

import org.base.Base;
import org.junit.Test;

import com.adactin.pages.PageRepoSample;

public class PageRepoTest extends Base {
	
@Test	
	public  void verifybooking() throws Exception {
	String username=getTestData("Username");
	String password=getTestData("Password");
	String location =getTestData("Location");
	String fname=getTestData("FirstName ");
	String lname=getTestData("LastName");
	String Address=getTestData("Address");
	String creditcardno=getTestData("CreditCardNo");
	String creditcard=getTestData("CreditCard");
	String cvv=getTestData("CvvNumber");
	String expirymonth=getTestData("ExpiryMonth");
	String expiryyear=getTestData("ExpiryYear");
	PageRepoSample.userLogin(username, password);
	PageRepoSample.searchHotelAndClickOnSearch(location);
	PageRepoSample.selectHotelAndClickContinue();
	PageRepoSample.verifyUserRedirectsToBookAHotelPage();
	PageRepoSample.bookHotelAndclickBookNow(fname,lname,Address,creditcardno,creditcard,cvv,expirymonth,expiryyear);
	PageRepoSample.verifyUserBookedhotel();
	PageRepoSample.takeScreenshot();
}
}
