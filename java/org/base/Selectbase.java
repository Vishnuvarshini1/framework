package org.base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbase {
	//WebDriver driver=new ChromeDriver --Webdriver driver static variable
		public static WebDriver driver;
		//select class
		public static Select dropdown;
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
		//select class
		public static void selectbyindex(WebElement element, int index) {
		dropdown=new Select(element);
		dropdown.selectByIndex(index);
		}
		public static void selectbyvalue(WebElement element, String value) {
			dropdown=new Select(element);
			dropdown.selectByValue(value);
		}
		public static void selectbyvisibletext(WebElement element,String text) {
			dropdown=new Select(element);
			dropdown.selectByVisibleText(text);
		}
		public static void deselectbyvisibletext(WebElement element,String text) {
			dropdown=new Select(element);
			dropdown.selectByVisibleText(text);
		}
		public static void deselectbyindex(WebElement element, int index) {
			dropdown=new Select(element);
			dropdown.selectByIndex(index);
			}
			public static void deselectbyvalue(WebElement element, String value) {
				dropdown=new Select(element);
				dropdown.selectByValue(value);
			}
			//public static void getoption(List<WebElement> element) {
				public static void ismultiple(WebElement element,boolean multiple) {
					dropdown=new Select(element);
					dropdown.isMultiple();
				
			}
		
}
