package org.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotbase {
	//WebDriver driver=new ChromeDriver --Webdriver driver static variable
	public static WebDriver driver;
	//for screenshot global variable
	public static TakesScreenshot ts;
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
	//to takescreenshot
	public static void screenshot(WebDriver driver,String screenshotname ) throws IOException {
		ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\varshini\\vishnu\\Screenshot"+screenshotname+".jpeg");
		FileHandler.copy(screenshotAs, destination);
		
	}
}
