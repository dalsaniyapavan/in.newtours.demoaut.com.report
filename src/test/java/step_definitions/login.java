package step_definitions;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.LoginPage;
import step_definitions.Hooks;

public class login {
	public WebDriver driver;
	LoginPage objLogin;

	public login()
	{
		driver = Hooks.driver;
	}
	@Given("^User is on the main page of Newtours$")
	public void user_is_on_the_main_page_of_Newtours() throws Throwable {
		System.out.println("User is on the main page");
	}

	@Given("^user enter UserName value$")
	public void user_enter_UserName_value() throws Throwable {
		System.out.println("Call LOGIN");
		new LoginPage(driver).setUserName("demo");
	}

	@Given("^user enter Password value$")
	public void user_enter_Password_value() throws Throwable {
		new LoginPage(driver).setPassword("demo");
	}

	@Given("^user click on Sign-In button$")
	public void user_click_on_Sign_In_button() throws Throwable {
		new LoginPage(driver).clickLogin();
	}

	@Then("^Flight Finder page display$")
	public void flight_Finder_page_display() throws Throwable {
		//assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
		System.out.println("Flight Finder page display...");  
	}
}
