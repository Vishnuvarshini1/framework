package testing.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSample {
@Test
public void testMethod(String uname,String pswd) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement user=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.name("pass"));
	user.sendKeys(uname);
	password.sendKeys(pswd);
	driver.close();
}
@DataProvider
public Object[][] data(){
	return new Object[][] {{"vishnu","vishnu@2"},
							{"varshini","varshini$$"},{"Riya","riya##"}};
	
}

}
