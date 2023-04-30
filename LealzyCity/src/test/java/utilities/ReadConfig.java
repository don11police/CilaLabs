package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		
		File src = new File("C:\\Users\\ASUS\\eclipse-workspace\\LealzyCity\\Configuration\\config.properties");
		
		try {
			
			FileInputStream file = new FileInputStream(src);
			pro = new Properties();
			pro.load(file);
			}
	catch(Exception e){
		
		System.out.println("Exception is" + e.getMessage());
		
		
	}
		
	}
	
	
	public String geturl() {
		
		String url = pro.getProperty("baseUrl");
		return url;
		
	}

	public String getusername() {
		
		String username = pro.getProperty("Username");
		return username;
	}
	
	public String getpassword() {
		String pass = pro.getProperty("Password");
		return pass;
		
	}
	
	public String chromedriver() {
		String path = pro.getProperty("chromepath");
		return path;
		
	}
	
	public String firefoxdriver() {
		
		String firefox = pro.getProperty("firefoxpath");
		return firefox;
	}
	
	public String iedriver() {
		String iedriver = pro.getProperty("iepath");
		return iedriver;
	}
}
