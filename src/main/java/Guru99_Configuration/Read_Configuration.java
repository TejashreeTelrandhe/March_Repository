package Guru99_Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Read_Configuration {
	Properties proper;
	public Read_Configuration() {
		File source = new File ("C:\\Users\\Tejashree\\eclipse-workspace\\Framework_Guru99\\src\\main\\java\\Guru99_Configuration\\Configuration.properties");
		FileInputStream file ;
		try {
			file = new FileInputStream(source);
			proper = new Properties();
			proper.load(file);
		}
		catch(Exception e) {
			System.out.println("Exception is : "+e.getMessage());
		}
	}
	public String getAppURL() {
		String url = proper.getProperty("BaseURL");
		return url;
	}
	public String getAppUser() {
		String user = proper.getProperty("Username");
		return user;
	}
	public String getAppPass() {
		String pass = proper.getProperty("Password");
		return pass;
		
	}
	public String getAppChrome() {
		String url = proper.getProperty("Chromepath");
		return url;
	}
	public String getAppFirefox() {
		String user = proper.getProperty("Firefoxpath");
		return user;
	}
	public String getAppEdge() {
		String pass = proper.getProperty("Edgepath");
		return pass;		
	}
	public String getAppIE() {
		String pass = proper.getProperty("IEpath");
		return pass;		
	}
}
