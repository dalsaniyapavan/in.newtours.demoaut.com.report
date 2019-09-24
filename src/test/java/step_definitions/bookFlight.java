package step_definitions;
import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.BookFlightPage;

public class bookFlight {
	public WebDriver driver;
	BookFlightPage objBookFlight;

	public bookFlight()
	{
		driver = Hooks.driver;
	}

	@Given("^user enter First name of First Passenger$")
	public void user_enter_First_name_of_First_Passenger() throws Throwable {
		new BookFlightPage(driver).Passenger1FN();
	}
	@Given("^user enter Last name of First Passenger$")
	public void user_enter_Last_name_of_First_Passenger() throws Throwable {
		new BookFlightPage(driver).Passenger1LN();
	}
	@Given("^user enter First name of Second Passenger$")
	public void user_enter_First_name_of_Second_Passenger() throws Throwable {
		new BookFlightPage(driver).Passenger2FN();
	}
	@Given("^user enter Last name of Second Passenger$")
	public void user_enter_Last_name_of_Second_Passenger() throws Throwable {
		new BookFlightPage(driver).Passenger2LN();
	}
	@Given("^user click on Secure Purchase$")
	public void user_click_on_Secure_Purchase() throws Throwable {
		new BookFlightPage(driver).SecureContinue();
	}

	@Then("^Flight Confirmation page display$")
	public void Flight_Confirmation_page_display() throws Throwable {
		assertEquals("Flight Confirmation: Mercury Tours",driver.getTitle());
	}

}
