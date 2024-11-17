package Utils;

import java.io.FileInputStream;
import java.io.IOException;
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
	String Browser=prop.getProperty("browser");
	if(driver ==null)
{  if(Browser.equalsIgnoreCase("chrome"))
{
	driver=new ChromeDriver();
	
	
}
if(Browser.equalsIgnoreCase("ff")){
	driver=new FirefoxDriver();
	
}
if(Browser.equalsIgnoreCase("Edge")){
	driver=new EdgeDriver();
	
}
driver.get(url);
}
	return driver;
}
}
