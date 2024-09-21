package sample.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Enabled {
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test 3");
	}
	
	@Test(enabled=false)
	public void test4() {
		System.out.println("Test 4");
	}
}

