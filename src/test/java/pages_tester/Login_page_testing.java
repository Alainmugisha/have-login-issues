package pages_tester;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import all_pages.Login_page_elements;
import util.BrowserRunner;

public class Login_page_testing {

	WebDriver driver;
	@Test
	public void login_page() throws InterruptedException {
	
	BrowserRunner.init();
	
	
	Login_page_elements loginpage = PageFactory.initElements(driver, Login_page_elements.class);
	
	loginpage.usernamemethod("demo@techfios.com");
	loginpage.passwordmethod("abc123");
	loginpage.signingmethod();
	
	BrowserRunner.closer();
}	
}
