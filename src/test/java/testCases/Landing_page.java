package testCases;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogInPage;
import resources.base;




public  class Landing_page extends base {
	public static Logger log = LogManager.getLogger(Landing_page.class.getName());
    @BeforeClass
	public void initialization() throws IOException {
		driver = InitialiseBrowser(); //inheritance --you can method of class to another method and here we are
		driver.get(prop.getProperty("url"));
		log.info("website has been opened successfully");
	}
	
	@Test(dataProvider = "getData") // 
	public void HomePageNavigation(String username, String password) throws IOException { // add parameters for
		LandingPage l = new LandingPage(driver); // creating object of that class and invoke methods
		l.bootstrap().click();
		l.mySony().click();
		l.signIn().click();
		l.signIn2().click();
		LogInPage lp = new LogInPage(driver); // we need to paas the driver argument
		lp.Username().sendKeys(username); // parameterized
		lp.password().sendKeys(password); // parameterized
		lp.submit().click();
		log.info("Successfully Login in to the website");

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[1][2]; // no. of rows -x axis no of columns- yaxis // this is for username and
											// password
		data[0][0] = "lipi.jain6@gmail.com";
		data[0][1] = "Something@151993";
		return data;
	}

	@AfterClass
	public void driverclose() {
		driver.close();
	}
}
