package testcase;





import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;






public class BaseClass {
	
	ReadConfig read = new ReadConfig();
	
	public String baseUrl = read.geturl();
		public String Username = read.getusername();
		public String password = read.getpassword();
		public static WebDriver driver;
		public static Logger logger;
   
		
		@BeforeClass
		public void setup() {
			
			read = new ReadConfig();
			
			System.setProperty("webdriver.chrome.driver", read.chromedriver());
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			
			 logger = Logger.getLogger("ebanking");
				PropertyConfigurator.configure("Log4j.properties");
		
			
			
			
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			
			
   }
		
		@AfterClass
		public void teardown() {
			
			driver.quit();
		}
}
