package sample.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {
	@BeforeSuite
public void beforesuite() {
	System.out.println("Test1");
}
	@BeforeTest
public void beforeTest() {
	System.out.println("test2");
}
	@BeforeClass
public void beforeClass() {
	System.out.println("test3");
}
	@BeforeMethod
public void beforeMethod() {
	System.out.println("test4");
}
	@Test
	public void test() {
		System.out.println("Start");
	}
	@AfterMethod
public void afterMethod() {
	System.out.println("Test5");
}
	@AfterClass
public void afterClass() {
	System.out.println("test6");
}
	@AfterTest
public void afterTest() {
	System.out.println("test7");
}
	@AfterSuite
public void aftersuite() {
	System.out.println("test8");
}

}
