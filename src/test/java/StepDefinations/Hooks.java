package StepDefinations;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import java.io.File;
import Utils.TestBase;
import Utils.TestContexSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

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

	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException
	{    WebDriver driver=testsetup.testBase.webDriverManeger();
		if(scenario.isFailed())
	{
		//
			File sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent, "image/png", "image");
	}
		
	}
}
