package junit.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sampleunit {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before method");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@After
	public void afterMethod() {
		System.out.println("After method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
}
