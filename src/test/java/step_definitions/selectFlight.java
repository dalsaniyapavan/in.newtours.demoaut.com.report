package step_definitions;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.SelectFlightPage;

public class selectFlight {
	public WebDriver driver;
	SelectFlightPage objSelectFlight;

	public selectFlight()
	{
		driver = Hooks.driver;
	}

	@Given("^user select Departure Flight$")
	public void user_select_Departure_Flight() throws Throwable {
		new SelectFlightPage(driver).departureFlight();
	}
	@Given("^user select Return Flight$")
	public void user_select_Return_Flight() throws Throwable {
		new SelectFlightPage(driver).returnFlight();
	}
	@Given("^user click on Continue button in Select Flight$")
	public void user_click_on_Continue_button_in_Select_Flight() throws Throwable {

		new SelectFlightPage(driver).clickContinue();
	}
	@Then("^Book a Flight page display$")
	public void Book_a_Flight_page_display() throws Throwable {
		//assertEquals("Select a Flight: Mercury Tours",driver.getTitle());
		System.out.println("Book Flight Page Display");
	}

}
