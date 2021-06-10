package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class BrowserRunner {
	static WebDriver driver;

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Alain Mickey\\Desktop\\ChromeDriver\\Chrome driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login");
		// driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	@AfterMethod
	public static void closer() throws InterruptedException {

		// WebDriverWait wait = new WebDriverWait(driver, 60);
		// wait.until(ExpectedConditions.visibilityOf(null))
		Thread.sleep(10000);
		driver.close();

	}

}
