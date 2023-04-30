package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
   WebDriver ldriver;
   public LogIn(WebDriver rdriver){
	   
	   ldriver= rdriver;
	   PageFactory.initElements(rdriver, this);
	   
	  }
   
   @FindBy(name="uid") @CacheLookup WebElement username;
   @FindBy(name="password") @CacheLookup WebElement pwd;
   @FindBy(name="btnLogin") @CacheLookup WebElement btn;
   
   

   public void setusername(String Uname) {
	   username.sendKeys(Uname);
	   
   }
   
   public void setpwd (String pass) {
	   pwd.sendKeys(pass);
   }
   
   public void clickbutton() {
	   btn.click();
	   
   }
   
   
}
