package page.component;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import test.component.Base;

public class SignUp extends Base{
	@FindBy (xpath = "(//div[@class='css-1dbjc4n r-1jkjb'])[2]")
	WebElement signUp;
	@FindBy (xpath = "//div[@class='box-full']/div/div/div/div[2]/select")
	WebElement selectStatus;
	@FindBy (xpath = "//input[@id='first_name']")
	WebElement firstName;
	@FindBy (xpath = "//input[@id='last_name']")
	WebElement lastName;
	@FindBy (xpath = "//div[@class='register-form col-12 col-xl-7 col-lg-8']/div[3]/div/select")
	WebElement country;
	@FindBy (xpath = "//div[@class='react-datepicker-wrapper']/div/input")
	WebElement datePicker;
	@FindBy (xpath = "//div[@class='react-datepicker__month-container']/div[2]/div[3]/div[4]")
	WebElement date;
	@FindBy (xpath = " //div[@class='special-label']/following-sibling::input")
	WebElement phone;
	@FindBy (xpath = "//input[@id='email_id']")
	WebElement email;
	@FindBy (xpath = "//input [@id='new-password']")
	WebElement password;
	@FindBy (xpath = "//input [@id='c-password']")
	WebElement confirmPassword;
	@FindBy (xpath = "//input [@id='defaultCheck1']")
	WebElement checkbox;
	@FindBy (xpath = "//button[@class='btn btn-red']")
	WebElement submit;
	public SignUp() {
		PageFactory.initElements(driver, this);
	}
	public void signUpMethod() {
		String parent = driver.getWindowHandle();
		System.out.println("Parent Window : " + parent);
		clickEvent(signUp);
		threadSleepmethod();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(driver.getCurrentUrl());
		for (String temp : windows) {
			System.out.println(temp);
		}
		// switch to child window
		for (String i : windows) {
			if(  !  (i.equals(parent))  ) {
				driver.switchTo().window(i);
				// perform the operation in the child window
				//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("myemailID");
				System.out.println(driver.getWindowHandle() + " - child window");
			}
			
		}
		// Iteration completed
		//driver.switchTo().window(parent);
		
		

		
		Select sel = new Select(selectStatus);
		sel.selectByIndex(2);
		threadSleepmethod();
		keyInput(firstName, "test");
		threadSleepmethod();
		keyInput(lastName, "user");
		threadSleepmethod();
		pageDownMethod();
//		Select sel1 = new Select(selectStatus);
//		sel1.selectByValue("IN");
//		threadSleepmethod();
		
		clickEvent(datePicker);
		threadSleepmethod();
		clickEvent(date);
		threadSleepmethod();
		keyInput(phone, "9629447567");
		threadSleepmethod();
		keyInput(email, "shivasankari1093@gmail.com");
		threadSleepmethod();
		keyInput(password, "testAkshara-user01");
		threadSleepmethod();
		keyInput(confirmPassword, "testAkshara-user01");
		threadSleepmethod();
		pageDownMethod();
		clickEvent(checkbox);
		threadSleepmethod();
		clickEvent(submit);
		threadSleepmethod();

	}
}
