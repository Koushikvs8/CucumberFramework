package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
public WebDriver driver;

public CheckoutPage(WebDriver driver) {
	this.driver=driver;
}
	

By cartBag=By.xpath("//img[@alt='Cart']");
By checkOut=By.xpath("//button[contains(text() , 'PROCEED TO CHECKOUT')]");
By promoBtn = By.cssSelector(".promoBtn");
By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

public void CheckoutItems()
{
	driver.findElement(cartBag).click();
	driver.findElement(checkOut).click();
}

public Boolean VerifyPromoBtn()
{
	return driver.findElement(promoBtn).isDisplayed();
}

public Boolean VerifyPlaceOrder()
{    Boolean status=driver.findElement(placeOrder).isDisplayed();
  driver.findElement(placeOrder).click();;
	return status;
}
}
