package PageObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {
	public WebDriver driver;

	public OfferPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	
	public void swichToOfferPage()
	{   
		Set <String> windows=driver.getWindowHandles();
		List<String> WindowsList=new ArrayList<>(windows);
		String parent=  WindowsList.get(0);
		String child=WindowsList.get(1);
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
		
			}
			else
			{
				System.out.println("Landing page and Offer page Conflict to find");
			
	}
	}
	
	public void searchItem(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText()
	{
		driver.findElement(search).getText();
	}
	
	public String getProductName()
	{
		return driver.findElement(productName).getText();
	}
}
