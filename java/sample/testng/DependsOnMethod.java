package sample.testng;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class DependsOnMethod {
@Test
	public void test1() {
	System.out.println("T1");
	AssertJUnit.assertTrue(false);
}
@Test(dependsOnMethods="test1",alwaysRun=true)
public void test2() {
	System.out.println("T2");
}
}
