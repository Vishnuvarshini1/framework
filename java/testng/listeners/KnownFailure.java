package testng.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KnownFailure {
@Test(retryAnalyzer= RetryClass.class)
public void failedTest() {
	System.out.println("failure");
	Assert.assertTrue(false);
}
}
