package PageObjects;

import org.openqa.selenium.WebDriver;

import PageObjects.CheckoutPage;

public class PageObjectManager {
	public LandingPage lp;
	public OfferPage offr;
	public CheckoutPage chk;
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
	public CheckoutPage getCheckoutPage()
	{
		chk = new CheckoutPage(driver);
		return chk;
	}
}
