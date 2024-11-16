package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public LandingPage lp;
	public OfferPage offr;
	public WebDriver driver ;
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
				
	}
	
	public LandingPage getLandingPage()
	{
		 lp=new LandingPage(driver);
		 
        return lp;//lp=Landingpage
	}
	
	public OfferPage getOfferPage()
	{
		offr =new OfferPage(driver);
		return offr;
	}
}
