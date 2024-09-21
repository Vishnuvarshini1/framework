package testing.extendreport;

import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ReportSample extends Base {
	@Test
public void test1() {
		createATest("Jpet Login");
		browserlaunch("chrome");
		reportStatus("pass","browseropened");
		getUrl("https://petstore.octoperf.com/actions/Catalog.action");
		reportStatus("pass","launched Url");
		findElementByxpath("//a[text()='Sign In']").click();
		reportStatus("info","SignIn button clicked");
		findElementByxpath("//input[@name='username']").sendKeys("j2ee");
		reportStatus("info", "Username entered");
		
		findBy(By.name("signon")).click();
		reportStatus("info","Login button clicked");
		try {
		WebElement signout=findElementByxpath("//a[contains(@href, 'signoff')]");
		if(signout.isDisplayed()) {
			reportStatus("pass screenshot", "User logged in");
		}
}catch(java.util.NoSuchElementException e) {
	reportStatus("fail", "User not logged in" + e.getMessage());
}
}
}