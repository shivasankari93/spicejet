package test.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import util.WebUtils;

public class Base extends WebUtils{
	public Base() {
		PageFactory.initElements(driver, this);
	}
	ExtentHtmlReporter html = null;
	ExtentReports report = null;
	@BeforeSuite (alwaysRun = true)
	public void beforeSuite() {
		 html = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtendReporter.html");
		 report = new ExtentReports();
		report.attachReporter(html);
		System.out.println("beforeSuite");
	}
	

	@BeforeMethod (alwaysRun = true)
	public void beforeMethod() {
		System.out.println("beforeMethod");
		openBrowser();
		implicitWaitMethod(2000);
		driver.get("https://www.spicejet.com/");
	}

	@AfterMethod (alwaysRun = true)
	public void afterMethod() {
		System.out.println("afterMethod");
		closeBrowser();

	}
	
	@AfterSuite (alwaysRun = true)
	public void afterSuite() {
		System.out.println("afterSuite");
	}
}
