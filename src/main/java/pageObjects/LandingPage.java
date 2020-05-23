package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}

	
    By Mysony=By.xpath("//span[@class='username']");
    By BootStrap=By.xpath("//div[@class='QSIPopOver SI_0wHElYyF5dUZflX_PopOverContainer']/div[1]/div[1]/img[1]"); // to close the notification just after landing the page
    By SignIn=By.xpath("//a[(@title='Sign in')]"); 
    By SignIn2=By.xpath("//a[contains(text(),'Sign In')]"); 
   // By SignIn2=By.linkText("Sign In"); 

    
   


	public WebElement mySony() {
		return driver.findElement(Mysony);
	}
	
	public WebElement bootstrap() {
		return driver.findElement(BootStrap);
	}
	
	public WebElement signIn() {
		//return a.moveToElement(driver.findElement(SignIn)).click().perform();
	return driver.findElement(SignIn);
	
	}
	public WebElement signIn2() {
		return driver.findElement(SignIn2);
	}
		
}
