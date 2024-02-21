package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;

public class RoundTrip extends Base {
//	@FindBy (xpath = "")
//	WebElement ;
	@FindBy (xpath = "(//div[@class='css-1dbjc4n r-18u37iz r-1w6e6rj']/div)[2]/div[1]")
	WebElement roundTrip;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/div/div[1]")
	WebElement fromPlace;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-b5h31w r-95jzfe\"]/div[2]/div[2]/div[2]/div[2]")
	WebElement agra;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-18u37iz r-1g40b8q']/div/div[3]")
	WebElement toPlace;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-b5h31w r-95jzfe\"]/div[2]/div[2]/div[2]/div[1]")
	WebElement delhi;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div/div/div[1]")
	WebElement departureInput;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1euycsn']/div[2]/div/div[2]/div/div[3]/div[2]/div")
	WebElement departureDate;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-19h5ruw r-136ojw6']/div/div/div[2]")
	WebElement returnInput;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1euycsn']/div[2]/div/div[2]/div/div[3]/div[4]/div[2]")
	WebElement returnDate;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c\"]/div[1]")
	WebElement passenger;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-k8qxaj r-d9fdf6']/div/div[2]/div[3]")
	WebElement passengerCount;
	@FindBy (xpath = "//div[@class=\"css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c\"]/div[2]")
	WebElement currency;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[2]/div[2]/div[2]/div/div")
	WebElement currencydetail;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1d09ksm r-1inuy60 r-m611by']/div[2]/div/div/div/div/div")
	WebElement family;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-18u37iz r-1wtj0ep r-1lgpqti']/div[2]/div")
	WebElement searchFlight;
	
	public RoundTrip() {
		PageFactory.initElements(driver, this);
	}
	public void roundTripMethod() {
		clickEvent(roundTrip);
		threadSleepmethod();
		clickEvent(fromPlace);
		threadSleepmethod();
		clickEvent(agra);
		threadSleepmethod();
		clickEvent(toPlace);
		clickEvent(delhi);
		threadSleepmethod();
		threadSleepmethod();
		clickEvent(departureInput);
		threadSleepmethod();
		clickEvent(departureDate);
		threadSleepmethod();
		clickEvent(returnInput);
		threadSleepmethod();
		clickEvent(returnDate);
		threadSleepmethod();
		clickEvent(passenger);
		threadSleepmethod();
		clickEvent(passengerCount);
		threadSleepmethod();
		clickEvent(currency);
		threadSleepmethod();
		clickEvent(currencydetail);
		threadSleepmethod();
		clickEvent(family);
		threadSleepmethod();
		clickEvent(searchFlight);
		threadSleepmethod();
	}
}
