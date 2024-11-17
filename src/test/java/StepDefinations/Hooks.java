package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.TestBase;
import Utils.TestContexSetup;
import io.cucumber.java.After;

public class Hooks {
   TestContexSetup testsetup;
	
	public Hooks(TestContexSetup testsetup) {
		this.testsetup=testsetup;
	}
	
	@After
	public void AfterScenario() throws IOException
	{
		testsetup.testBase.webDriverManeger().quit();
	}
}
