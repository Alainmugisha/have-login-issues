package all_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login_page_elements {

	WebDriver driver;

	public Login_page_elements(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SUBMIT_FIELD;

	public void usernamemethod(String Username) {
		USER_FIELD.sendKeys(Username);
	}

	public void passwordmethod(String Password) {
		PASSWORD_FIELD.sendKeys(Password);

	}

	public void signingmethod() {

		SUBMIT_FIELD.click();
	}

}
