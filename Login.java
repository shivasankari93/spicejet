package page.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.component.Base;

public class Login extends Base {
	@FindBy (xpath = "(//div[@class='css-1dbjc4n r-1jkjb'])[1]")
	WebElement login;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-15d164r r-1mnahxq r-bnwqim']/div[2]/input")
	WebElement phone;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1wyyakw']/div/div[2]/input")
	WebElement password;
	@FindBy (xpath = "//div[@class='css-1dbjc4n r-1wyyakw']/div[3]")
	WebElement loginBtn;
	public Login() {
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() {
		clickEvent(login);
		threadSleepmethod();
		keyInput(phone, "9629447567");
		threadSleepmethod();
		keyInput(password, "testAkshara-user01");
		threadSleepmethod();
		clickEvent(loginBtn);
		
	}
}
