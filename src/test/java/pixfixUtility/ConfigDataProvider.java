package pixfixUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties pro;
	
	public ConfigDataProvider()
	{
		File src = new File("./Configuration/KeyValue.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fis);
		} catch (IOException e) {
			System.out.println("Not able to load the file"+e);
		}
	}
	
	
	
	public String browserType()
	{
		return pro.getProperty("browser");
	}
	
	public String url()
	{
		return pro.getProperty("url");
	}

	public String username()
	{
		return pro.getProperty("username");
	}
	
	public String password()
	{
		return pro.getProperty("password");
	}
}
