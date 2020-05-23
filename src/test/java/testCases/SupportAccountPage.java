package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import pageObjects.LandingPage;

import pageObjects.SonyAccountPage;
import resources.base;

public class SupportAccountPage extends base {
	public static Logger log = LogManager.getLogger(SupportAccountPage.class.getName());
	@BeforeClass
	public void initialise() throws IOException {
		driver = InitialiseBrowser(); //inheritance --you can method of class to another method and here we are
		driver.get(prop.getProperty("url")); //// to pass string we use "" quotes but here we are getting a string  //driver.get("https://www.sony.co.in/electronics/support");
	    log.info("Application has been opened successfully");
	}
	
	
	
	@Test 
	public void SupportNavigation() throws IOException { 
		LandingPage l = new LandingPage(driver); // creating object of that class and invoke methods
		l.bootstrap().click();																				
		SonyAccountPage la = new SonyAccountPage(driver); // creating object of that class and invoke methods
		la.Support().click();
		log.info("Support site has been open successfully");
	}

	@AfterClass
	public void driverclose() {
		driver.close();
	}

}
//      <class name="testCases.SupportAccountPage"/>
