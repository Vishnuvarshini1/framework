package testng.groups;

import org.testng.annotations.Test;

public class Groups {

	@Test(groups= {"loginpage","smoke","regression"})
	
	public void testLogin() {
		System.out.println("Test1");
	}
	@Test(groups= {"loginpage","smoke","regression"})
	public void testLogin1() {
		System.out.println("Test2");
	}
	@Test(groups= {"cartpage","smoke","regression"})
	public void cart() {
		System.out.println("Cart testcase");
	}
	
	@Test(groups= {"ocpage","sanity","regression"})
	public void ocpage() {
		System.out.println("ocp test");
	}
	
	@Test(groups = {"checkoutpage", "smoke", "regression"})
	public void test2() {
		System.out.println("checkout");
	}
	@Test(groups = {"pdppage", "regression"})
	public void test8() {
		System.out.println("Testpdp");
	}
	
	@Test(groups = {"plppage", "regression"})
	public void test9() {
		System.out.println("Testplp");
	}
	
	@Test(groups = {"plpage", "regression"})
	public void test10() {
		System.out.println("Testpl1");
	}
}
