package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
	
	public static WebDriver driver;
	
	public static void launchbrowser(String browsername) {
		System.setProperty("chrome", "C:\\vishnu\\test\\gitCode\\Resource\\chromedriver.exe");
		switch(browsername) {
		case "chrome":
		driver=new ChromeDriver();
		break;
		case "edge":
			driver=new EdgeDriver();
			break;
		default:
				System.out.println("browser not found");
				break;
		
		}
		}
	public static void maximize() {
		driver.manage().window().maximize();
		
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void inputText(WebElement element,String textvalue) {
		element.sendKeys(textvalue);
	}
	public static void wait(int time) throws InterruptedException {
		Thread.sleep(2000);
	}
	public static void alertsaccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public static void alertscancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
		
	}
	public static void alertsprompt(WebDriver driver,String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	public static void click(WebElement element) {
		element.click();
	}
}
