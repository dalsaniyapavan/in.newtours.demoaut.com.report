package step_definitions;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.FlightFinderPage;

public class flightFinder {
	public WebDriver driver;
	FlightFinderPage objFlightFinder;

	public flightFinder()
	{
		driver = Hooks.driver;
	}

	@Given("^User is on the Flight Finder page of Newtours$")
	public void user_is_on_the_Flight_Finder_page_of_Newtours() throws Throwable {
		String title=driver.getTitle();
		System.out.println("...TITLE FLIGHT FINDER..."+title);

		//assertEquals("Find a Flight: Mercury Tours:",driver.getTitle());
	}

	@Given("^user enter Passenger value$")
	public void user_enter_Passenger_value() throws Throwable {
		new FlightFinderPage(driver).SetPassanger("2");
	}

	@Given("^user enter Departing From value$")
	public void user_enter_Departing_From_value() throws Throwable {
		new FlightFinderPage(driver).SetfromPort("London");
	}

	@Given("^user enter Arriving In value$")
	public void user_enter_Arriving_In_value() throws Throwable {
		new FlightFinderPage(driver).SettoPort("Paris");
	}

	@Given("^user click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {

		new FlightFinderPage(driver).clickContinue();
	}

	@Then("^Select Flight page display$")
	public void select_Flight_page_display() throws Throwable {
		assertEquals("Select a Flight: Mercury Tours",driver.getTitle());
		//above line is working fine

		//assertEquals("Select a Flight: Mercury Tours",driver.getTitle());
		//Assertion HA = new Assertion();
		//SoftAssert SA= new SoftAssert();

		//	sa.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours1");
		//SA.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours1");
		//HA.assertEquals(driver.getTitle(), "Select a Flight: Mercury Tours1");
	}
}
