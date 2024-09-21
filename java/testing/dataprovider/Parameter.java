package testing.dataprovider;

import org.base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter extends Base{

	
	@Parameters({"browser","appUrl"})
	@BeforeMethod
	public void browserlaunch(String browser,String appUrl) {
		browserlaunch(browser);
		getUrl(appUrl);
	}
		
		@Parameters("browser")
		@Test
		public void sample(String brow) {
			System.out.println("Test Execution");
		}
		
		@Parameters("Url")
		@AfterMethod
		public void url(String appUrl) {
			System.out.println("Test2");
		
		
	}
}
