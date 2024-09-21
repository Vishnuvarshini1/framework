package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Actionbase {
public static WebDriver driver;
public static Actions action;
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
public static void moveToElement(WebElement element) {
	action=new Actions(driver);
	action.moveToElement(element).build().perform();
}
public static void contextclick(WebElement element) {
	action=new Actions(driver);
	action.contextClick(element).build().perform();
}
public static void doubleclick(WebElement element) {
	action=new Actions(driver);
	action.doubleClick(element).build().perform();
}
public static void draganddrop(WebElement element,WebElement element1) {
	action=new Actions(driver);
	action.dragAndDrop(element, element1).build().perform();
}


public static void click(WebElement element) {
	element.click();
}
}
