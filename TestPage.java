package test.component;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import page.component.Checkin;
import page.component.FlightStatus;
import page.component.Login;
import page.component.ManageBooking;
import page.component.OneWay;
import page.component.RoundTrip;
import page.component.SignUp;

public class TestPage extends Base{
	@Test 
	public void testOne() {
		SignUp signobj = new SignUp();
		signobj.signUpMethod();
		ExtentTest test = report.createTest("TestOne");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "signUp method");
		String s = getScreenshotMethod("testOne");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test
	public void testTwo() {
		Login lobj = new Login();
		lobj.loginMethod();
		ExtentTest test = report.createTest("TestTwo");
		test.log(Status.FAIL, "Login succeess");
		test.log(Status.INFO, "Login method");
		
		String s = getScreenshotMethod("testTwo");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test
	public void testThree() {
		OneWay objOne = new OneWay();
		objOne.oneWayMethod();
		ExtentTest test = report.createTest("TestThree");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "oneWay method");
		
		String s = getScreenshotMethod("testThree");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}
	@Test
	public void testFour() {
		RoundTrip objTwo = new RoundTrip();
		objTwo.roundTripMethod();
		ExtentTest test = report.createTest("TestFour");
		test.log(Status.PASS, "success");
		test.log(Status.INFO, "RoundTrip method");
		
		String s = getScreenshotMethod("testFour");
		test.addScreenCaptureFromBase64String(s);
		report.flush();
	}

@Test
public void testFive() {
	Checkin objThree = new Checkin();
	objThree.checkinMethod();
	ExtentTest test = report.createTest("TestFive");
	test.log(Status.PASS, "success");
	test.log(Status.INFO, "checkinMethod method");
	String s = getScreenshotMethod("testFive");
	test.addScreenCaptureFromBase64String(s);
	report.flush();
}
@Test
public void testSix() {
	FlightStatus objFour = new FlightStatus();
	objFour.flightStatusMethod();
	ExtentTest test = report.createTest("TestSix");
	test.log(Status.PASS, "success");
	test.log(Status.INFO, "flightStatusMethod method");
	
	String s = getScreenshotMethod("testSix");
	test.addScreenCaptureFromBase64String(s);
	report.flush();
}
@Test
public void testSeven() {
	ManageBooking objFive = new ManageBooking();
	objFive.ManageBookingMethod();;
	ExtentTest test = report.createTest("TestSeven");
	test.log(Status.PASS, "success");
	test.log(Status.INFO, "ManageBookingMethod method");
	
	String s = getScreenshotMethod("testSeven");
	test.addScreenCaptureFromBase64String(s);
	report.flush();
}
}
