package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	public WebDriver driver;
	public LogInPage(WebDriver driver) {
		this.driver=driver;
	}

   
    By userName=By.xpath("//input[@id='logonIdentifier']");
    By password=By.xpath("//input[@id='password']"); 
    By submit=By.xpath("//button[@id='next']");
    
    
    
    
    
    


	public WebElement Username() {
		return driver.findElement(userName);
	}
	public WebElement password() {
		return driver.findElement(password);
	}
	public WebElement submit() {
		return driver.findElement(submit);
	}
	
	
	
	
	
}
