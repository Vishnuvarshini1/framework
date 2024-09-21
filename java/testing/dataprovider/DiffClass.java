package testing.dataprovider;

import org.testng.annotations.DataProvider;

public class DiffClass {

	@DataProvider
	public Object[][] userandPswd(){
		return new Object[][]{{"vishnu","v@12"},{"varshini","vv#12"},{"VV","VV&6"}};
}
}