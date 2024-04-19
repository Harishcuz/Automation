package SeleniumConcept;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileConcept {

	public static void main(String[] args) throws IOException {
		
		String path = "E:\\Selenium\\Believerz\\Automation\\PropertyFiles\\config.properties";
		FileReader reader = new FileReader(path);
		
		Properties prop = new Properties();   
		prop.load(reader);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
	}
}
