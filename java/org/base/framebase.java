package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framebase {
	//WebDriver driver=new ChromeDriver --Webdriver driver static variable
	public static WebDriver driver;
	//To launch the browser static method as parameterized
	public static void browserlaunch(String browserlaunch) {
		System.setProperty("webdriver.chrome.driver","C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
		switch(browserlaunch) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		default:
		System.out.println("browser not found");
		break;
		}
	}
	// To maximize the window
	public static void maxwindow() {
		driver.manage().window().maximize();
	}
	// To load the url
	public static void getUrl(String url) {
		driver.get(url);
	}
	//webelement methods sendkeys
	public static void inputText(WebElement element,String name) {
		element.sendKeys(name);
	}
	//to wait the system for specific time period
	public static void wait(int time) throws InterruptedException {
		Thread.sleep(time);
	}
	// Webelement method for click 
	public static void click(WebElement element) {
		element.click();
	}
//frames
	public static void frameindex(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public static void framename(WebDriver driver,String name) {
		driver.switchTo().frame(name);
	}
	public static void framewebelement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
}
