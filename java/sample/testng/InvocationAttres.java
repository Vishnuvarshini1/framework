package sample.testng;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationAttres {
	@Test(invocationCount =3, invocationTimeOut=18000)
 public void search() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("Java",Keys.ENTER);
		driver.close();
 }
}
