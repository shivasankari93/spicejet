package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;

public class Checkin extends Base {
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-1d09ksm r-qklmqi r-1lz4bg0 r-1phboty r-18u37iz\"]/div[2]")
	WebElement checkIn;
	@FindBy (xpath = "(//div[@class=\"css-1dbjc4n r-18u37iz r-1ifxtd0 r-6ity3w\"]/div/div)[2]/input")
	WebElement ticketNumber;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-18u37iz r-1ifxtd0 r-6ity3w\"]/div[2]/div[2]/input")
	WebElement email;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-1pcd2l5 r-1uwte3a\"]/div[3]")
	WebElement searchBooking;
	public Checkin() {
		PageFactory.initElements(driver, this);
	}
	public void checkinMethod() {
		clickEvent(checkIn);
		threadSleepmethod();
		keyInput(ticketNumber, "W3X3H8");
		threadSleepmethod();
		keyInput(email, "shivasankari1093@gmail.cm");
		threadSleepmethod();
		clickEvent(searchBooking);
		threadSleepmethod();
	}
}
