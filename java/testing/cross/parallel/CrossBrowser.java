package testing.cross.parallel;


import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser extends Base {

	@BeforeTest
	public void beforeTest() {
		System.out.println("crossBrowser Execution strated");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("CrossBrowser Execution Ended");
	}
	@Parameters("browser")
	@Test
	public void scriptOne(String browname) {
		browserlaunch(browname);
		getUrl("https://petstore.octoperf.com/actions/Catalog.action");
		findElementByxpath("//a[text()='Sign In']").click();
		findBy(By.name("username")).sendKeys("j2ee");
		findBy(By.name("signon")).click();
	}
	@Parameters("browser")
	@Test
	public void scripTwo(String browname) {
		browserlaunch(browname);
		getUrl("https://www.homedepot.com/");
		WebElement productname=findElementByxpath("(//div[@data-testid='product-header']/child::/a/div/h3/span)[2]");
		String prodname=productname.getText();
		System.out.println(prodname);
	}
}
