package org.base;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base {
	//WebDriver driver=new ChromeDriver --Webdriver driver static variable
	public static WebDriver driver;
	//for extend report 
	public static ExtentSparkReporter reporter; //used to create a HTML file
	public static ExtentReports extent; //used to add test execution steps into 
	                                    //the HTML file
	public static ExtentTest test; //used to create a new test on HTML file, 
								   //and test result status(pass, fail, skip)
	
	@BeforeSuite
	public void report() {
		reporter = new ExtentSparkReporter("./ExtentReport/SampleReport.html");
		extent = new ExtentReports();
	    extent.attachReporter(reporter);
	}
	
	public static void createATest(String name) {
		test = extent.createTest(name);
	}
	
	@AfterMethod
	public void stopReport() {
		extent.flush();
	}	
	//for report status 
	public static void reportStatus(String status,String description) {
		try {
			switch(status) {
			case "pass":
				test.pass(description);
			case "fail":
				test.fail(description);
			case "info":
				test.info(description);
			case "warn":
				test.warning(description);
			//case "screenshot"
		//	test.pass(description, MediaEntityBuilder.createScreenCaptureFromPath(screenShotPath())).build();
				
			
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//takescreenshot
	public static synchronized String screenShotPath() throws Exception{
		Long l = Calendar.getInstance().getTimeInMillis();
		
		String scrnshotId = l.toString();
		String path = System.getProperty("user.dir")+"/Screenshots/";	//like set property getting property from directory
		
		String imgPath = path+scrnshotId+".png";

		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File(imgPath);
		FileHandler.copy(screenshot, des);
		
		String imagePath = "../Screenshots/"+scrnshotId+".png";
		
		return imagePath;
	}
//To launch the browser static method as parameterized
public static void browserlaunch(String browserlaunch) {
//	System.setProperty("webdriver.chrome.driver","C:\\vishnu\\test\\July\\Resource\\chromedriver.exe");
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
public static WebElement findElementById(String id) {
	return driver.findElement(By.id(id));
}
public static WebElement findElementByxpath(String xpath) {
	return driver.findElement(By.xpath(xpath));
}

public static WebElement findElementByname(String name) {
	return driver.findElement(By.name(name));
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
//alerts
public static void alertsaccept(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public static void alertscancel(WebDriver driver) {
	driver.switchTo().alert().dismiss();
	
}
public static void alertsprompt(WebDriver driver,String value) {
	driver.switchTo().alert().sendKeys(value);
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
	//wait
	public static void waitdatasend(WebElement element, String data) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(data);
	}
	//getcurrenturl
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	//selectbyvisibletext
	
	public static void getDropDownOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getText());
	}
	}
	public static void selectByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	//getText
	public static void getText(WebElement element) {
		String data = element.getText();
		System.out.println(data);
	}
	//takescreenshot
	public static void screenshot(WebDriver driver,String screenshotname ) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\varshini\\vishnu\\Screenshot"+screenshotname+".jpeg");
		FileHandler.copy(screenshotAs, destination);
		
	}

	
//findby
	public static WebElement findBy(By by) {
		return driver.findElement(by);
	}
//For Property read 
public static String getTestData(String key) throws Exception{
FileReader read =new FileReader("./src/test/resources/TestData/adactin.properties");
Properties prop = new Properties();
prop.load(read);
String value=prop.getProperty(key);
return value;
}
}
