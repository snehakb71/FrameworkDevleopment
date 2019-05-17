package pixfixUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class HelperC {
	
	public WebDriver driver;
	
	public static void screenshoot(WebDriver driver, String Filename)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src, new File("./ScreenShots/"+Filename+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
