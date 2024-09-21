package com.adactin.test;

import org.base.Base;
import org.junit.Test;

import com.adactin.pages.Loginpage;

public class LoginpageTest extends Base{

	@Test
	public void verifyvalidusernameandvalidpassword() throws Exception {
		String username=getTestData("Username");
		String password= getTestData("Password");
		
		Loginpage login = new Loginpage();
		login.adactinLogin(username, password);
		login.verifyuserLogin();
	}
}
