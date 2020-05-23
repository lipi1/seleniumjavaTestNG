package resources;



import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportsNG {
	static ExtentReports extent; // global variable // declare it static
	
	public  static  ExtentReports extentMethod() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter Reporter = new  ExtentSparkReporter(path); // passing path variable here // this is a helper class which set path and some configurations
		Reporter.config().setReportName(" report name"); // report title
		Reporter.config().setDocumentTitle("Title"); // page title
		
		extent = new ExtentReports(); // this is responsible to create and consolidate report
		extent.attachReporter(Reporter);
		extent.setSystemInfo("Tester", "Lipi Jain");
		return extent;
		
	}
	


		}
		
		
		
	


