package pixfixpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	@FindBy(name="username") WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(id="submitbutton") WebElement login; 
	
	
	public void login(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		login.click();
		
	}
	
	
	

}
