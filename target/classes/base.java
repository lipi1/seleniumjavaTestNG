package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {

	public WebDriver driver; // public variable so that other classes can also access it
	public Properties prop;
	public WebDriver InitialiseBrowser() throws IOException {

	    prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\professional\\Automation\\eclipse worksapce\\EndToEnd\\src\\main\\java\\resources\\globaldata.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	
	/*public void method() throws IOException {
		InitialiseBrowser();
	}*/
}