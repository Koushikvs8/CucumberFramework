package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjects.PageObjectManager;

import Utils.*;

public class TestContexSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjmaneger;
	public TestBase testBase;
	
	public TestContexSetup() throws IOException {
		testBase = new TestBase();
		pageObjmaneger=new PageObjectManager(testBase.webDriverManeger());
	}
}
