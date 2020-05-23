package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SonyAccountPage {
	
	public WebDriver driver;
	
	public SonyAccountPage(WebDriver driver) {
		this.driver=driver;
	}

   
  
    
    By Support=By.linkText("Support");
    
    
	public WebElement Support() {
		return driver.findElement(Support);
	}
	
	
	
	
	
	
}
