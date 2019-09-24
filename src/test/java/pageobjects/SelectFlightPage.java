package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectFlightPage {
	public WebDriver driver;

	@FindBy(how = How.XPATH, using = "(//input[contains(@value, 'Pangea ')])[1]")
	@CacheLookup
	WebElement departradioButton;

	@FindBy(how = How.XPATH, using = "(//input[contains(@value, 'Unified ')])[2]")
	WebElement returnFlightRadioButton;
	
	@FindBy(name="reserveFlights")
	WebElement continue_btn;

	public SelectFlightPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	public void departureFlight()
	{
		departradioButton.click();
		//departradioButton.get(0).isSelected();
		System.out.println("Departure Flight...");
	}
	public void returnFlight()
	{
		returnFlightRadioButton.click();
		System.out.println("Return Flight...");
	}
	public void clickContinue()
	{
		continue_btn.click();
	}
}
