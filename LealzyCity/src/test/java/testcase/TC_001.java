package testcase;

import org.junit.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobject.LogIn;

public class TC_001 extends BaseClass{ 
	
	@Test
	
	public void testcase() throws Exception {
		
		
		driver.get(baseUrl);
		
		LogIn pom = new LogIn(driver);
		
		pom.setusername(Username);
		
		logger.info("Enter username");
		
		pom.setpwd(password);
		
		logger.info("Enter password");
		
		
		
		pom.clickbutton();
		logger.info("click on loginbutton");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
		
		
	
	
	
		
		
		
	}	
		
		
		
		

		
		
	
	
	
}
	


