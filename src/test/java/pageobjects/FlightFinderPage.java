package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FlightFinderPage {
	public WebDriver driver;
	@FindBy(how = How.NAME, using = "passCount")
	@CacheLookup
	WebElement passCount;

	@FindBy(how = How.NAME, using = "fromPort")
	WebElement fromPort;
	
	@FindBy(how = How.NAME, using = "toPort")
	WebElement toPort;
	
	@FindBy(name="findFlights")
	WebElement continue_btn;

	public FlightFinderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void SetPassanger(String strPassanger)
	{
		//System.out.println("IN....."+strPassanger);
		passCount.sendKeys(strPassanger);
	}
	public void SetfromPort(String strFromPort)
	{
		fromPort.sendKeys(strFromPort);
	}
	public void SettoPort(String strToPort)
	{
		toPort.sendKeys(strToPort);
	}
	public void clickContinue()
	{
		continue_btn.click();
	}
}
