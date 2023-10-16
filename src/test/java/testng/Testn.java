package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Testn {
	
	WebDriver driver;
	String testid;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	public void extentreport () {
//		reporter = new ExtentHtmlReporter("test-output/ExtentReport/Extent.html");
//		ExtentReports extend = new ExtentReports();
//		extend.attachReporter(reporter);
		reporter = new ExtentHtmlReporter("test-output/ExtentReport/Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
	
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod (){
		System.out.println("before method");
	}
	
	@Test
	public void test1 (){
		
		System.out.println("1st line of test");
		
		//extentLogger.log(Status.INFO, browser + "application is launched");
		System.out.println("2nd line of test");
		
	}
	
	@Test
	public void test2 (){
		
		
		System.out.println("1st line of 2nd test");
		
		//Assert.fail(null);
		Assert.fail();
		System.out.println("2nd line of test of 2nd");
		
	}
	
	
	@Test
	public void test3 (){
		System.out.println("test 3");
		//Assert.fail(null);
		Assert.fail();
	}
	
	
	@AfterMethod
	public void afterMethod (ITestResult result){
		if (ITestResult.FAILURE == result.getStatus())
		{
			System.out.println("after method = failed");
		}
		
	}
	
	@AfterClass
	public void afterClass (){
		System.out.println("after class");
	}
	@AfterTest
	public void tearDown() {
		
	}


}
