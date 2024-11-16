package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.OfferPage;
import Utils.TestContexSetup;

import io.cucumber.java.en.Then;

public class OfferPageStepDefination {
	public String offerPageProductName;
	public TestContexSetup testSetup;
	public OfferPageStepDefination(TestContexSetup testSetup )
	{
		this.testSetup=testSetup;
	}
	
	
	
	@Then("user searched for {string} shortname in offers page")
	public void user_searched_for_shortname_in_offers_page(String shortname) throws InterruptedException {
		
		LandingPage lp =testSetup.pageObjmaneger.getLandingPage();
	    lp.selectTopDealsPage();
	    OfferPage offr =testSetup.pageObjmaneger.getOfferPage();
	    offr.swichToOfferPage();	
	    Thread.sleep(2000);
	    offr.searchItem(shortname);
	     offerPageProductName=offr.getProductName();
	    
	   
	}
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(testSetup.landingPageProductName);
		System.out.println(offerPageProductName);
		Assert.assertEquals(offerPageProductName, testSetup.landingPageProductName);
	}
}
