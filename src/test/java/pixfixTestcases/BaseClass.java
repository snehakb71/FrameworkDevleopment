package pixfixTestcases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


import pixfixUtility.BrowserFactory;
import pixfixUtility.ConfigDataProvider;
import pixfixUtility.HelperC;

public class BaseClass {

	public WebDriver driver;
	public ConfigDataProvider config;

	ExtentHtmlReporter repoter;
	ExtentReports extent;
	ExtentTest logger;
	
	
	@BeforeSuite
	public void setup()
	{
		Reporter.log("started", true);
		config = new ConfigDataProvider();
		repoter =new ExtentHtmlReporter("./Reports/sneha.html");
		extent = new ExtentReports();
		extent.attachReporter(repoter);
	}
	
	@BeforeClass
	public void intial()
	{
		driver= BrowserFactory.startApplication(driver, config.browserType(), config.url());
		driver.manage().window().maximize();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	@AfterMethod 
	public void teardownMethod(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			HelperC.screenshoot(driver, result.getName());
		}
		extent.flush();
	}
	
}
