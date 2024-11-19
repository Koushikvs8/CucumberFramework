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
	LandingPage lp;
	
	public LandingPageStepDefination(TestContexSetup testSetup) {
		this.testSetup=testSetup;
		this.lp =testSetup.pageObjmaneger.getLandingPage();
	}
	
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
		
		
		
	}
	@When("^user searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortname) throws InterruptedException {
		
		
		lp.searchItem(shortname);
		Thread.sleep(2000);
		
		testSetup.landingPageProductName = lp.getProductName().split("-")[0].trim();
		
		
	}
	
	
	@When("Added {string} items of the selected product to cart")
	public void Added_product(String productCount) throws InterruptedException
	{    int productCountUp = Integer.parseInt(productCount);
		lp.incrementQuantity(productCountUp);
		Thread.sleep(2000);
		lp.addToCart();
	}
}
