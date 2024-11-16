package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public WebDriver driver;

public WebDriver webDriverManeger()
{   if(driver ==null)
{
	driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
}
	return driver;
}
}
