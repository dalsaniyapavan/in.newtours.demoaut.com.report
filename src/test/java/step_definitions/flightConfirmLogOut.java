package step_definitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import pageobjects.FlightConfirmLogOutPage;

public class flightConfirmLogOut {
	public WebDriver driver;
	FlightConfirmLogOutPage objFlightConfirmLogOut;

	public flightConfirmLogOut()
	{
		driver = Hooks.driver;
	}
	
	@Given("^user LOG OUT$")
	public void user_LOG_OUT() throws Throwable {
		//new FlightConfirmLogOutPage(driver).clickSignOff();
	}

	@Then("^Browser Close$")
	public void Browser_Close() throws Throwable {
		
	
	}
	/*
	public void clickSignOff()
	{
		SignOff.click();
	}*/

}
