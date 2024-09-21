package com.adactin.test;

import org.base.Base;
import org.junit.Test;

import com.adactin.pages.Loginpage;
import com.adactin.pages.SearchHotelpage;

public class SearchHotelTest extends Base{
	@Test
	public void Search() throws Exception {
		
		
		String username=getTestData("Username");
		String password= getTestData("Password");
		
		
		String location=getTestData("Location");
		Loginpage login= new Loginpage();
		SearchHotelpage search= new SearchHotelpage();
		login.adactinLogin(username, password);
		login.verifyuserLogin();
		search.selectLocation(location);
		search.clickOnSearch();
	}
}
