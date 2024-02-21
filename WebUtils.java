package util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class WebUtils {
	//creating driver as global variable to access throghout the project
	public static WebDriver driver ;

	//Method for openBrowser
	public static void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	//Method for clickEvent
	public static void clickEvent(WebElement element) {
		element.click();
	}	
	//Method for closeBrowser
		public static void closeBrowser() {
			driver.close();
		}		
	//Method for sendKeys
		public static void keyInput(WebElement element, String value) {
			element.sendKeys(value);
		}
	//Method for getText
		public static String keyOutput(WebElement element) {
			String value = element.getText();
			return value;
		}
	//Method for getCurrentUrl
		public static String urlOutput() {
			String value = driver.getCurrentUrl();
			return value;
		}
		//mehod for getTitle
		public static String getTitleMethod() {
			String titleValue =driver.getTitle();
			return titleValue;
		}
	//Method for thread sleep
		public static void threadSleepmethod() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//Method for implicit wait
		public static void implicitWaitMethod(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
		//Method for Page Load Time 
		public static void pageLoadMethod(int sec) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(sec));
		}
		//Method for Explicit wait
		public static void explicitWaitMethod(int sec, WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		//Method for Fluent wait
		public static void fluentWaitMethod(int sec,int polingsec, WebElement element){
			FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
			fwait.withTimeout( Duration.ofSeconds(sec));
			fwait.pollingEvery( Duration.ofSeconds(polingsec));
			fwait.until(ExpectedConditions.visibilityOf(element));
			
			
		}
		//Method for Take Screenshot method
		public static String getScreenshotMethod(String screenshotName) {
			//String dateValue = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date(0, 0, 0));
			TakesScreenshot ts = (TakesScreenshot)driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			String destination = System.getProperty("user.dir") + "/screenshots/" + screenshotName  +".png";
			File finalDestination = new File(destination);
			try {
				try {
					FileHandler.copy(Source, finalDestination);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return destination;
			
		}
		//Method for report Generation
		public static void reportGenerateMethod() {
			ExtentHtmlReporter html = new ExtentHtmlReporter(System.getProperty("user.dir") + "/ExtentHtmlReport.html");	
			ExtentReports report = new ExtentReports();
			report.attachReporter(html);
			}
		//Method for PageDown 
		public static void pageDownMethod() {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.PAGE_DOWN).build().perform();
		}
}
