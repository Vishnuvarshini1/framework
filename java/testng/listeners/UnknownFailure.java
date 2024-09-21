package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnknownFailure {
	@Test
	public void failedTest() {
		System.out.println("Unknown failure test");
		Assert.assertTrue(false);
	}
}
