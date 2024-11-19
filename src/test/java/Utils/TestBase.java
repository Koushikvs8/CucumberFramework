package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestBase {
public WebDriver driver;
public Properties prop;
public WebDriver webDriverManeger() throws IOException

{  FileInputStream file =new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//global.properties");
	prop =new Properties();
	prop.load(file);
	
	String url=prop.getProperty("QAUrl");
	String browser_prop=prop.getProperty("browser");
	String browser_maven=System.getProperty("browser");
	String browserMain;
	////////maven_comandline _ run///
	if(browser_maven!=null)
	{
		browserMain=browser_maven;
	}
	else
	{
		browserMain=browser_prop;
	}
	if(driver ==null)
{  if(browserMain.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
	
	
}
if(browserMain.equalsIgnoreCase("ff")){
	driver=new FirefoxDriver();
	
}
if(browserMain.equalsIgnoreCase("Edge")){
	driver=new EdgeDriver();
	
}
driver.get(url);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	return driver;
}
}
