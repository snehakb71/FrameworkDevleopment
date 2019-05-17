package pixfixTestcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pixfixUtility.BrowserFactory;
import pixfixUtility.HelperC;
import pixfixpages.Loginpage;

public class FameTestCases extends BaseClass {

	@Test
	public void frameTestcases() {

		logger= extent.createTest("login");
		Loginpage login = PageFactory.initElements(driver, Loginpage.class);
		login.login(config.username(), config.password());
		logger.info("test started");
		logger.pass("login successful");
		
		
		
		
		
	}
	
	
	

}
