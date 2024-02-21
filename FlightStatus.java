package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;

public class FlightStatus extends Base{
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1d09ksm r-qklmqi r-1lz4bg0 r-1phboty r-18u37iz']/div[3]")
	WebElement flightStatus;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-15d164r r-136ojw6\"]")
	WebElement departure;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-15d164r r-136ojw6\"]/div/div[2]/div[3]")
	WebElement today;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-15d164r r-184en5c\"]/div/div[1]")
	WebElement from;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3\"]/div[2]")
	WebElement agra;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-15d164r r-184en5c\"]/div/div[3]")
	WebElement to;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-19yat4t r-1rt2jqs\"]/div[2]/div[1]")
	WebElement delhi;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-1pcd2l5\"]/div[5]")
	WebElement searchFlight;
	public FlightStatus() {
		PageFactory.initElements(driver, this);
	}
	public void flightStatusMethod() {
		clickEvent(flightStatus);
		threadSleepmethod();
		clickEvent(departure);
		threadSleepmethod();
		clickEvent(today);
		threadSleepmethod();
		clickEvent(from);
		threadSleepmethod();
		clickEvent(agra);
		threadSleepmethod();
		clickEvent(to);
		threadSleepmethod();
		clickEvent(delhi);
		threadSleepmethod();
		clickEvent(searchFlight);
		threadSleepmethod();
	}
}
