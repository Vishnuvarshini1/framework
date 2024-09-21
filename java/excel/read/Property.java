package excel.read;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Property {
	public static void readProperty() throws IOException {
		FileReader file = new FileReader("./src/test/resources/TestData/data.properties");
		Properties prop = new Properties();
		prop.load(file);
		String name=prop.getProperty("UserName1");
		System.out.println(name);
	}
	public static void writeProperty() throws IOException {
		FileWriter fw= new FileWriter("./src/test/resources/TestData/data.properties");
		Properties prop = new Properties();
		prop.setProperty("UserName1", "vishnu");
		prop.setProperty("UserName2", "varshini");
		prop.store(fw, "Last update");
		System.out.println("done");
		
	}
	public static void main(String[] args) throws IOException {
		readProperty();
		//writeProperty();
	}
}
