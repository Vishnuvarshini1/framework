package sample.testng;

import org.testng.annotations.Test;

public class priority {
@Test(priority=1)
public void test1() {
	System.out.println("T1");
}
@Test(priority=2)
	public void test2() {
		System.out.println("T2");
	}
@Test(priority=3)
public void test3() {
	System.out.println("T3");
}
@Test(priority=3)
public void test4() {
	System.out.println("T4");
}
@Test(priority=4)
	public void test5() {
	System.out.println("T5");
}
}

