package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlightPage {
	public WebDriver driver;

	@FindBy(name="passFirst0")
	@CacheLookup
	WebElement Passenger1FN;

	@FindBy(name="passFirst1")
	WebElement Passenger2FN;

	@FindBy(name="passLast0")
	WebElement Passenger1LN;

	@FindBy(name="passLast1")
	WebElement Passenger2LN;

	@FindBy(name="buyFlights")
	WebElement SecurePurchase_btn;

	public BookFlightPage(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}
	public void Passenger1FN()
	{
		Passenger1FN.sendKeys("Pavan");

	}
	public void Passenger2FN()
	{
		Passenger2FN.sendKeys("Hetal");

	}
	public void Passenger1LN()
	{
		Passenger1LN.sendKeys("Patel");

	}

	public void Passenger2LN()
	{
		Passenger2LN.sendKeys("dalsaniya");

	}
	public void SecureContinue()
	{
		SecurePurchase_btn.click();
	}
}
