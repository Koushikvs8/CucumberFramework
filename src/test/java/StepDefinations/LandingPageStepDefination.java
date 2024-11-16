package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestContexSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LandingPageStepDefination {
	String landingPageProductName;
	TestContexSetup testSetup ;
	
	public LandingPageStepDefination(TestContexSetup testSetup) {
		this.testSetup=testSetup;
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
		
		
		
	}
	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		LandingPage lp =testSetup.pageObjmaneger.getLandingPage();
		lp.searchItem(shortname);
		Thread.sleep(2000);
		
		testSetup.landingPageProductName = lp.getProductName().split("-")[0].trim();
		
		
	}
}
