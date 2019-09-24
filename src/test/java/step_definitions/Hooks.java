package step_definitions;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks{
	public static WebDriver driver;


	@Before
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser Hooks");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurysignon.php");
	}

	@After
	public void closeBrowser() {

		driver.close();

	}

}