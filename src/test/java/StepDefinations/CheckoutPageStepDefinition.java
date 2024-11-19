package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.TestContexSetup;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.CheckoutPage;


public class CheckoutPageStepDefinition {
	public WebDriver driver;
	public String landingPageProductName;
	public String offerPageProductName;
	public CheckoutPage chk;
	TestContexSetup testSetup ;
	
	public CheckoutPageStepDefinition(TestContexSetup testSetup) {
		this.testSetup=testSetup;
		this.chk=  testSetup.pageObjmaneger.getCheckoutPage();
	}


	@Then("verify user has ability to enter promo code and place the order")
	public void  verify_user_has_ability_enter_promo() throws InterruptedException
	{
		Thread.sleep(2000);
		Assert.assertTrue(chk.VerifyPromoBtn());
		Assert.assertTrue(chk.VerifyPlaceOrder());
		Thread.sleep(2000);
		
	}

	@Then("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void user_proceeds_to_checkout(String name) throws InterruptedException
	{
		chk.CheckoutItems();
		Thread.sleep(2000);
		//Assertion to extract name from screen and compare with name
	}
}
